package lpsecond;

//Задача: даны 3 точки A(x1,y1), B(x2,y2) и C(x3,y3).
//Определить, будут ли они расположены на одной прямой.

import global.Input_value_double;

public class Task_three {

	public static void main(String[] args) {
		Input_value_double value = new Input_value_double();
		double x1 = 0;
		double x2 = 0;
		double x3 = 0;
		double y1 = 0;
		double y2 = 0;
		double y3 = 0;
		System.out.println("Введите координаты первой точки");
		x1 = Input_value_double.Input_value(x1);
		y1 = Input_value_double.Input_value(y1);
		System.out.println("Введите координаты второй точки");
		x2 = Input_value_double.Input_value(x2);
		y2 = Input_value_double.Input_value(y2);
		System.out.println("Введите координаты третьей точки");
		x3 = Input_value_double.Input_value(x3);
		y3 = Input_value_double.Input_value(y3);
		if ((x1 == x2 & x2 == x3) | (y1 == y2 & y2 == y3)) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки не расположены на одной прямой");
		}
	}

}
