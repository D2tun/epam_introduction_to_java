package task_three;

/* Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления
площади треугольника. */

import global.Input_value_double;

public class Main {

	public static void main(String[] args) {

		double a = 0;
		System.out.print("Введите размер стороны правильного шестиугольника (мм) ");
		a = StrictMath.abs(Input_value_double.Input_value(a));
		
		double square = Calculate_triangle_area.equilateral(a) * 6;
		
		System.out.println("S = " + square);
	}

}
