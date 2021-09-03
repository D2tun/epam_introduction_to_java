/*
 * Сформировать квадратную матрицу порядка n по заданному образцу. 
 */

package by.minsk.epam.jio.taskFour;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = j + 1;
					System.out.print(matrix[i][j] + " ");
				}
			} else {
				for (int j = 0, k = n; j < n; j++, k--) {
					matrix[i][j] = k;
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
