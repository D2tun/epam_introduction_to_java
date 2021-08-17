package by.minsk.epam.jio.main;

/*
 *  ������� ���������� ����������, ��������������� ��������� �����������:
 * - ���������� ������ ���� ��������-, � �� ����������-���������������.
 * - ������ ����� ������ ����� ���������� ����� �������� � �������������
 *   ������.
 * - ������������ ������ ����������� ������ �����, ����� ��� ����� �����.
 * - ��� ����������� ������ ���� ������������ ���������� �� ���������� ����
     java code convention.
 * - ������ ������ ���� �������� ��������� �� �������.
 * - ���������� ���� ������ ���� �����������.
 * - ��� �������� ������ ����� ������������ �����.
 * ������ � ��� ���������. ������� ���������, ����������� ������������ ��������
 * � 100 ���������� � ������ �������. ����������� ����������� ��������� 
 * ��������, ������ ������ �������� �� ��������� ��������� � ������ �������� ��
 * �������� �����. 
 */

import by.minsk.epam.jio.control.DragonCave;
import by.minsk.epam.jio.service.LootInfo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		DragonCave redDragonDen = new DragonCave();
		Scanner sc = new Scanner(System.in);
		
		boolean exitMenu = false;
		
		System.out.println("������� �������� �� ������: \n"
				+ "- ����������� ��������� \n"
				+ "- ����� ����� ������������� \n"
				+ "- ������� �������� �� ����� \n"
				+ "- �����");
		
		while (exitMenu != true) {
			String choice = sc.nextLine(); 
			switch (choice) {
				case "����������� ���������": 
					LootInfo.showLoot(redDragonDen);
					break;
				
				case "����� ����� �������������": 
					LootInfo.showMostExpensive(redDragonDen);
					break;
				
				case "������� �������� �� �����": 
					System.out.println("������� �����. ");
					int amount = sc.nextInt();
					LootInfo.showTreasureForTheAmount(redDragonDen, amount);
					break;
				
				case "�����": 
					exitMenu = true;
					break;
			}
		}
		sc.close();
	}
}
