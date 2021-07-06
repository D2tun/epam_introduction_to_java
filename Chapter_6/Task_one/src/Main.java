
/* —оздать консольное приложение "”чЄт книг в домашней библиотеке".
ќбщие требовани€ к заданию:
 - —истема учитывает книги как в электронном, так и в бумажном варианте.
 - —уществующие роли: пользователь, администратор.
 - ѕользователь может просматривать книги в каталоге книг, осуществл€ть
   поиск книг в каталоге.
 - јдминистратор может модифицировать каталог.
 - *ѕри добавлении описани€ книги в каталог оповещение о ней рассылаетс€
   на e-mail всем пользовател€м
 - **ѕри просмотре каталога желательно реализовать постраничный просмотр
 - ***ѕользователь может предложить добавить книгу в библиотеку, переслав
   еЄ администратору на e-mail.
 -  аталог книг хранитс€ в текстовом файле.
 - ƒанные аутентификации пользователей хран€тс€ в текстовом файле. ѕароль
   не хранитс€ в открытом виде. */

import home_library.Library_system;
import home_library.User;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String command = "";
		boolean g_check = false;

		Library_system system = new Library_system("D:\\");
		while (g_check == false) {
			boolean log_in = false;
			System.out.println("¬ведите команду:\n" + "- зарегистрироватьс€\n" + "- войти\n" + "- выход\n");
			command = sc.nextLine();
			User user1 = null;
			while (log_in == false) {
				switch (command) {
				case "зарегистрироватьс€": {
					system.registration();
					user1 = system.log_in();
					log_in = true;
					break;
				}
				case "зарегистрироватьс€+": {
					system.registration();
					user1 = system.log_in();
					system.set_admin(user1);
					log_in = true;
					break;
				}
				case "войти": {
					user1 = system.log_in();
					log_in = true;
					break;
				}
				case "выход": {
					log_in = true;
					g_check = true;
					break;
				}
				default: {
					System.out.println("Ќет такой команды");
					log_in = true;
					break;
				}
				}
			}
			if (log_in == true & user1 != null) {
				boolean log_out = false;
				while (log_out == false) {
					System.out.println("¬ведите команду:\n" + "- просмотреть каталог\n" + "- найти книгу\n"
							+ "- добавить книгу\n" + "- выйти\n");
					command = sc.nextLine();
					switch (command) {
					default: {
						System.out.println("Ќет такой команды");
						break;
					}
					case "просмотреть каталог": {
						system.show_books();
						break;
					}
					case "найти книгу": {
						system.find_book();
						break;
					}
					case "выйти": {
						log_out = true;
						break;
					}
					case "добавить книгу": {
						system.add_book(user1);
						break;
					}
					}
				}
			}
		}
	}
}
