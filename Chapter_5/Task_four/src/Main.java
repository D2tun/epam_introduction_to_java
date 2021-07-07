
/* Создать консольное приложение, удовлетворяющее следующим требованиям:
	- Приложение должно быть объектно-, а не процедурно-ориентированным.
	- Каждый класс должен иметь отражающее смысл название и информативный
	состав.
	- Наследование должно применяться только тогда, когда это имеет смысл.
	- При кодировании должны быть использованы соглашения об оформлении кода
	java code convention.
	- Классы должны быть грамотно разложены по пакетам.
	- Консольное меню должно быть минимальным.
	- Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения
о 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную
сумму. */

import bean.Dragon_cave;
import bean.Treasure;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Dragon_cave Red_dragon_den = new Dragon_cave();
		Scanner sc = new Scanner(System.in);
		
		boolean exit_menu = false;
		
		System.out.println("Введите дейтсвие из списка: \n"
				+ "- просмотреть сокровища \n"
				+ "- найти самое дорогостоящее \n"
				+ "- набрать сокровищ на сумму \n"
				+ "- выйти");
		
		while (exit_menu != true) {
			String choice = sc.nextLine(); 
			switch (choice) {
				case "просмотреть сокровища": {
					Red_dragon_den.show_Loot();
					break;
				}
				case "найти самое дорогостоящее": {
					System.out.println(Red_dragon_den.get_most_expensive().toString());
					break;
				}
				case "набрать сокровищ на сумму": {
					System.out.println("Введите сумму. ");
					int amount = sc.nextInt();
					ArrayList<Treasure> list = Red_dragon_den.get_treasure_for_the_amount(amount);
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				}
				case "выйти": {
					exit_menu = true;
					break;
				}
			}
		}
		sc.close();

	}

}
