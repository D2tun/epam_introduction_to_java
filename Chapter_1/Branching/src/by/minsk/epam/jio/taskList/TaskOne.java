/*
 * Даны два угла треугольника (в градусах). Определить, существует ли
 * такой треугольник, и если да, то будет ли он прямоугольным.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskOne {

	public static void main(String[] args) {
		double angle1 = 0;
		double angle2 = 0;

		System.out.println("Введите первый угол (в градусах)");
		angle1 = InputValueDouble.inputValue(angle1);

		System.out.println("Введите второй угол (в градусах)");
		angle2 = InputValueDouble.inputValue(angle2);

		double angle3 = 180 - angle1 - angle2;

		if (((angle3 < 90) & (angle3 > 0)) | ((angle3 > 90) & (angle3 < 180))) {
			System.out.println("Такой треугольник существует, он не "
				           + "прямоугольный.");
		} else {
			if (angle3 == 90) {
				System.out.println("Такой треугольник существует, он "
						   + "прямоугольный.");
			} else {
				System.out.println("Такой треугольник не существует.");
			}
		}
	}
}
