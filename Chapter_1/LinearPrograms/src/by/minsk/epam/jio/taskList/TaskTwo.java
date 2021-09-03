/* 
 * Вычислить значение выражения по формуле 
 * ((b+(((b^2)-4*a*c)^(1/2))/(2*a))-(a^3)*3+(b^-2) (все переменные принимают
 * действительные значения).
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskTwo {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double sum = 0;

		System.out.println("Введите параметр a");
		a = InputValueDouble.inputValue(a);
		System.out.println("a=" + a);

		System.out.println("Введите параметр b");
		b = InputValueDouble.inputValue(b);
		System.out.println("b=" + b);

		System.out.println("Введите параметр c");
		c = InputValueDouble.inputValue(c);
		System.out.println("c=" + c);

		sum = (b + StrictMath.sqrt(StrictMath.pow(b, 2) + 4 * a * c)) - StrictMath.pow(a, 3) * c
		      + StrictMath.pow(b, -2);
		System.out.println("результат: " + sum);
	}
}
