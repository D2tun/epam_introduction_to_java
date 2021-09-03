/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиотуры.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueInt;

public class TaskSeven {

	public static void main(String[] args) {

		int m = 0;
		int n = 0;
		int number = 0;
		int div = 0;

		System.out.print("m=");
		m = InputValueInt.inputValue(m);
		System.out.print("n=");
		n = InputValueInt.inputValue(n);
		number = m;

		while ((number >= m) & (number <= n)) {
			System.out.print("Делители " + number + ": ");
			for (div = 2; div < (number); div++) {
				if ((StrictMath.floorMod(number, div) == 0) & (div != n) 
						& (div != m)) {
					System.out.print(div + ", ");
				}
			}
			System.out.println();
			number = number + 1;
		}
	}
}
