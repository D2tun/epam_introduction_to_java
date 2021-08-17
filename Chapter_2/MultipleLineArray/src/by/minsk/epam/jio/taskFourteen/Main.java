package by.minsk.epam.jio.taskFourteen;

/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причём в
 * каждом столбце число единиц равно номеру столбца. 
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int m = 0;
		System.out.print("Введите количество столбцов ");
		m = StrictMath.abs(ValueInt.inputValue(m));

		int n = 0;
		System.out.print("Введите количество строк ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int one = 0;

		int[][] matrix = new int[m][n];
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				matrix[k][j] = (int) StrictMath.round(StrictMath.random());
				if (one >= k) {
					matrix[k][j] = 0;
					
				} else {
					matrix[k][j] = 1;
				}
				one = j;
				System.out.print(matrix[k][j] + " ");

			}
			System.out.println();
		}
	}
}
