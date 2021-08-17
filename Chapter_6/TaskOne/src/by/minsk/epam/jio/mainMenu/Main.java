package by.minsk.epam.jio.mainMenu;

/* 
 * Создать консольное приложение "Учёт книг в домашней библиотеке".
 * Общие требования к заданию:
 *  - Система учитывает книги как в электронном, так и в бумажном варианте.
 * - Существующие роли: пользователь, администратор.
 * - Пользователь может просматривать книги в каталоге книг, осуществлять
 *   поиск книг в каталоге.
 * - Администратор может модифицировать каталог.
 * - *При добавлении описания книги в каталог оповещение о ней рассылается
 *   на e-mail всем пользователям
 * - **При просмотре каталога желательно реализовать постраничный просмотр
 * - ***Пользователь может предложить добавить книгу в библиотеку, переслав
 *   её администратору на e-mail.
 * - Каталог книг хранится в текстовом файле.
 * - Данные аутентификации пользователей хранятся в текстовом файле. Пароль
 *   не хранится в открытом виде. 
 */

import java.util.Scanner;
import by.minsk.epam.jio.appFunctional.LibrarySystem;
import by.minsk.epam.jio.bean.User;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String command = "";
		boolean gCheck = false;

		LibrarySystem system = new LibrarySystem("D:\\");
		while (gCheck == false) {
			boolean logIn = false;
			System.out.println("Введите команду:\n" + "- зарегистрироваться\n" 
							  + "- войти\n" + "- выход\n");
			command = sc.nextLine();
			User user1 = null;
			
			while (logIn == false) {
				switch (command) {
				case "зарегистрироваться": 
					system.registration();
					user1 = system.logIn();
					logIn = true;
					break;
				
				case "зарегистрироваться+": 
					system.registration();
					user1 = system.logIn();
					system.setAdmin(user1);
					logIn = true;
					break;
				
				case "войти": 
					user1 = system.logIn();
					logIn = true;
					break;
				
				case "выход": 
					logIn = true;
					gCheck = true;
					break;
				
				default: 
					System.out.println("Нет такой команды");
					logIn = true;
					break;
				}
			}
			
			if ((logIn == true) & (user1 != null)) {
				boolean logOut = false;
				while (logOut == false) {
					System.out.println("Введите команду:\n" 
									  + "- просмотреть каталог\n" 
									  + "- найти книгу\n"
									  + "- добавить книгу\n" + "- выйти\n");
					command = sc.nextLine();
					switch (command) {
					default: 
						System.out.println("Нет такой команды");
						break;
					
					case "просмотреть каталог": 
						system.showBooks();
						break;
					
					case "найти книгу": 
						system.findBook();
						break;
					
					case "выйти": 
						logOut = true;
						break;
					
					case "добавить книгу": 
						system.addBook(user1);
						break;
					}
				}
			}
		}
	}
}
