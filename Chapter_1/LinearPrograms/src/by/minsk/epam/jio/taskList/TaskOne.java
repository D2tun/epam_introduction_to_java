package by.minsk.epam.jio.taskList;

/*
 * Вычислить выражение z=((a-3)*b/2)+c
 */

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskOne {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double z = 0;

		System.out.println("Введите параметр a");
		a = InputValueDouble.inputValue(a);
		System.out.println("a=" + a);

		System.out.println("Введите параметр b");
		b = InputValueDouble.inputValue(b);
		System.out.println("b=" + b);

		System.out.println("Введите параметр c");
		c = InputValueDouble.inputValue(c);
		System.out.println("c=" + c);

		z = ((a - 3) * b / 2) + c;
		System.out.println("((" + a + "-3)*" + b + "/2)+" + c + "=" + z);
	}
}
