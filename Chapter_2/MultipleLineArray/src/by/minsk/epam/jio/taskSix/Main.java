/*
 * Сформировать квадратную матрицу порядка n  по заданному образцу(n - четное)
 */

package by.minsk.epam.jio.taskSix;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		System.out.println();

		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (((j < n / 2) & (i < n / 2))) {
					if (i > j) {
						matrix[i][j] = 0;
						matrix[i][n - 1 - j] = 0;
						matrix[n - i - 1][j] = 0;
						matrix[n - i - 1][n - j - 1] = 0;
					} else {
						matrix[i][j] = 1;
						matrix[i][n - 1 - j] = 1;
						matrix[n - i - 1][j] = 1;
						matrix[n - i - 1][n - j - 1] = 1;
					}
				}
				if ((j == n / 2) | (j == (n - 1) / 2)) {
					matrix[i][j] = 1;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
