/*
 * Вычислить функции F(x)=(x^2)-3*x+9, если x<=3; 1/((x^3)+6), если х>3.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskFive {

	public static void main(String[] args) {
		double x = 0;
		double F = 0;

		System.out.print("x=");
		x = InputValueDouble.inputValue(x);
		System.out.println(x);

		if (x > 3) {
			F = 1 / (StrictMath.pow(x, 3) + 6);
		} else {
			F = x * (x - 3) + 9;
		}
		System.out.println("F(x)=" + F);
	}
}
