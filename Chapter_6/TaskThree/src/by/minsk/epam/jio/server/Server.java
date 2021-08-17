package by.minsk.epam.jio.server;

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

import java.net.Socket;
import by.minsk.epam.jio.DAO.DataBase;
import by.minsk.epam.jio.exception.RegisterException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) {

		DataBase archive = new DataBase();
		try {
			ServerSocket archiveServer = new ServerSocket(5002);
			Socket socket = archiveServer.accept();

			System.out.println("client connected");
			InputStreamReader in = new InputStreamReader(socket
															.getInputStream());
			BufferedReader input = new BufferedReader(in);
			PrintWriter output = new PrintWriter(socket.getOutputStream());
			
			boolean exit = false;
			while (exit == false) {
				String str = input.readLine();
				switch (str) {
				case "регистрация": 
					String name = input.readLine();
					String password = input.readLine();
					try {
						archive.addAccount(name, password);
						output.println("успех");
						output.flush();
					} catch (RegisterException e) {
						output.println("ошибка");
						output.flush();
					}
					break;
				
				case "регистрация+": 
					name = input.readLine();
					password = input.readLine();
					try {
						archive.addAccount(name, password);
						archive.giveAdminRights(name);
						output.println("успех");
						output.flush();
					} catch (RegisterException e) {
						output.println("ошибка");
						output.flush();
					}
					break;
				
				case "вход": 
					name = input.readLine();
					password = input.readLine();
					boolean[] acc_info = archive.checkAccount(name, password);
					if (acc_info[0] == true) {
						output.println("успех");
						output.flush();
					} else {
						output.println("ошибка");
						output.flush();
					}
					break;
				
				case "выход": 
					exit = true;
					break;
				
				case "показать дело студента": 
					name = input.readLine();
					String surname = input.readLine();
					String patronymic = input.readLine();
					String student = archive.showStudent(name, surname, 
														 patronymic);
					output.println(student);
					output.flush();
					break;
				
				case "добавить дело": 
					String accName = input.readLine();
					String accPassword = input.readLine();
					if (archive.checkAccount(accName, accPassword)[1] 
							== true) {
						output.println("разрешено");
						output.flush();
						name = input.readLine();
						surname = input.readLine();
						patronymic = input.readLine();
						String faculty = input.readLine();
						String group = input.readLine();
						String description = input.readLine();
						archive.addStudent(name, surname, patronymic, faculty, 
										   group, description);
						output.println("Дело добавлено");
						output.flush();
					} else {
						output.println("запрещено");
						output.flush();
					}
					break;
				
				case "изменить дело": 
					accName = input.readLine();
					accPassword = input.readLine();
					if (archive.checkAccount(accName, accPassword)[1] == true) {
						output.println("разрешено");
						output.flush();
						name = input.readLine();
						surname = input.readLine();
						patronymic = input.readLine();
						String newFaculty = input.readLine();
						String newGroup = input.readLine();
						String newDescription = input.readLine();
						archive.editStudent(surname, name, patronymic, 
											newFaculty, newGroup, 
											newDescription);
						output.println("Дело изменено");
						output.flush();
					} else {
						output.println("запрещено");
						output.flush();
					}
					break;
				}
			}

			output.close();
			input.close();
			socket.close();
			archiveServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}