/* 
 * Создайте клиент-серверное приложение "Архив".
 * Общие иребования к заданию:
 *  - В архиве находятся дела (например, студентов). Архив находится на сервере.
 *  - Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения,
 *    или создать новое дело.
 * Требования к коду лабораторной работы:
 *  - Для реализации сетевого соеднения используйте сокеты.
 *  - Формат хранения данных на сервере - xml-файлы.
 */

package by.minsk.epam.jio.client;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		String accName = "";
		String accPassword = "";

		try {
			Socket socket = new Socket("localhost", 5002);

			Scanner sc = new Scanner(System.in);
			PrintWriter output = new PrintWriter(socket.getOutputStream());
			InputStreamReader in = new InputStreamReader(socket
									.getInputStream());
			BufferedReader input = new BufferedReader(in);

			boolean exit = false;
			while (exit == false) {
				boolean logIn = false;
				while ((exit == false) & (logIn == false)) {
					System.out.println("Введите команду из списка:\n "
							  + "- регистрация\n - вход\n - выход");
					String str = sc.nextLine();
					output.println(str);
					output.flush();
					switch (str) {
					case "регистрация": 
						System.out.println("Введите имя");
						String name = sc.nextLine();
						output.println(name);
						output.flush();
						System.out.println("Введите пароль");
						String password = sc.nextLine();
						output.println(password);
						output.flush();
						String ans = input.readLine();
						if (ans.contains("успех")) {
							System.out.println("Регистрация успешна");
							accName = name;
							accPassword = password;
							logIn = true;
						} else {
							System.out.println("Ошибка регистрации");
						}
						break;
					
					case "вход": 
						System.out.println("Введите имя");
						name = sc.nextLine();
						output.println(name);
						output.flush();
						System.out.println("Введите пароль");
						password = sc.nextLine();
						output.println(password);
						output.flush();
						ans = input.readLine();
						if (ans.contains("успех")) {
							System.out.println("пользователь " + name 
									  + " подключен");
							accName = name;
							accPassword = password;
							logIn = true;
						} else {
							System.out.println("Учётная запись не найдена");
						}
						break;
					
					case "выход": 
						output.println("выход");
						output.flush();
						exit = true;
						break;
					
					default: 
						System.out.println("Нет такой команды");
						break;
					
					case "регистрация+": 
						System.out.println("Введите имя");
						name = sc.nextLine();
						output.println(name);
						output.flush();
						System.out.println("Введите пароль");
						password = sc.nextLine();
						output.println(password);
						output.flush();
						ans = input.readLine();
						if (ans.contains("успех")) {
							System.out.println("Регистрация успешна");
							logIn = true;
						} else {
							System.out.println("Ошибка регистрации");
						}
						break;
					}
				}
				while ((exit == false) & (logIn == true)) {
					System.out.println(
							"Введите команду из списка:\n - показать дело "
							+ "студента\n - изменить дело\n - добавить дело\n "
							+ "- выход");
					String str = sc.nextLine();
					output.println(str);
					output.flush();
					switch (str) {
					default: 
						System.out.println("Нет такой команды");
						break;
					
					case "показать дело студента": 
						System.out.println("Введите имя");
						String name = sc.nextLine();
						output.println(name);
						output.flush();
						System.out.println("Введите фамилию");
						String surname = sc.nextLine();
						output.println(surname);
						output.flush();
						System.out.println("Введите отчество");
						String patronymic = sc.nextLine();
						output.println(patronymic);
						output.flush();
						String student = input.readLine();
						System.out.println(student);
						break;
					
					case "добавить дело": 
						output.println(accName);
						output.flush();
						output.println(accPassword);
						output.flush();
						String rights = input.readLine();
						if (rights.matches("запрещено")) {
							System.out.println("У вас нет прав на это "
											  + "действие");
						} else {
							System.out.println("Введите имя");
							name = sc.nextLine();
							output.println(name);
							output.flush();
							System.out.println("Введите фамилию");
							surname = sc.nextLine();
							output.println(surname);
							output.flush();
							System.out.println("Введите отчество");
							patronymic = sc.nextLine();
							output.println(patronymic);
							output.flush();
							System.out.println("Введите факультет");
							String faculty = sc.nextLine();
							output.println(faculty);
							output.flush();
							System.out.println("Введите номер группы");
							String group = sc.nextLine();
							output.println(group);
							output.flush();
							System.out.println("Введите остальную информацию");
							String description = sc.nextLine();
							output.println(description);
							output.flush();
							System.out.println(input.readLine());
						}
						break;
					
					case "изменить дело": 
						output.println(accName);
						output.flush();
						output.println(accPassword);
						output.flush();
						rights = input.readLine();
						if (!rights.matches("запрещено")) {
							System.out.println("Введите имя");
							name = sc.nextLine();
							output.println(name);
							output.flush();
							System.out.println("Введите фамилию");
							surname = sc.nextLine();
							output.println(surname);
							output.flush();
							System.out.println("Введите отчество");
							patronymic = sc.nextLine();
							output.println(patronymic);
							output.flush();
							System.out.println("Введите новый факультет");
							String faculty = sc.nextLine();
							output.println(faculty);
							output.flush();
							System.out.println("Введите новый номер группы");
							String group = sc.nextLine();
							output.println(group);
							output.flush();
							System.out.println("Введите новую остальную "
									  + "информацию");
							String description = sc.nextLine();
							output.println(description);
							output.flush();
							System.out.println(input.readLine());
						} else {
							System.out.println("У вас нет прав на это "
									  + "действие");
						}
						break;
					
					case "выход": 
						output.println("выход");
						output.flush();
						exit = true;
						break;
					}
				}
			}

			sc.close();
			output.close();
			input.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
