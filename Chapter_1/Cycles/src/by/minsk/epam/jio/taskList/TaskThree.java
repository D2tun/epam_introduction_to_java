/*
 * Найти сумму квадратов первых ста чисел.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueInt;

public class TaskThree {

	public static void main(String[] args) {

		int q = 0;
		long sumOfSquares = 0;

		System.out.println("Введите начальное число");
		InputValueInt.inputValue(q);

		int i = q;
		while (i <= (q + 100)) {
			sumOfSquares = sumOfSquares + (i * i);
			i = i + 1;
		}
		System.out.println("Сумма квадратов 100 чисел: " + sumOfSquares);
	}
}
