package task_fifteen;

// Найдите наибольший элемент матрицы и заменить все нечётные элементы на него.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int max = 0;
		
		int string_number = 0;
		System.out.print("Введите количество строк ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));

		int column_number = 0;
		System.out.print("Введите количество столбцов ");
		column_number = StrictMath.abs(Input_value_int.Input_value(column_number));
		
		int[][] matrix = new int[string_number][column_number];
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = max;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
