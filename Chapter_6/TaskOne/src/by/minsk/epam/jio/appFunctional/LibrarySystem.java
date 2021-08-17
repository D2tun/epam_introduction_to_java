package by.minsk.epam.jio.appFunctional;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.io.File;
import java.util.Scanner;
import javax.mail.Session;
import javax.mail.internet.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import by.minsk.epam.jio.bean.Book;
import by.minsk.epam.jio.bean.User;
import javax.mail.*;

public class LibrarySystem {

	private Path pathCatalog = Path.of("");
	private Path pathAccounts = Path.of("");
	private List<User> logged;

	public LibrarySystem(String directory) {
		
		this.logged = new ArrayList<User>();
		directory = directory.trim();
		if (!directory.endsWith("\\")) {
			directory += "\\";
		}
		this.pathAccounts = this.pathAccounts
								.resolve(directory
										+ "\\homeLibrary\\Accounts.txt");
		File homeLibrary = new File(directory + "\\homeLibrary");
		if (!homeLibrary.exists()) {
			homeLibrary.mkdir();
		}
		this.pathCatalog = this.pathCatalog
								.resolve(directory 
										+ "\\homeLibrary\\Catalog.txt");
		File Catalog = new File(directory + "\\homeLibrary\\Catalog.txt");
		try {
			if (!Catalog.exists()) {
				Catalog.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Такой файл уже существует.");
		}

		File Accounts = new File(directory + "\\homeLibrary\\Accounts.txt");
		try {
			if (!Accounts.exists()) {
				Accounts.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Такой файл уже существует.");
		}
	}

	public void registration() {
		
		Scanner sc = new Scanner(System.in);
		String eMail = "";
		boolean check = false;
		boolean checkG = false;
		
		while (checkG == false) {
			System.out.println("Регистрация.\nВведите e-mail.");
			while (check == false) {
				eMail = sc.nextLine();
				eMail = eMail.trim();
				if (eMail.matches("(\\w+)[@]{1}([A-Za-z]+)\\.([A-Za-z]+)")) {
					check = true;
				} else {
					System.out.println("Неверные данные, повторите ввод.");
				}
			}
			
			String password = "";
			System.out.println("Введите пароль.");
			check = false;
			while (check == false) {
				password = sc.nextLine();
				if (password.isBlank()) {
					System.out.println("Пароль не может быть пустой строкой, "
									  + "повторите ввод");
				} else {
					check = true;
				}
			}
			
			String key = this.createKey(password);
			check = false;
			try {
				String s = Files.readString(pathAccounts) + "\n";
				if (s.contains(eMail)) {
					System.out.println("Учётная запись с таким e-mail уже "
									  + "существует");
				} else if (s.contains(key)) {
					System.out.println("Учётная запись с таким паролем уже "
									  + "существует");
				} else {
					Files.writeString(pathAccounts, s + eMail + "," + key 
									 + ",;\n");
					checkG = true;
				}
				
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
		}
	}

	private String createKey(String password) {
		
		Double key = 0.0;
		byte[] q = password.getBytes();
		for (int i = 0; i < password.length(); i++) {
			key += q[i] - 1;
		}
		key /= password.length();
		String KEY = "";
		KEY = Double.toHexString(key);
		KEY = KEY.replaceFirst("\\d[x]\\d\\.", "");
		return KEY;
	}

	public User logIn() {
		
		String content = "";
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		User user = null;
		
		while (check == false) {
			System.out.println("Введите e-mail.");
			String eMail = sc.nextLine();
			System.out.println("Введите пароль.");
			String password = sc.nextLine();
			try {
				content = Files.readString(this.pathAccounts);
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
			
			String[] c = content.split(";");
			String k = this.createKey(password);
			for (int i = 0; i < c.length; i++) {
				if (c[i].contains(eMail) & c[i].contains(k)) {
					user = new User(eMail, password);
					if (c[i].contains("admin")) {
						user.setAdmin(true);
					}
					logged.add(user);
					check = true;
					break;
				}
			}
			if (user == null) {
				System.out.println("Неверные данные учётной записи.");
			}
		}
		return user;
	}

	public void logOut(User user) {
		if (this.logged.contains(user)) {
			for (int i = 0; i < this.logged.size(); i++) {
				if (this.logged.get(i).equals(user)) {
					this.logged.remove(i);
					break;
				}
			}
		}
	}

	public void setAdmin(User user) {
		
		String base = "";
		try {
			base = Files.readString(pathAccounts);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
		
		String[] ac = base.split("[;]");
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].contains(user.getEmail())) {
				StringBuilder b = new StringBuilder(ac[i]);
				if (ac[i].contains("admin")) {
				} else {
					b.append("admin");
					ac[i] = b.toString();
					user.setAdmin(true);
				}
				break;
			}
		}
		
		base = "";
		for (int i = 0; i < ac.length; i++) {
			base += ac[i] + ";";
		}
		
		try {
			Files.writeString(pathAccounts, base);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
	}

	public void unsetAdmin(User user) {
		String base = "";
		try {
			base = Files.readString(pathAccounts);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
		String[] ac = base.split("[;]");
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].contains("admin")) {
				String[] acc = ac[i].split(",");
				ac[i] = acc[0] + "," + acc[2] + ",";
				user.setAdmin(false);
				break;
			}
		}
		base = "";
		for (int i = 0; i < ac.length; i++) {
			base += ac[i] + ";";
		}
		try {
			Files.writeString(pathAccounts, base);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
	}

	public void addBook(User user) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название книги.");
		String title = sc.nextLine();
		System.out.println("Введите исполнение книги (электронное, бумажное, "
						  + "оба).");
		String type = sc.nextLine();
		type = type.toLowerCase();
		type = type.trim();
		
		boolean electronic = false;
		boolean paper = false;
		int number = 0;
		boolean check = false;
		boolean iCheck = false;
		
		while (check == false) {
			switch (type) {
			case "электронное": 
				electronic = true;
				check = true;
				break;
			
			case "бумажное": 
				paper = true;
				check = true;
				System.out.println("Введите количество экземпляров.");
				iCheck = false;
				while (iCheck == false) {
					number = sc.nextInt();
					if (number > 0) {
						iCheck = true;
					} else {
						System.out.println("Количесвто должно быть больше "
										  + "нуля.");
					}
				}
				break;
			
			case "оба": 
				paper = true;
				electronic = true;
				check = true;
				System.out.println("Введите количество экземпляров.");
				iCheck = false;
				while (iCheck == false) {
					number = sc.nextInt();
					if (number > 0) {
						iCheck = true;
					} else {
						System.out.println("Количесвто должно быть больше "
										  + "нуля.");
					}
				}
				break;
			
			default: 
				System.out.println("Неверные данные, повторите ввод");
				break;
			}
		}
		
		Book book = new Book(title, electronic, paper, number);
		if (user.getAdmin() == true) {
			String s = "";
			try {
				s = Files.readString(this.pathCatalog);
				s += book.toString() + ";";
				Files.writeString(pathCatalog, s);
			} catch (IOException e) {
				System.out.println("Библиотека не найдена");
			}
			Properties property = System.getProperties();
			property.setProperty("mail.smtp.host", "smtp.yandex.ru");
			property.setProperty("mail.smtp.user", "homeLibrary");
			property.setProperty("mail.smtp.port", "465");
			property.setProperty("mail.smtp.ssl.enable", "true");
			property.setProperty("mail.smtp.auth", "true");
			property.setProperty("mail.smtp.socketFactory.class", 
								 "javax.net.ssl.SSLSocketFactory");
			Authenticator lib = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("yourhomelibrary@yandex.by", 
													  "123456789qwerty!*");
				}
			};
			Session session = Session.getDefaultInstance(property, lib);
			try {
				MimeMessage mime = new MimeMessage(session);
				mime.setFrom("homelibrary78@yandex.by");
				mime.setSubject("New book added");
				String g = Files.readString(pathAccounts);
				String[] g1 = g.split("[;]");
				for (int i = 0; i < g1.length; i++) {
					String[] g2 = g1[i].split("[,]");
					mime.addRecipient(Message.RecipientType.TO, 
									  new InternetAddress(g2[0]));
				}
				mime.setText("Добавлена новая книга:\n" + book.toString());
				Transport.send(mime);
			} catch (MessagingException m) {
				m.printStackTrace();
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
		} else {
			Properties property = System.getProperties();
			property.setProperty("mail.smtp.host", "smtp.yandex.ru");
			property.setProperty("mail.smtp.user", "homeLibrary");
			property.setProperty("mail.smtp.port", "465");
			property.setProperty("mail.smtp.ssl.enable", "true");
			property.setProperty("mail.smtp.auth", "true");
			property.setProperty("mail.smtp.socketFactory.class", 
								 "javax.net.ssl.SSLSocketFactory");
			Authenticator lib = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("yourhomelibrary@yandex.by", 
													  "123456789qwerty!*");
				}
			};
			Session session = Session.getDefaultInstance(property, lib);
			try {
				MimeMessage mime = new MimeMessage(session);
				mime.setFrom(user.getEmail());
				mime.setSubject("New book");
				String g = Files.readString(pathAccounts);
				String[] g1 = g.split("[;]");
				for (int i = 0; i < g1.length; i++) {
					String[] g2 = g1[i].split("[,]");
					if (g2[2].contains("admin")) {
						mime.addRecipient(Message.RecipientType.TO, 
										  new InternetAddress(g2[0]));
					}
				}
				mime.setText("Пользователь " + user.getEmail()
							+ " предлагает добавить:\n" + book.toString());
				Transport.send(mime);
			} catch (MessagingException m) {
				m.printStackTrace();
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
			System.out.println("Запрос на добавление книги отправлен "
							  + "администратору.");
		}
	}

	public void showBooks() {
		
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		String command = "";
		String[] content = null;
		int pageQuantity;
		
		try {
			String catalog = Files.readString(this.pathCatalog);
			content = catalog.split("[;]");
		} catch (IOException e) {
			System.out.println("База данных не найдена.");
		}
		
		if (content.length % 5 == 0) {
			pageQuantity = content.length / 5;
		} else {
			pageQuantity = (content.length / 5) + 1;
		}
		
		String[][] page = new String[5][pageQuantity];
		for (int i = 0, j = 0, k = 0; i < content.length; i++, k++) {
			if (k > 4) {
				k = 0;
				j++;
			}
			page[k][j] = content[i];
		}
		
		int pageNumber = 0;
		
		while (check == false) {
			for (int i = 0; i < page.length; i++) {
				if (page[i][pageNumber] != null) {
					System.out.println(page[i][pageNumber]);
				}
			}
			System.out.println("Введите команду");
			if (pageNumber == 0) {
				System.out.println("- следующая страница\n" + "- выход");
				command = sc.nextLine();
				switch (command) {
				case "следующая страница": 
					pageNumber++;
					break;
				
				case "выход": 
					check = true;
					break;
				
				default: 
					System.out.println("Неверный запрос.");
					break;
				
				}
			} else if ((pageNumber > 0) & (pageNumber < pageQuantity - 1)) {
				System.out.println("- следующая страница\n" 
								  + "- предыдущая страница\n" + "- выход");
				command = sc.nextLine();
					
				switch (command) {
				case "следующая страница": 
					pageNumber++;
					break;
					
				case "предыдущая страница": 
					pageNumber--;
					break;
					
				case "выход": 
					check = true;
					break;
					
				default: 
					System.out.println("Неверный запрос.");
					break;
				}
			} else {
				if (pageNumber == pageQuantity - 1) {
					System.out.println("- предыдущая страница\n" + "- выход");
					command = sc.nextLine();
					switch (command) {
					case "предыдущая страница": 
						pageNumber--;
						break;
					
					case "выход": 
						check = true;
						break;
					
					default: 
						System.out.println("Неверный запрос.");
						break;
						
					}
				}
			}
		}
	}

	public void findBook() {
		
		String catalog = "";
		System.out.println("Введите название книги.");
		Scanner sc = new Scanner(System.in);
		String findString = sc.nextLine();
		
		try {
			catalog = Files.readString(pathCatalog);
		} catch (IOException e) {
			System.out.println("Библиотека не найдена.");
		}
		
		String[] content = catalog.split("[;]");
		for (int i = 0; i < content.length; i++) {
			if (content[i].contains(findString)) {
				System.out.println(content[i]);
				break;
			}
			if ((i == content.length - 1) & !content[i].contains(findString)) {
				System.out.println("Такой книги в данной библеотеке нет.");
			}
		}
	}
}
