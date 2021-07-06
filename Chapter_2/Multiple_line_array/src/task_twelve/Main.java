package task_twelve;

// ќтсортировать строки матрицы по возрастанию и убыванию значений элементов.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int string_number = 0;
		System.out.print("¬ведите количество строк ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));

		int column_number = 0;
		System.out.print("¬ведите количество столбцов ");
		column_number = StrictMath.abs(Input_value_int.Input_value(column_number));

		System.out.println();

		int[][] matrix = new int[string_number][column_number];
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Ёлементы строк по убыванию:");

		int greater = 0;
		int lesser = 0;
		boolean iteration = true;

		for (int i = 0; i < string_number; i++) {
			for (int k = 0; k < column_number; k++) {
				while (iteration) {
					iteration = false;
					for (int p = 0; p < string_number; p++) {
						for (int j = 1; j < column_number; j++) {
							if (matrix[p][j] > matrix[p][j - 1]) {
								greater = matrix[p][j];
								lesser = matrix[p][j - 1];
								matrix[p][j - 1] = greater;
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
		
		System.out.println("Ёлементы строк по возрастанию:");
		
		iteration = true;
		for (int i = 0; i < string_number; i++) {
			for (int k = 0; k < column_number; k++) {
				while (iteration) {
					iteration = false;
					for (int p = 0; p < string_number; p++) {
						for (int j = 1; j < column_number; j++) {
							if (!(matrix[p][j] > matrix[p][j - 1])) {
								greater = matrix[p][j];
								lesser = matrix[p][j - 1];
								matrix[p][j - 1] = greater;
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
