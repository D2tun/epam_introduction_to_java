package task_one;

/* Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше
последнего. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int column_number = 0;
		System.out.print("Введите количество столбцов ");
		column_number = StrictMath.abs(Input_value_int.Input_value(column_number));

		System.out.println();

		int string_number = 0;
		System.out.print("Введите количество строк ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));

		int[][] arr = new int[string_number][column_number];
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				arr[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < column_number; j++) {
			if (j != 0 & j % 2 != 0) {
				if (arr[0][j] > arr[string_number - 1][j]) {
					for (int k = 0; k < string_number; k++) {
						System.out.print(arr[k][j] + " ");
					}
					System.out.println(" ");
				}
			}
		}
	}

}
