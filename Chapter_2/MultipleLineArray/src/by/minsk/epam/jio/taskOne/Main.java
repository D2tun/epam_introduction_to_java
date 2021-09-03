/*
 * Дана матрица. Вывести на экран все нечётные столбцы, у которых первый
 * элемент больше последнего.
 */

package by.minsk.epam.jio.taskOne;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int columnNumber = 0;
		System.out.print("Введите коичество столбцов ");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));

		System.out.println();

		int stringNumber = 0;
		System.out.print("Введите количество строк ");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));

		int[][] arr = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				arr[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < columnNumber; j++) {
			if ((j != 0) & (j % 2 != 0)) {
				if (arr[0][j] > arr[stringNumber - 1][j]) {
					for (int k = 0; k < stringNumber; k++) {
						System.out.print(arr[k][j] + " ");
					}
					System.out.println(" ");
				}
			}
		}
	}
}
