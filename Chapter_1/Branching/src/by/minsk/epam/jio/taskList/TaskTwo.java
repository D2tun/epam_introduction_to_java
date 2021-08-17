package by.minsk.epam.jio.taskList;

/*
 * Найти max{min(a,b), min(c,d)}.
 */

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

		double ab_min = 0;
		double cd_min = 0;

		if (a >= b) {
			ab_min = b;
		} else {
			ab_min = a;
		}
		if (c >= d) {
			cd_min = d;
		} else {
			cd_min = c;
		}

		double MaxOfMin = 0;
		if (ab_min >= cd_min) {
			MaxOfMin = cd_min;
		} else {
			MaxOfMin = ab_min;
		}
		System.out.println(MaxOfMin);
	}
}
