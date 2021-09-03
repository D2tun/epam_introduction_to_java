/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элеметов в каждом
 * столбце. Определить, какой столбец содержит максимальную сумму
 */

package by.minsk.epam.jio.taskNine;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int stringNumber = 0;
		System.out.print("Введите количество строк ");
		stringNumber = StrictMath.abs(ValueInt.inputValue(stringNumber));
		
		int columnNumber = 0;
		System.out.print("Введите количество столбцов ");
		columnNumber = StrictMath.abs(ValueInt.inputValue(columnNumber));
		
		System.out.println();
		
		int[][] matrix = new int[stringNumber][columnNumber];
		for (int i = 0; i < stringNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] sum = new int[columnNumber];
		for (int i = 0; i < columnNumber; i++) {
			for (int j = 0; j < stringNumber; j++) {
				sum[i] += matrix[j][i];
			}
			System.out.println("Сумма элементов столбца " + i + ": " + sum[i]);
		}
		
		int res = 0;
		int maxSum = 0;
		
		for (int i = 0; i < columnNumber; i++) {
			if (maxSum < sum[i]) {
				maxSum = sum[i];
			}
		}
		
		for (int i = 0; i < columnNumber; i++) {
			if (maxSum == sum[i]) {
				res = i;
			}
		}
		
		System.out.print(res + "-й столбец имеет наибольшую сумму элементов");
	}
}
