
/* ������� ���������� ���������� "���� ���� � �������� ����������".
����� ���������� � �������:
 - ������� ��������� ����� ��� � �����������, ��� � � �������� ��������.
 - ������������ ����: ������������, �������������.
 - ������������ ����� ������������� ����� � �������� ����, ������������
   ����� ���� � ��������.
 - ������������� ����� �������������� �������.
 - *��� ���������� �������� ����� � ������� ���������� � ��� �����������
   �� e-mail ���� �������������
 - **��� ��������� �������� ���������� ����������� ������������ ��������
 - ***������������ ����� ���������� �������� ����� � ����������, ��������
   � �������������� �� e-mail.
 - ������� ���� �������� � ��������� �����.
 - ������ �������������� ������������� �������� � ��������� �����. ������
   �� �������� � �������� ����. */

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
			System.out.println("������� �������:\n" + "- ������������������\n" + "- �����\n" + "- �����\n");
			command = sc.nextLine();
			User user1 = null;
			while (log_in == false) {
				switch (command) {
				case "������������������": {
					system.registration();
					user1 = system.log_in();
					log_in = true;
					break;
				}
				case "������������������+": {
					system.registration();
					user1 = system.log_in();
					system.set_admin(user1);
					log_in = true;
					break;
				}
				case "�����": {
					user1 = system.log_in();
					log_in = true;
					break;
				}
				case "�����": {
					log_in = true;
					g_check = true;
					break;
				}
				default: {
					System.out.println("��� ����� �������");
					log_in = true;
					break;
				}
				}
			}
			if (log_in == true & user1 != null) {
				boolean log_out = false;
				while (log_out == false) {
					System.out.println("������� �������:\n" + "- ����������� �������\n" + "- ����� �����\n"
							+ "- �������� �����\n" + "- �����\n");
					command = sc.nextLine();
					switch (command) {
					default: {
						System.out.println("��� ����� �������");
						break;
					}
					case "����������� �������": {
						system.show_books();
						break;
					}
					case "����� �����": {
						system.find_book();
						break;
					}
					case "�����": {
						log_out = true;
						break;
					}
					case "�������� �����": {
						system.add_book(user1);
						break;
					}
					}
				}
			}
		}
	}
}
