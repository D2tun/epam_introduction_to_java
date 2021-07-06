package task_nine;

/* Задана матрица неотрицательных чисел. Посчиать сумму элементов в каждом столбце. Определить,
какой столбец содержит максимальную сумму. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int string_number = 0;
		System.out.print("Введите число строк ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));
		
		int column_number = 0;
		System.out.print("Введите число столбцов ");
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
		
		int[] sum = new int[column_number];
		for (int i = 0; i < column_number; i++) {
			for (int j = 0; j < string_number; j++) {
				sum[i] += matrix[j][i];
			}
			System.out.println("Сумма элементов свтолбца " + i + ": " + sum[i]);
		}
		
		int res = 0;
		int max_sum = 0;
		
		for (int i = 0; i < column_number; i++) {
			if (max_sum < sum[i]) {
				max_sum = sum[i];
			}
		}
		
		for (int i = 0; i < column_number; i++) {
			if (max_sum == sum[i]) {
				res = i;
			}
		}
		
		System.out.print(res + "-й столбец содержит максимальную сумму.");

	}

}
