package lpfirst.task_six;

// Задача: Для данной области (задание 6) составить линейную программу, которая перчатает true, если точка с координатами (х,у) принадлежит закрашенной 
// области, и false - в противном случае

import global.Input_value_double;

public class Task_six {

	public static void main(String[] args) {
		Input_value_double value = new Input_value_double();
		boolean i;
		double x = 0;
		double y = 0;
		System.out.println("Введите координату x");
		x = Input_value_double.Input_value(x);
		System.out.println("x=" + x);
		System.out.println("Введите координату y");
		y = Input_value_double.Input_value(y);
		System.out.println("y=" + y);
		if ((y <= 4 & y >= -3 & x >= -2 & x <= 2) | (y <= 0 & y >= -3 & x <= 4 & x >= -4)) {
			i = true;
		} else
			i = false;
		System.out.println(i);
	}

}
