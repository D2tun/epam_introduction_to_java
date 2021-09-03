/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введённого пользователем числа.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueInt;

public class TaskOne {

	public static void main(String[] args) {
		
		int a = 0;
		int i = 0;
		int g = 0;

		System.out.println("Введите целое положительное число");
		a = InputValueInt.inputValue(a);

		if (a < 0) {
			System.out.println("Число должно быть положительным");
		} else {
			for (i = 1; i <= a; i++) {
				g = g + i;
			}
			System.out.println("Сумма чисел от 1 до " + a + ": " + g);
		}
	}
}
