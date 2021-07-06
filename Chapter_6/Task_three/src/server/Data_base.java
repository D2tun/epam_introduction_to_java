package server;

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

public class Data_base {

	private static Scanner sc = new Scanner(System.in);
	private String directory_accounts = "";
	private String directory_database = "";
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
	private Document doc_acc = docb.newDocument();

	private void create() {
		System.out.println("Введите путь к файлам.");
		String directory = "";
		while (true) {
			directory = sc.nextLine();
			if (Pattern.matches("([A-Za-z]:){1}(\\\\{1}[^|?/:\"<>*]*\\\\?)", directory)) {
				break;
			} else {
				System.out.println("Неверный путь.");
			}
		}
		directory = directory.trim();
		if (!directory.endsWith("\\")) {
			directory += "\\";
		}
		this.directory_accounts = directory + "Accounts.xml";
		this.directory_database = directory + "Database.xml";
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
				t.transform(new DOMSource(this.doc), new StreamResult(this.directory_database));
			} else {
				this.doc = this.docb.parse(this.directory_database);
			}
			if (Files.notExists(Paths.get(directory + "Accounts.xml"))) {
				Files.createFile(Paths.get(directory + "Accounts.xml"));
				this.doc_acc = this.docb.newDocument();
				this.doc_acc.appendChild(this.doc_acc.createElement("root"));
				t.setOutputProperty(OutputKeys.INDENT, "yes");
				t.transform(new DOMSource(this.doc_acc), new StreamResult(this.directory_accounts));
			} else {
				this.doc_acc = this.docb.parse(this.directory_accounts);
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

	protected Data_base() {
		this.create();
	}

	protected void add_student(String name, String surname, String patronymic, String faculty, String group,
			String description) {
		TransformerFactory tr = TransformerFactory.newInstance();
		try {
			Node s = this.doc.createElement("Student");
			s.appendChild(this.doc.createElement("surname")).setTextContent(surname.trim());
			s.appendChild(this.doc.createElement("name")).setTextContent(name.trim());
			s.appendChild(this.doc.createElement("patronymic")).setTextContent(patronymic.trim());
			s.appendChild(this.doc.createElement("faculty")).setTextContent(faculty.trim());
			s.appendChild(this.doc.createElement("group")).setTextContent(group.trim());
			s.appendChild(this.doc.createElement("description")).setTextContent(description.trim());
			this.doc.getDocumentElement().appendChild(s);
			Transformer t = tr.newTransformer();
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.transform(new DOMSource(this.doc), new StreamResult(this.directory_database));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	protected void add_account(String name, String password) throws Register_exception {
		try {
			this.doc_acc = this.docb.parse(this.directory_accounts);
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!this.doc_acc.getDocumentElement().hasChildNodes()) {
			TransformerFactory tr = TransformerFactory.newInstance();
			try {
				Node s = this.doc_acc.createElement("Account");
				((Element) s).setAttribute("admin", "no");
				s.appendChild(this.doc_acc.createElement("name")).setTextContent(name.trim());
				s.appendChild(this.doc_acc.createElement("password")).setTextContent(password.trim());
				this.doc_acc.getDocumentElement().appendChild(s);
				Transformer t = tr.newTransformer();
				t.setOutputProperty(OutputKeys.INDENT, "yes");
				t.transform(new DOMSource(this.doc_acc), new StreamResult(this.directory_accounts));
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		} else {
			NodeList names = ((Element) this.doc_acc.getDocumentElement()).getElementsByTagName("name");
			NodeList passwords = ((Element) this.doc_acc.getDocumentElement()).getElementsByTagName("password");
			boolean check = false;
			for (int i = 0; i < names.getLength(); i++) {
				if (names.item(i).getTextContent().matches(name)
						| passwords.item(i).getTextContent().matches(password)) {
					check = true;
					break;
				}
			}
			if (check == true) {
				throw new Register_exception("Учётная запись с таким имнем или паролем уже существует.");
			} else {
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Node s = this.doc_acc.createElement("Account");
					((Element) s).setAttribute("admin", "no");
					s.appendChild(this.doc_acc.createElement("name")).setTextContent(name.trim());
					s.appendChild(this.doc_acc.createElement("password")).setTextContent(password.trim());
					this.doc_acc.getDocumentElement().appendChild(s);
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.doc_acc), new StreamResult(this.directory_accounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void give_admin_rights(String name) {
		try {
			this.doc_acc = this.docb.parse(this.directory_accounts);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		NodeList list = this.doc_acc.getDocumentElement().getElementsByTagName("name");
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getChildNodes().item(0).getNodeValue().trim().matches(name.trim())) {
				((Element) this.doc_acc.getDocumentElement().getElementsByTagName("Account").item(i))
						.setAttribute("admin", "yes");
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.doc_acc), new StreamResult(this.directory_accounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	protected void take_admin_rights(String name) {
		try {
			this.doc_acc = this.docb.parse(this.directory_accounts);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		NodeList list = this.doc_acc.getDocumentElement().getElementsByTagName("name");
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getChildNodes().item(0).getNodeValue().trim().matches(name.trim())) {
				((Element) this.doc_acc.getDocumentElement().getElementsByTagName("Account").item(i))
						.setAttribute("admin", "no");
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.doc_acc), new StreamResult(this.directory_accounts));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	protected String show_student(String name, String surname, String patronymic) {
		try {
			this.doc = this.docb.parse(this.directory_database);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String student = "";
		NodeList students_n = this.doc.getDocumentElement().getElementsByTagName("name");
		NodeList students_s = this.doc.getDocumentElement().getElementsByTagName("surname");
		NodeList students_p = this.doc.getDocumentElement().getElementsByTagName("patronymic");
		NodeList students_g = this.doc.getDocumentElement().getElementsByTagName("group");
		NodeList students_f = this.doc.getDocumentElement().getElementsByTagName("faculty");
		NodeList students_d = this.doc.getDocumentElement().getElementsByTagName("description");
		for (int i = 0; i < students_n.getLength(); i++) {
			if (students_s.item(i).getTextContent().matches(surname) & students_n.item(i).getTextContent().matches(name)
					& students_p.item(i).getTextContent().matches(patronymic)) {
				student = students_s.item(i).getTextContent() + " " + students_n.item(i).getTextContent() + " "
						+ students_p.item(i).getTextContent() + " " + "Группа: " + students_g.item(i).getTextContent()
						+ " " + "Факультет: " + students_f.item(i).getTextContent() + " " + "Информация: "
						+ students_d.item(i).getTextContent();
				break;
			}
		}
		if (student.isEmpty()) {
			student = "Такой студент не зарегистрирован.";
		}
		return student;
	}

	protected void edit_student(String surname, String name, String patronymic, String new_faculty, String new_group,
			String new_description) {
		try {
			this.doc = this.docb.parse(this.directory_database);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		NodeList students = this.doc.getElementsByTagName("Student");
		for (int i = 0; i < students.getLength(); i++) {
			if (((Element) students.item(i)).getElementsByTagName("surname").item(0).getTextContent().trim()
					.matches(surname.trim())
					& ((Element) students.item(i)).getElementsByTagName("name").item(0).getTextContent().trim()
							.matches(name.trim())
					& ((Element) students.item(i)).getElementsByTagName("patronymic").item(0).getTextContent().trim()
							.matches(patronymic.trim())) {
				this.doc.getElementsByTagName("faculty").item(i).setTextContent(new_faculty);
				this.doc.getElementsByTagName("group").item(i).setTextContent(new_group);
				this.doc.getElementsByTagName("description").item(i).setTextContent(new_description);
				TransformerFactory tr = TransformerFactory.newInstance();
				try {
					Transformer t = tr.newTransformer();
					t.setOutputProperty(OutputKeys.INDENT, "yes");
					t.transform(new DOMSource(this.doc), new StreamResult(this.directory_database));
				} catch (TransformerConfigurationException e) {
					e.printStackTrace();
				} catch (TransformerException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

	protected boolean[] check_account(String name, String password) {
		try {
			this.doc = this.docb.parse(this.directory_database);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean[] check = { false, false };
		NodeList account_names = this.doc_acc.getElementsByTagName("name");
		NodeList account_passwords = this.doc_acc.getElementsByTagName("password");
		for (int i = 0; i < account_names.getLength(); i++) {
			if (account_names.item(i).getTextContent().matches(name)
					& account_passwords.item(i).getTextContent().matches(password)) {
				check[0] = true;
				if (((Element) account_names.item(i).getParentNode()).getAttribute("admin").matches("yes")) {
					check[1] = true;
				}
				break;
			}
		}
		return check;
	}
}
