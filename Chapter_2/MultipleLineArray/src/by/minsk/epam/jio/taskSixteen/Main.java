package by.minsk.epam.jio.taskSixteen;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3,...,n^2 так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 */

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите порядок магического квадрата ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		System.out.println();
		
		if (n < 3) {
			n = 3;
		}
		
		int[][] magicalSquare = new int[n][n];
		
		if (n % 2 != 0) {
			magicalSquare = MagicalSquareOdd.buildAlgorithmOfLuber(magicalSquare, n);
		}
		
		if (n % 4 == 0) {
			magicalSquare = MagicalSquareEven.buildRauzBollMethod(magicalSquare, n);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magicalSquare[i][j] + " ");
			}
			System.out.println();
		}
	}
}