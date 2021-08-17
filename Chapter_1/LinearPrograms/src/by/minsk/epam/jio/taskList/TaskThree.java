package by.minsk.epam.jio.taskList;

/*
 * Вычислить значение выражения по формуле
 * ((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(yx)
 * (все переменные принимают действительные значения).
 */

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskThree {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		double result = 0;

		System.out.println("Введите параметр х");
		x = InputValueDouble.inputValue(x);
		System.out.println("x=" + x);

		System.out.println("Введите параметр y");
		y = InputValueDouble.inputValue(y);
		System.out.println("y=" + y);

		result = (((StrictMath.sin(x)) + (StrictMath.cos(y))) /
				((StrictMath.cos(x) - StrictMath.sin(y)))) * StrictMath.tan(x * y);
		System.out.println(
				"((sin(" + x + ")+cos(" + y + "))/(cos(" + x + ")-sin(" + y
				+ ")))*tg(" + x * y + ")=" + result);
	}
}
