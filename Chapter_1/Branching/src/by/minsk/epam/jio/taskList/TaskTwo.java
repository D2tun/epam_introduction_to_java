/*
 * Найти max{min(a,b), min(c,d)}.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskTwo {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;

		a = InputValueDouble.inputValue(a);
		System.out.println("a=" + a);
		b = InputValueDouble.inputValue(b);
		System.out.println("b=" + b);
		c = InputValueDouble.inputValue(c);
		System.out.println("c=" + c);
		d = InputValueDouble.inputValue(d);
		System.out.println("d=" + d);

		double abMin = 0;
		double cdMin = 0;

		if (a >= b) {
			abMin = b;
		} else {
			abMin = a;
		}
		if (c >= d) {
			cdMin = d;
		} else {
			cdMin = c;
		}

		double MaxOfMin = 0;
		if (abMin >= cdMin) {
			MaxOfMin = cdMin;
		} else {
			MaxOfMin = abMin;
		}
		System.out.println(MaxOfMin);
	}
}
