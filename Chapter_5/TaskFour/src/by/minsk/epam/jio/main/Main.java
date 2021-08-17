package by.minsk.epam.jio.main;

/*
 *  Создать консольное приложение, удовлетворяющее следующим требованиям:
 * - Приложение должно быть объектно-, а не процедурно-ориентированным.
 * - Каждый класс должен иметь отражающее смысл название и информативный
 *   состав.
 * - Наследование должно применяться только тогда, когда это имеет смысл.
 * - При кодировании должны быть использованы соглашения об оформлении кода
     java code convention.
 * - Классы должны быть грамотно разложены по пакетам.
 * - Консольное меню должно быть минимальным.
 * - Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения
 * о 100 сокровищах в пещере дракона. Реализовать возможность просмотра 
 * сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на
 * заданную сумму. 
 */

import by.minsk.epam.jio.control.DragonCave;
import by.minsk.epam.jio.service.LootInfo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		DragonCave redDragonDen = new DragonCave();
		Scanner sc = new Scanner(System.in);
		
		boolean exitMenu = false;
		
		System.out.println("Введите дейтсвие из списка: \n"
				+ "- просмотреть сокровища \n"
				+ "- найти самое дорогостоящее \n"
				+ "- набрать сокровищ на сумму \n"
				+ "- выйти");
		
		while (exitMenu != true) {
			String choice = sc.nextLine(); 
			switch (choice) {
				case "просмотреть сокровища": 
					LootInfo.showLoot(redDragonDen);
					break;
				
				case "найти самое дорогостоящее": 
					LootInfo.showMostExpensive(redDragonDen);
					break;
				
				case "набрать сокровищ на сумму": 
					System.out.println("Введите сумму. ");
					int amount = sc.nextInt();
					LootInfo.showTreasureForTheAmount(redDragonDen, amount);
					break;
				
				case "выйти": 
					exitMenu = true;
					break;
			}
		}
		sc.close();
	}
}
