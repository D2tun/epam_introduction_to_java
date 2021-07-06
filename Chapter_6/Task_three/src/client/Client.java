package client;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		String acc_name = "";
		String acc_password = "";

		try {
			Socket socket = new Socket("localhost", 5002);

			Scanner sc = new Scanner(System.in);
			PrintWriter pr = new PrintWriter(socket.getOutputStream());
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			BufferedReader b_in = new BufferedReader(in);

			boolean exit = false;
			while (exit == false) {
				boolean log_in = false;
				while (exit == false & log_in == false) {
					System.out.println("Введите команду из списка:\n - регистрация\n - вход\n - выход");
					String str = sc.nextLine();
					pr.println(str);
					pr.flush();
					switch (str) {
					case "регистрация": {
						System.out.println("Введите имя");
						String name = sc.nextLine();
						pr.println(name);
						pr.flush();
						System.out.println("Введите пароль");
						String password = sc.nextLine();
						pr.println(password);
						pr.flush();
						String ans = b_in.readLine();
						if (ans.contains("успех")) {
							System.out.println("Регистрация успешна");
							acc_name = name;
							acc_password = password;
							log_in = true;
						} else {
							System.out.println("Ошибка регистрации");
						}
						break;
					}
					case "вход": {
						System.out.println("Введите имя");
						String name = sc.nextLine();
						pr.println(name);
						pr.flush();
						System.out.println("Введите пароль");
						String password = sc.nextLine();
						pr.println(password);
						pr.flush();
						String ans = b_in.readLine();
						if (ans.contains("успех")) {
							System.out.println("пользователь " + name + " подключен");
							acc_name = name;
							acc_password = password;
							log_in = true;
						} else {
							System.out.println("Учётная запись не найдена");
						}
						break;
					}
					case "выход": {
						pr.println("выход");
						pr.flush();
						exit = true;
						break;
					}
					default: {
						System.out.println("Нет такой команды");
						break;
					}
					case "регистрация+": {
						System.out.println("Введите имя");
						String name = sc.nextLine();
						pr.println(name);
						pr.flush();
						System.out.println("Введите пароль");
						String password = sc.nextLine();
						pr.println(password);
						pr.flush();
						String ans = b_in.readLine();
						if (ans.contains("успех")) {
							System.out.println("Регистрация успешна");
							log_in = true;
						} else {
							System.out.println("Ошибка регистрации");
						}
						break;
					}
					}
				}
				while (exit == false & log_in == true) {
					System.out.println(
							"Введите команду из списка:\n - показать дело студента\n - изменить дело\n - добавить дело\n - выход");
					String str = sc.nextLine();
					pr.println(str);
					pr.flush();
					switch (str) {
					default: {
						System.out.println("Нет такой команды");
						break;
					}
					case "показать дело студента": {
						System.out.println("Введите имя");
						String name = sc.nextLine();
						pr.println(name);
						pr.flush();
						System.out.println("Введите фамилию");
						String surname = sc.nextLine();
						pr.println(surname);
						pr.flush();
						System.out.println("Введите отчество");
						String patronymic = sc.nextLine();
						pr.println(patronymic);
						pr.flush();
						String student = b_in.readLine();
						System.out.println(student);
						break;
					}
					case "добавить дело": {
						pr.println(acc_name);
						pr.flush();
						pr.println(acc_password);
						pr.flush();
						String rights = b_in.readLine();
						if (rights.matches("запрещено")) {
							System.out.println("У вас нет прав на это действие");
						} else {
							System.out.println("Введите имя");
							String name = sc.nextLine();
							pr.println(name);
							pr.flush();
							System.out.println("Введите фамилию");
							String surname = sc.nextLine();
							pr.println(surname);
							pr.flush();
							System.out.println("Введите отчество");
							String patronymic = sc.nextLine();
							pr.println(patronymic);
							pr.flush();
							System.out.println("Введите факультет");
							String faculty = sc.nextLine();
							pr.println(faculty);
							pr.flush();
							System.out.println("Введите номер группы");
							String group = sc.nextLine();
							pr.println(group);
							pr.flush();
							System.out.println("Введите остальную информацию");
							String description = sc.nextLine();
							pr.println(description);
							pr.flush();
							System.out.println(b_in.readLine());
						}
						break;
					}
					case "изменить дело": {
						pr.println(acc_name);
						pr.flush();
						pr.println(acc_password);
						pr.flush();
						String rights = b_in.readLine();
						if (!rights.matches("запрещено")) {
							System.out.println("Введите имя");
							String name = sc.nextLine();
							pr.println(name);
							pr.flush();
							System.out.println("Введите фамилию");
							String surname = sc.nextLine();
							pr.println(surname);
							pr.flush();
							System.out.println("Введите отчество");
							String patronymic = sc.nextLine();
							pr.println(patronymic);
							pr.flush();
							System.out.println("Введите новый факультет");
							String faculty = sc.nextLine();
							pr.println(faculty);
							pr.flush();
							System.out.println("Введите новый номер группы");
							String group = sc.nextLine();
							pr.println(group);
							pr.flush();
							System.out.println("Введите новую остальную информацию");
							String description = sc.nextLine();
							pr.println(description);
							pr.flush();
							System.out.println(b_in.readLine());
						} else {
							System.out.println("У вас нет прав на это действие");
						}
						break;
					}
					case "выход": {
						pr.println("выход");
						pr.flush();
						exit = true;
						break;
					}
					}

				}
			}

			sc.close();
			pr.close();
			b_in.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}