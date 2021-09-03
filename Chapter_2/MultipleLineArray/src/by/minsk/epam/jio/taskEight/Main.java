/*
 * В числовой матрице поменять местами два столбца любых столбца, т.е. все
 * элементы одного столбца поставить на соответствующие им позиции другого, а
 * его элементы второго переместить в первый. Номера стобцов вводит пользователь
 * с клавиатуры.
 */

package by.minsk.epam.jio.taskEight;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int columnNumber = 0;
		System.out.print("Введите число столбцов ");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));

		int stringNumber = 0;
		System.out.print("Введите число строк ");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));

		System.out.println();

		int[][] matrix = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int a = 0;
		int b = 0;
		
		System.out.print("Введите номера перемещаемых столбцов (от 0 до " 
						+ (columnNumber - 1) + ") ");
		System.out.println();
		System.out.print("Введите номер первого перемещаемого столбца ");
		a = StrictMath.abs(ValueInt.inputValue(a));
		System.out.print("Введите номер второго перемещаемого столбца ");
		b = StrictMath.abs(ValueInt.inputValue(b));

		int firstReplaced = 0;
		int secondReplaced = 0;

		if ((a > columnNumber - 1) | (b > columnNumber - 1)) {
			System.out.println("Номер(а) находятся вне размерности матрицы.");
		} else {
			for (int i = 0; i < stringNumber; i++) {
				firstReplaced = matrix[i][a];
				secondReplaced = matrix[i][b];
				matrix[i][a] = secondReplaced;
				matrix[i][b] = firstReplaced;
			}

			System.out.println("Изменённая матрица: ");
			for (int i = 0; i < stringNumber; i++) {
				for (int j = 0; j < columnNumber; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
