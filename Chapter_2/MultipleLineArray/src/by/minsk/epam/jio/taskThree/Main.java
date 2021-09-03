/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.minsk.epam.jio.taskThree;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int columnNumber = 0;
		System.out.print("Введите количество столбцов ");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));

		int stringNumber = 0;
		System.out.print("Введите количество строк ");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));

		int[][] matrix = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 51);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int k = 0;
		System.out.print("Номер выводимой строки ");
		k = StrictMath.abs(ValueInt.inputValue(k));

		int p = 0;
		System.out.print("Номер выводимого столбца ");
		p = StrictMath.abs(ValueInt.inputValue(p));

		if (k > stringNumber) {
			System.out.print("Строка находится вне размерности матрицы.");
		} else {
			System.out.print(k + "-ая строка: ");
			for (int j = 0; j < columnNumber; j++) {
				System.out.print(matrix[k-1][j] + " ");
			}
		}
		
		System.out.println();
		
		if (p > columnNumber) {
			System.out.print("Столбец находится вне размерности матрицы.");
		} else {
			System.out.print(p + "-й столбец: ");
			for (int i = 0; i < stringNumber; i++) {
				System.out.print(matrix[i][p-1] + " ");
			}
		}
	}
}
