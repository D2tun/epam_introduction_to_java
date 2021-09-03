/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычл сумму его
 * цифр и т.д. Сколько таких операций надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */

package by.minsk.epam.jio.taskSeventeen;

import by.minsk.epam.jio.input.ValueInt;
import by.minsk.epam.jio.taskTwelve.NumberToDigits;

public class Main {

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;
		int count = 0;

		System.out.print("Введите число ");
		number = StrictMath.abs(ValueInt.inputValue(number));

		while (number > 0) {
			sum = SumOfDigits.get(NumberToDigits.split(number));
			count++;
			number -= sum;
		}

		System.out.println("Нужно произвести " + count + " операций.");
	}
}
