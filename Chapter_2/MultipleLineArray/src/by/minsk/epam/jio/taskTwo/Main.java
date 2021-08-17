package by.minsk.epam.jio.taskTwo;

/*
 * Дана квадратная марица. Вывести на экран элементы, стоящие на диагонали.
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int size = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		size = StrictMath.abs(ValueInt.inputValue(size));

		System.out.println();

		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random()
							   * 80 + 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		System.out.print("Элементы на диагонали: ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(matrix[i][i] + " ");
		}
	}
}
