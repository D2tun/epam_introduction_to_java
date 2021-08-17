package by.minsk.epam.jio.taskTen;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int size = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		size = StrictMath.abs(ValueInt.inputValue(size));
		
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101)
								- 50;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Положительные элементы главной диагонали матицы: ");
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((i == j) & (matrix[i][j] > 0)) {
				System.out.print(matrix[i][j] + " ");
				}
			}
		}
	}
}
