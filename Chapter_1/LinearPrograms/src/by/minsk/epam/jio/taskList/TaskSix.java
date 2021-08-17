package by.minsk.epam.jio.taskList;

/* 
 * Для данной области (задание 6) составить линейную программу, которая
 * перчатает true, если точка с координатами (х,у) принадлежит закрашенной
 * области, и false - в противном случае.
 */

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskSix {

	public static void main(String[] args) {

		boolean i;
		double x = 0;
		double y = 0;

		System.out.println("Введите координату х");
		x = InputValueDouble.inputValue(x);
		System.out.println("x=" + x);

		System.out.println("Введите координату y");
		y = InputValueDouble.inputValue(y);
		System.out.println("y=" + y);

		if (((y <= 4) & (y >= -3) & (x >= -2) & (x <= 2)) 
				| ((y <= 0) & (y >= -3) & (x <= 4) & (x >= -4))) {
			i = true;
		} else {
			i = false;
		}

		System.out.println(i);
	}
}
