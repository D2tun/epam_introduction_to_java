/*
 * Найдите наибольший элемент матрицы и заменить все нечётные элементы на него.
 */

package by.minsk.epam.jio.taskFifteen;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int max = 0;
		
		int stringNumber = 0;
		System.out.print("Введите количество строк");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));

		int columnNumber = 0;
		System.out.print("Введите количество столбцов");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));
		
		int[][] matrix = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = max;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
