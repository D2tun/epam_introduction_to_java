/*
 * Даны размеры А, В прямоугльного отверстия и размеры x, y, z, кирпича.
 * Определить, пройдёт и кирпич через отверстие.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskFour {

	public static void main(String[] args) {

		double A = 0;
		double B = 0;
		double x = 0;
		double y = 0;
		double z = 0;

		System.out.println("Введите ширину и высоту отверстия");
		A = InputValueDouble.inputValue(A);
		B = InputValueDouble.inputValue(B);

		System.out.println("Введите длину, ширину, высоту кирпича");
		x = InputValueDouble.inputValue(x);
		y = InputValueDouble.inputValue(y);
		z = InputValueDouble.inputValue(z);

		if (((A > x) || (A > y) || (A > z)) & ((B > y) || (B > x) || (B > z))) {
			System.out.println("Кирпич пройдёт");
		} else {
			System.out.println("Кирпич не пройдёт");
		}
	}
}
