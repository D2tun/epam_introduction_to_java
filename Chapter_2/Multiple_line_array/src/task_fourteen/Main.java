package task_fourteen;

/* —формировать случайную матрицу m x n, состо€щую из нулей и единиц, причЄм в каждои столбце
число единиц равно номеру столбца. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int m = 0;
		System.out.print("¬ведите количество столбцов ");
		m = StrictMath.abs(Input_value_int.Input_value(m));

		int n = 0;
		System.out.print("¬ведите количество строк ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

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
