package by.minsk.epam.jio.taskFive;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцую.
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		n = ValueInt.inputValue(n);
		
		int k = n;
		
		System.out.println();
		
		int[][] matrix = new int[n][n];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				matrix[i][j] = j+1;
				if (i > k-1) {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			k--;
		}
	}
}
