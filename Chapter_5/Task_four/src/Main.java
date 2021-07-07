
/* ������� ���������� ����������, ��������������� ��������� �����������:
	- ���������� ������ ���� ��������-, � �� ����������-���������������.
	- ������ ����� ������ ����� ���������� ����� �������� � �������������
	������.
	- ������������ ������ ����������� ������ �����, ����� ��� ����� �����.
	- ��� ����������� ������ ���� ������������ ���������� �� ���������� ����
	java code convention.
	- ������ ������ ���� �������� ��������� �� �������.
	- ���������� ���� ������ ���� �����������.
	- ��� �������� ������ ����� ������������ �����.

������ � ��� ���������. ������� ���������, ����������� ������������ ��������
� 100 ���������� � ������ �������. ����������� ����������� ��������� ��������,
������ ������ �������� �� ��������� ��������� � ������ �������� �� ��������
�����. */

import bean.Dragon_cave;
import bean.Treasure;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Dragon_cave Red_dragon_den = new Dragon_cave();
		Scanner sc = new Scanner(System.in);
		
		boolean exit_menu = false;
		
		System.out.println("������� �������� �� ������: \n"
				+ "- ����������� ��������� \n"
				+ "- ����� ����� ������������� \n"
				+ "- ������� �������� �� ����� \n"
				+ "- �����");
		
		while (exit_menu != true) {
			String choice = sc.nextLine(); 
			switch (choice) {
				case "����������� ���������": {
					Red_dragon_den.show_Loot();
					break;
				}
				case "����� ����� �������������": {
					System.out.println(Red_dragon_den.get_most_expensive().toString());
					break;
				}
				case "������� �������� �� �����": {
					System.out.println("������� �����. ");
					int amount = sc.nextInt();
					ArrayList<Treasure> list = Red_dragon_den.get_treasure_for_the_amount(amount);
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				}
				case "�����": {
					exit_menu = true;
					break;
				}
			}
		}
		sc.close();

	}

}
