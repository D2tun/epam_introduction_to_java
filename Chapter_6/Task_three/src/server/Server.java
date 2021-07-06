package server;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) {

		Data_base archive = new Data_base();
		try {
			ServerSocket archive_server = new ServerSocket(5002);
			Socket socket = archive_server.accept();

			System.out.println("client connected");
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			BufferedReader b_in = new BufferedReader(in);
			PrintWriter pr = new PrintWriter(socket.getOutputStream());
			boolean exit = false;
			while (exit == false) {
				String str = b_in.readLine();
				switch (str) {
				case "регистрация": {
					String name = b_in.readLine();
					String password = b_in.readLine();
					try {
						archive.add_account(name, password);
						pr.println("успех");
						pr.flush();
					} catch (Register_exception e) {
						pr.println("ошибка");
						pr.flush();
					}
					break;
				}
				case "регистрация+": {
					String name = b_in.readLine();
					String password = b_in.readLine();
					try {
						archive.add_account(name, password);
						archive.give_admin_rights(name);
						pr.println("успех");
						pr.flush();
					} catch (Register_exception e) {
						pr.println("ошибка");
						pr.flush();
					}
					break;
				}
				case "вход": {
					String name = b_in.readLine();
					String password = b_in.readLine();
					boolean[] acc_info = archive.check_account(name, password);
					if (acc_info[0] == true) {
						pr.println("успех");
						pr.flush();
					} else {
						pr.println("ошибка");
						pr.flush();
					}
					break;
				}
				case "выход": {
					exit = true;
					break;
				}
				case "показать дело студента": {
					String name = b_in.readLine();
					String surname = b_in.readLine();
					String patronymic = b_in.readLine();
					String student = archive.show_student(name, surname, patronymic);
					pr.println(student);
					pr.flush();
					break;
				}
				case "добавить дело": {
					String acc_name = b_in.readLine();
					String acc_password = b_in.readLine();
					if (archive.check_account(acc_name, acc_password)[1] == true) {
						pr.println("разрешено");
						pr.flush();
						String name = b_in.readLine();
						String surname = b_in.readLine();
						String patronymic = b_in.readLine();
						String faculty = b_in.readLine();
						String group = b_in.readLine();
						String description = b_in.readLine();
						archive.add_student(name, surname, patronymic, faculty, group, description);
						pr.println("Дело добавлено");
						pr.flush();
					} else {
						pr.println("запрещено");
						pr.flush();
					}
					break;
				}
				case "изменить дело": {
					String acc_name = b_in.readLine();
					String acc_password = b_in.readLine();
					if (archive.check_account(acc_name, acc_password)[1] == true) {
						pr.println("разрешено");
						pr.flush();
						String name = b_in.readLine();
						String surname = b_in.readLine();
						String patronymic = b_in.readLine();
						String new_faculty = b_in.readLine();
						String new_group = b_in.readLine();
						String new_description = b_in.readLine();
						archive.edit_student(surname, name, patronymic, new_faculty, new_group, new_description);
						pr.println("Дело изменено");
						pr.flush();
					} else {
						pr.println("запрещено");
						pr.flush();
					}
					break;
				}
				}
			}

			pr.close();
			b_in.close();
			socket.close();
			archive_server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}