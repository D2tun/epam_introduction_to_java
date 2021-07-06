package home_library;

import java.nio.file.Files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.mail.Session;
import javax.mail.internet.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import com.sun.mail.smtp.*;
import javax.mail.*;

public class Library_system {

	private Path path_catalog = Path.of("");
	private Path path_accounts = Path.of("");
	private List<User> logged;

	public Library_system(String directory) {
		this.logged = new ArrayList<User>();
		directory = directory.trim();
		if (!directory.endsWith("\\")) {
			directory += "\\";
		}
		this.path_accounts = this.path_accounts.resolve(directory + "\\home_library\\Accounts.txt");
		File home_library = new File(directory + "\\home_library");
		if (!home_library.exists()) {
			home_library.mkdir();
		}
		this.path_catalog = this.path_catalog.resolve(directory + "\\home_library\\Catalog.txt");
		File Catalog = new File(directory + "\\home_library\\Catalog.txt");
		try {
			if (!Catalog.exists()) {
				Catalog.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Такой файл уже существует.");
		}

		File Accounts = new File(directory + "\\home_library\\Accounts.txt");
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
		String e_mail = "";
		boolean check = false;
		boolean check_g = false;
		while (check_g == false) {
			System.out.println("Регистрация.\nВведите e-mail.");
			while (check == false) {
				e_mail = sc.nextLine();
				e_mail = e_mail.trim();
				if (e_mail.matches("(\\w+)[@]{1}([A-Za-z]+)\\.([A-Za-z]+)")) {
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
					System.out.println("Пароль не может быть пустой строкой, повторите ввод");
				} else {
					check = true;
				}
			}
			String key = this.create_key(password);
			check = false;
			try {
				String s = Files.readString(path_accounts) + "\n";
				if (s.contains(e_mail)) {
					System.out.println("Учётная запись с таким e-mail уже существует");
				} else {
					if (s.contains(key)) {
						System.out.println("Учётная запись с таким паролем уже существует");
					} else {
						Files.writeString(path_accounts, s + e_mail + "," + key + ",;\n");
						check_g = true;
					}
				}
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
		}
	}

	private String create_key(String password) {
		Double key = 0.0;
		byte[] q = password.getBytes();
		for (int i = 0; i < password.length(); i++) {
			key += q[i] - 1;
		}
		key /= password.length();
		String KEY = "";
		KEY = key.toHexString(key);
		KEY = KEY.replaceFirst("\\d[x]\\d\\.", "");
		return KEY;
	}

	public User log_in() {
		String content = "";
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		User user = null;
		while (check == false) {
			System.out.println("Введите e-mail.");
			String e_mail = sc.nextLine();
			System.out.println("Введите пароль.");
			String password = sc.nextLine();
			try {
				content = Files.readString(path_accounts);
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
			String[] c = content.split(";");
			String k = this.create_key(password);
			for (int i = 0; i < c.length; i++) {
				if (c[i].contains(e_mail) & c[i].contains(k)) {
					user = new User(e_mail, password);
					if (c[i].contains("admin")) {
						user.give_admin();
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

	public void log_out(User user) {
		if (this.logged.contains(user)) {
			for (int i = 0; i < this.logged.size(); i++) {
				if (this.logged.get(i).equals(user)) {
					this.logged.remove(i);
					break;
				}
			}
		}
	}

	public void set_admin(User user) {
		String base = "";
		try {
			base = Files.readString(path_accounts);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
		String[] ac = base.split("[;]");
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].contains(user.get_email())) {
				StringBuilder b = new StringBuilder(ac[i]);
				if (ac[i].contains("admin")) {
				} else {
					b.append("admin");
					ac[i] = b.toString();
					user.give_admin();
				}
				break;
			}
		}
		base = "";
		for (int i = 0; i < ac.length; i++) {
			base += ac[i] + ";";
		}
		try {
			Files.writeString(path_accounts, base);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
	}

	public void unset_admin(User user) {
		String base = "";
		try {
			base = Files.readString(path_accounts);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
		String[] ac = base.split("[;]");
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].contains("admin")) {
				String[] acc = ac[i].split(",");
				ac[i] = acc[0] + "," + acc[2] + ",";
				user.take_admin();
				break;
			}
		}
		base = "";
		for (int i = 0; i < ac.length; i++) {
			base += ac[i] + ";";
		}
		try {
			Files.writeString(path_accounts, base);
		} catch (IOException e) {
			System.out.println("База данных не найдена");
		}
	}

	public void add_book(User user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название книги.");
		String title = sc.nextLine();
		System.out.println("Введите исполнение книги (электронное, бумажное, оба).");
		String type = sc.nextLine();
		type = type.toLowerCase();
		type = type.trim();
		boolean electronic = false;
		boolean paper = false;
		int number = 0;
		boolean check = false;
		while (check == false) {
			switch (type) {
			case "электронное": {
				electronic = true;
				check = true;
				break;
			}
			case "бумажное": {
				paper = true;
				check = true;
				System.out.println("Введите количество экземпляров.");
				boolean icheck = false;
				while (icheck == false) {
					number = sc.nextInt();
					if (number > 0) {
						icheck = true;
					} else {
						System.out.println("Количесвто должно быь больше нуля.");
					}
				}
				break;
			}
			case "оба": {
				paper = true;
				electronic = true;
				check = true;
				System.out.println("Введите количество экземпляров.");
				boolean icheck = false;
				while (icheck == false) {
					number = sc.nextInt();
					if (number > 0) {
						icheck = true;
					} else {
						System.out.println("Количесвто должно быь больше нуля.");
					}
				}
				break;
			}
			default: {
				System.out.println("Неверные данные, повторите ввод");
				break;
			}
			}
		}
		Book book = new Book(title, electronic, paper, number);
		if (user.is_admin()) {
			String s = "";
			try {
				s = Files.readString(this.path_catalog);
				s += book.toString() + ";";
				Files.writeString(path_catalog, s);
			} catch (IOException e) {
				System.out.println("Библиотека не найдена");
			}
			Properties property = System.getProperties();
			property.setProperty("mail.smtp.host", "smtp.yandex.ru");
			property.setProperty("mail.smtp.user", "homeLibrary");
			property.setProperty("mail.smtp.port", "465");
			property.setProperty("mail.smtp.ssl.enable", "true");
			property.setProperty("mail.smtp.auth", "true");
			property.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			Authenticator lib = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("yourhomelibrary@yandex.by", "123456789qwerty!*");
				}
			};
			Session session = Session.getDefaultInstance(property, lib);
			try {
				MimeMessage mime = new MimeMessage(session);
				mime.setFrom("homelibrary78@yandex.by");
				mime.setSubject("New book added");
				String g = Files.readString(path_accounts);
				String[] g1 = g.split("[;]");
				for (int i = 0; i < g1.length; i++) {
					String[] g2 = g1[i].split("[,]");
					mime.addRecipient(Message.RecipientType.TO, new InternetAddress(g2[0]));
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
			property.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			Authenticator lib = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("yourhomelibrary@yandex.by", "123456789qwerty!*");
				}
			};
			Session session = Session.getDefaultInstance(property, lib);
			try {
				MimeMessage mime = new MimeMessage(session);
				mime.setFrom(user.get_email());
				mime.setSubject("New book");
				String g = Files.readString(path_accounts);
				String[] g1 = g.split("[;]");
				for (int i = 0; i < g1.length; i++) {
					String[] g2 = g1[i].split("[,]");
					if (g2[2].contains("admin")) {
						mime.addRecipient(Message.RecipientType.TO, new InternetAddress(g2[0]));
					}
				}
				mime.setText("Пользователь " + user.get_email() + " предлагает добавить:\n" + book.toString());
				Transport.send(mime);
			} catch (MessagingException m) {
				m.printStackTrace();
			} catch (IOException e) {
				System.out.println("База данных не найдена");
			}
			System.out.println("Запрос на добавление книги отправлен администратору.");
		}
	}

	public void show_books() {
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		String command = "";
		String[] content = null;
		try {
			String catalog = Files.readString(path_catalog);
			content = catalog.split("[;]");
		} catch (IOException e) {
			System.out.println("База данных не найдена.");
		}
		int page_quantity;
		if (content.length % 5 == 0) {
			page_quantity = content.length / 5;
		} else {
			page_quantity = (content.length / 5) + 1;
		}
		String[][] page = new String[5][page_quantity];
		for (int i = 0, j = 0, k = 0; i < content.length; i++, k++) {
			if (k > 4) {
				k = 0;
				j++;
			}
			page[k][j] = content[i];
		}
		int page_number = 0;
		while (check == false) {
			for (int i = 0; i < page.length; i++) {
				if (page[i][page_number] != null) {
					System.out.println(page[i][page_number]);
				}
			}
			System.out.println("Введите команду");
			if (page_number == 0) {
				System.out.println("- следующая страница\n" + "- выход");
				command = sc.nextLine();
				switch (command) {
				case "следующая страница": {
					page_number++;
					break;
				}
				case "выход": {
					check = true;
					break;
				}
				default: {
					System.out.println("Неверный запрос.");
					break;
				}
				}
			} else {
				if (page_number > 0 & page_number < page_quantity - 1) {
					System.out.println("- следующая страница\n" + "- предыдущая страница\n" + "- выход");
					command = sc.nextLine();
					switch (command) {
					case "следующая страница": {
						page_number++;
						break;
					}
					case "предыдущая страница": {
						page_number--;
						break;
					}
					case "выход": {
						check = true;
						break;
					}
					default: {
						System.out.println("Неверный запрос.");
						break;
					}
					}
				} else {
					if (page_number == page_quantity - 1) {
						System.out.println("- предыдущая страница\n" + "- выход");
						command = sc.nextLine();
						switch (command) {
						case "предыдущая страница": {
							page_number--;
							break;
						}
						case "выход": {
							check = true;
							break;
						}
						default: {
							System.out.println("Неверный запрос.");
							break;
						}
						}
					}
				}
			}
		}
	}

	public void find_book() {
		String catalog = "";
		System.out.println("Введите название книги.");
		Scanner sc = new Scanner(System.in);
		String find_string = sc.nextLine();
		try {
			catalog = Files.readString(path_catalog);
		} catch (IOException e) {
			System.out.println("Библиотека не найдена.");
		}
		String[] content = catalog.split("[;]");
		for (int i = 0; i < content.length; i++) {
			if (content[i].contains(find_string)) {
				System.out.println(content[i]);
				break;
			}
			if (i == content.length - 1 & !content[i].contains(find_string)) {
				System.out.println("Такой книги в данной библеотеке нет.");
			}
		}
	}
}
