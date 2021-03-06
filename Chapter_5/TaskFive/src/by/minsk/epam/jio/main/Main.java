/*
 * Создать консольное приложения, удовлетворяющее следующим требованиям:
 * - Корректно спроектируйте и реализуйте предметную область задачи.
 * - Для создания объектов из иерархии классов продумайте возможность
 *  использования порождающих шаблонов проектирования.
 * - Реализуйте проверку данных, вводимых пользователем, но не на стороне
 *   клиента.
 * - для проверки корректности переданных данных можно применить регулярные
 *  выражения.
 * - Меню выбора действия пользователем можно не реализовывать, используйте
 *  заглушку.
 * - Особое условие: переопределите, где необходимо, методы toString(),
 *  equals() и hashCode().
 *  
 * Вариант А. Цветочная композиция. Реализуйте приложение, позволяющее 
 * создавать цветочные композиции (объект, представляющий собой цветочную
 * композицию). Составляющими цветочной композиции являются цветы и упаковка.
 * 
 * \/ Вариант В. Подарки. Реализовать приложения, позволяющее создавать подарки 
 * (объект, представляющий собой подарок). Составляющими целого подарка 
 * являются сладости и упаковка. 
 */

package by.minsk.epam.jio.main;

import by.minsk.epam.jio.bean.*;
import by.minsk.epam.jio.builder.Gift;
import by.minsk.epam.jio.service.GiftInfo;

public class Main {

	public static void main(String[] args) {

		Candy candy1 = new Candy("шоколадный батончик \"Snickers\"", 6);
		Candy candy2 = new Candy("шоколад \"Алёнка\"", 10);
		Candy candy3 = new Candy("конфеты \"Raffaello\"", 20);

		Pack pack = new Pack("картонная коробка в бумажной обёртке", 11);

		Gift gift1 = new Gift(pack);
		gift1.addCandy(candy1);
		gift1.addCandy(candy1);
		gift1.addCandy(candy1);
		gift1.addCandy(candy2);
		gift1.addCandy(candy2);
		gift1.addCandy(candy3);

		GiftInfo.print(gift1);
	}
}
