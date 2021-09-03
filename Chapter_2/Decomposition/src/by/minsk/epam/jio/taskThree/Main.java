/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
 * вычисления площади треугольника.
 */

package by.minsk.epam.jio.taskThree;

import by.minsk.epam.jio.input.ValueDouble;

public class Main {

	public static void main(String[] args) {

		double a = 0;
		System.out.print("Введите размер стороны правильного"
						+ " шестиугольника (мм) ");
		a = StrictMath.abs(ValueDouble.inputValue(a));
		
		double square = EquilateralTriangleArea.calculate(a) * 6;
		
		System.out.println("S = " + square);
	}
}
