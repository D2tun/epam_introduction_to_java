/*
 * Даны 3 точки A(x1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они
 * расположены на одной прямой.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskThree {

	public static void main(String[] args) {
		double x1 = 0;
		double x2 = 0;
		double x3 = 0;
		double y1 = 0;
		double y2 = 0;
		double y3 = 0;

		System.out.println("Введите координаты первой точки");
		x1 = InputValueDouble.inputValue(x1);
		y1 = InputValueDouble.inputValue(y1);
		System.out.println("Введите координаты второй точки");
		x2 = InputValueDouble.inputValue(x2);
		y2 = InputValueDouble.inputValue(y2);
		System.out.println("Введите координаты третьей точки");
		x3 = InputValueDouble.inputValue(x3);
		y3 = InputValueDouble.inputValue(y3);

		if (((x1 == x2) & (x2 == x3)) | ((y1 == y2) & (y2 == y3))) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки не расположены на одной прямой");
		}
	}
}
