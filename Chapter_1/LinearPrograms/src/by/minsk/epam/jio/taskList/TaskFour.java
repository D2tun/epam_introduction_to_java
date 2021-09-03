/*
 * Дано действительное число R вида nnn.ddd. Поменять местами дробную и целую
 * части числа и вывести полученное значение числа.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskFour {

	public static void main(String[] args) {
		
		double R = 0;
		
		System.out.println("Введите действительное число R");
		R = InputValueDouble.inputValue(R);
		double a = StrictMath.round(R);
		double b = (R - a) * 1000;
		
		System.out.println((int) b + "." + (int) a);
	}
}
