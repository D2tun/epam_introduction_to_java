package task_ten;

// Найти положительные элементы главой дигонали квадратной матрицы.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int size = 0;
		System.out.print("Введите размер квадратной матрицы ");
		size = StrictMath.abs(Input_value_int.Input_value(size));
		
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101) - 50;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Положительные элементы главной диагонали: ");
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j & matrix[i][j] > 0) {
				System.out.print(matrix[i][j] + " ");
				}
			}
		}
	}
}
