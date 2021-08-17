package by.minsk.epam.jio.DAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;
import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.minsk.epam.jio.exception.RegisterException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DataBase {

	private static Scanner sc = new Scanner(System.in);
	private String directoryAccounts = "";
	private String directoryDatabase = "";
	private DocumentBuilderFactory docf = DocumentBuilderFactory.newInstance();
	private DocumentBuilder docb;
	{
		try {
			docb = docf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	private Document doc = docb.newDocument();
	private Document docAcc = docb.newDocument();

	private void create() {
		
		System.out.println("Введи"
				+ "те путь к файлам.");
		String directory = "";
		while (true) {
			directory = sc.nextLine();
			if (Pattern.matches("([A-Za-z]:){1}(\\\\{1}[^|?/:\"<>*]*\\\\?)", 
								directory)) {
				break;
			} else {
				System.out.println("Неверный путь.");
			}
		}
		
		directory = directory.trim();
		if (!directory.endsWith("\\")) {
			directory += "\\";
		}
		
		this.directoryAccounts = directory + "Accounts.xml";
		this.directoryDatabase = directory + "Database.xml";
		
		try {
			TransformerFactory tr = TransformerFactory.newInstance();
			Transformer t = tr.newTransformer();
			this.docb = this.docf.newDocumentBuilder();
			Files.createDirectories(Paths.get(directory));
			if (Files.notExists(Paths.get(directory + "Database.xml"))) {
				Files.createFile(Paths.get(directory + "Database.xml"));
				this.doc = this.docb.newDocument();
				this.doc.appendChild(this.doc.createElement("root"));
				t.setOutputProperty(OutputKeys.INDENT, "yes");
				t.transform(new DOMSource(this.doc), 
							new StreamResult(this.directoryDatabase));
			} else {
				this.doc = this.docb.parse(this.directoryDatabase);
			}
			if (Files.notExists(Paths.get(directory + "Accounts.xml"))) {
				Files.createFile(Paths.get(directory + "Accounts.xml"));
				this.docAcc = this.docb.newDocument();
				this.docAcc.appendChild(this.docAcc.createElement("root"));
				t.setOutputProperty(OutputKeys.INDENT, "yes");
				t.transform(new DOMSource(this.docAcc), 
							new StreamResult(this.directoryAccounts));
			} else {
				this.docAcc = this.docb.parse(this.directoryAccounts);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	public DataBase() {
		this.create();
	}

	public void addStudent(String name, String surname, String patronymic, 
			String faculty, String group, String description) {
		
		TransformerFactory tr = TransformerFactory.newInstance();
		
		try {
			Node s = this.doc.createElement("Student");
			s.appendChild(this.doc.createElement("surname"))
									.setTextContent(surname.trim());
			s.appendChild(this.doc.createElement("name"))
									.setTextContent(name.trim());
			s.appendChild(this.doc.createElement("patronymic"))
									.setTextContent(patronymic.trim());
			s.appendChild(this.doc.createElement("faculty"))
									.setTextContent(faculty.trim());
			s.appendChild(this.doc.createElement("group"))
									.setTextContent(group.trim());
			s.appendChild(this.doc.createElement("description"))
									.setTextContent(description.trim());
			this.doc.getDocumentElement().appendChild(s);
			Transformer t = tr.newTransformer();
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.transform(new DOMSource(this.doc), 
						new StreamResult(this.directoryDatabase));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	public void addAccount(String name, 
						   String password) throws RegisterException {
		
		try {
			this.docAcc = this.docb.parse(this.directoryAccounts);
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if (!this.docAcc.getDocumentElement().hasChildNodes()) {
			TransformerFactory tr = TransformerFactory.newInstance();
			try {
				Node s = this.docAcc.createElement("Account");
				((Element) s).setAttribute("admin", "no");
				s.appendChild(this.docAcc.createElement("name"))
											.setTextContent(name.trim());
				s.appendChild(this.docAcc.createElement("password"))
											.setTextContent(password.trim());
				this.docAcc.getDocumentElement().appendChild(s);
				Transformer t = tr.newTransformer();
				t.setOutputProperty(OutputKeys.INDENT, "yes");
				t.transform(new DOMSource(this.docAcc), 
							new StreamResult(this.directoryAccounts));
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		} else {
			NodeList names = ((Element) this.docAcc
											.getDocumentElement())
											.getElementsByTagName("name");
			NodeList passwords = ((Element) this.docAcc
												.getDocumentElement())
												.getElementsByTagName("password");
			boolean check = false;
			for (int i = 0; i < names.getLength(); i++) {
				if (names.item(i).getTextContent().matches(name)
						| passwords.item(i).getTextContent()
												.matches(password)) {
					check = true;
					break;
				}
			}
			if (check == true) {
				throw new RegisterException("Учётная запись с таким имнем или "
											+ "паролем уже существует.");
			} else {
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Node s = this.docAcc.createElement("Account");
					((Element) s).setAttribute("admin", "no");
					s.appendChild(this.docAcc.createElement("name"))
												.setTextContent(name.trim());
					s.appendChild(this.docAcc.createElement("password"))
												.setTextContent(password
																	.trim());
					this.docAcc.getDocumentElement().appendChild(s);
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.docAcc), 
								new StreamResult(this.directoryAccounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void giveAdminRights(String name) {
		
		try {
			this.docAcc = this.docb.parse(this.directoryAccounts);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		NodeList list = this.docAcc.getDocumentElement()
										.getElementsByTagName("name");
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getChildNodes()
								.item(0).getNodeValue()
											.trim().matches(name.trim())) {
				((Element) this.docAcc.getDocumentElement()
										.getElementsByTagName("Account")
											.item(i)).setAttribute("admin", 
																   "yes");
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.docAcc), 
								new StreamResult(this.directoryAccounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	public void takeAdminRights(String name) {
		
		try {
			this.docAcc = this.docb.parse(this.directoryAccounts);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		NodeList list = this.docAcc.getDocumentElement()
										.getElementsByTagName("name");
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getChildNodes().item(0)
												.getNodeValue()
													.trim()
														.matches(name.trim())) {
				((Element) this.docAcc.getDocumentElement()
											.getElementsByTagName("Account")
												.item(i)).setAttribute("admin",
																	   "no");
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.docAcc), 
								new StreamResult(this.directoryAccounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	public String showStudent(String name, String surname, String patronymic) {
		
		try {
			this.doc = this.docb.parse(this.directoryDatabase);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String student = "";
		NodeList students_n = this.doc.getDocumentElement()
											.getElementsByTagName("name");
		NodeList students_s = this.doc.getDocumentElement()
											.getElementsByTagName("surname");
		NodeList students_p = this.doc.getDocumentElement()
											.getElementsByTagName("patronymic");
		NodeList students_g = this.doc.getDocumentElement()
											.getElementsByTagName("group");
		NodeList students_f = this.doc.getDocumentElement()
											.getElementsByTagName("faculty");
		NodeList students_d = this.doc.getDocumentElement()
											.getElementsByTagName("description");
		
		for (int i = 0; i < students_n.getLength(); i++) {
			if (students_s.item(i).getTextContent().matches(surname) 
					& students_n.item(i).getTextContent().matches(name)
					& students_p.item(i).getTextContent().matches(patronymic)) {
				student = students_s.item(i).getTextContent() + " " 
						  + students_n.item(i).getTextContent() + " "
						  + students_p.item(i).getTextContent() + " " 
						  + "Группа: " + students_g.item(i).getTextContent()
						  + " " + "Факультет: " 
						  + students_f.item(i).getTextContent() + " " 
						  + "Информация: " + students_d.item(i).getTextContent();
				break;
			}
		}
		if (student.isEmpty()) {
			student = "Такой студент не зарегистрирован.";
		}
		return student;
	}

	public void editStudent(String surname, String name, String patronymic, 
			String newFaculty, String newGroup, String newDescription) {
		
		try {
			this.doc = this.docb.parse(this.directoryDatabase);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		NodeList students = this.doc.getElementsByTagName("Student");
		for (int i = 0; i < students.getLength(); i++) {
			if (((Element) students.item(i)).getElementsByTagName("surname")
												.item(0).getTextContent()
													.trim()
														.matches(surname.trim())
					& ((Element) students.item(i)).getElementsByTagName("name")
												.item(0).getTextContent()
													.trim().matches(name.trim())
					& ((Element) students.item(i))
											.getElementsByTagName("patronymic")
												.item(0)
													.getTextContent()
														.trim()
															.matches(patronymic
																		.trim())) {
				this.doc.getElementsByTagName("faculty")
							.item(i).setTextContent(newFaculty);
				this.doc.getElementsByTagName("group")
							.item(i).setTextContent(newGroup);
				this.doc.getElementsByTagName("description")
							.item(i).setTextContent(newDescription);
				
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.doc), new StreamResult(this.directoryDatabase));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	public boolean[] checkAccount(String name, String password) {
		try {
			this.doc = this.docb.parse(this.directoryDatabase);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean[] check = { false, false };
		NodeList accountNames = this.docAcc.getElementsByTagName("name");
		NodeList accountPasswords = this.docAcc
											.getElementsByTagName("password");
		for (int i = 0; i < accountNames.getLength(); i++) {
			if (accountNames.item(i).getTextContent().matches(name)
					& accountPasswords.item(i).getTextContent()
													.matches(password)) {
				check[0] = true;
				if (((Element) accountNames.item(i).getParentNode())
														.getAttribute("admin")
															.matches("yes")) {
					check[1] = true;
				}
				break;
			}
		}
		return check;
	}
}
