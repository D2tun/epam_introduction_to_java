package by.minsk.epam.jio.taskList;

/*
 * Вычислить значение функции y=x, x>2; -x, x<=2 на отрезке [a, b] с шагом h.
 */

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskTwo {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double h = 0;
		double y = 0;

		System.out.println("Введите минимум");
		a = InputValueDouble.inputValue(a);
		System.out.println("Введите максимум");
		b = InputValueDouble.inputValue(b);
		System.out.println("Введите шаг вычисления");
		h = InputValueDouble.inputValue(h);

		for (; a <= b; a += h) {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.println("x=" + a + ", " + "y=" + y);
		}
	}
}
