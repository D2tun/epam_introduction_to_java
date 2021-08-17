package by.minsk.epam.jio.taskList;

/*
 * Составить программу нахождения произведния квадратов первых двухсот чисел.
 */

import by.minsk.epam.jio.input.InputValueInt;

public class TaskFour {

	public static void main(String[] args) {

		int q = 0;
		long sumOfSquaresProduct = 0;
		long squaresProduct = 0;

		System.out.println("Введите начальное число");
		q = InputValueInt.inputValue(q);

		int i = q;
		while (i <= (q + 200)) {
			int f = i + 1;
			if (f > i) {
				f = i;
			}
			squaresProduct = (f * f) * (i * i);
			sumOfSquaresProduct = sumOfSquaresProduct + squaresProduct;
			i = i + 1;
		}
		System.out.println("Сумма квадратов 200 чисел: " + sumOfSquaresProduct);
	}
}
