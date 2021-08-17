package by.minsk.epam.jio.taskFourteen;

/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведённая в степень n, равна самому числу. Найти все
 * числе Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

import by.minsk.epam.jio.input.ValueInt;
import by.minsk.epam.jio.taskTwelve.NumberToDigits;

public class Main {

	public static void main(String[] args) {

		int k = 0;
		System.out.print("Введите предел поиска ");
		k = StrictMath.abs(ValueInt.inputValue(k));

		System.out.print("Числа Армстронга: ");
		for (int i = 1; i <= k; i++) {
			int[] d = NumberToDigits.split(i);
			boolean get = ArmstrongNumber.definite(d, i);
			if (get) {
				System.out.print(i + " ");
			}
		}
	}
}
