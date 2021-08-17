package by.minsk.epam.jio.taskThirteen;

/*
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int stringNumber = 0;
		System.out.print("Введите количество строк ");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));

		int columnNumber = 0;
		System.out.print("Введите количество столбцов ");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));

		System.out.println();

		int[][] matrix = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Сортировка по убыванию:");

		int greater = 0;
		int lesser = 0;
		boolean iteration = true;

		for (int k = 0; k < columnNumber; k++) {
			for (int i = 0; i < stringNumber; i++) {
				while (iteration) {
					iteration = false;
					for (int j = 0; j < columnNumber; j++) {
						for (int p = 1; p < stringNumber; p++) {
							if (matrix[p][j] > matrix[p - 1][j]) {
								greater = matrix[p][j];
								lesser = matrix[p - 1][j];
								matrix[p - 1][j] = greater;
								matrix[p][j] = lesser;
								iteration = true;
							}

						}
					}
				}
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Сортировка по возрастанию:");
		
		iteration = true;
		for (int k = 0; k < columnNumber; k++) {
			for (int i = 0; i < stringNumber; i++) {
				while (iteration) {
					iteration = false;
					for (int j = 0; j < columnNumber; j++) {
						for (int p = 1; p < stringNumber; p++) {
							if (!(matrix[p][j] > matrix[p - 1][j])) {
								greater = matrix[p][j];
								lesser = matrix[p - 1][j];
								matrix[p - 1][j] = greater;
								matrix[p][j] = lesser;
								iteration = true;
							}

						}
					}
				}
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println();
		}
	}
}
