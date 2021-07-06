package task_sixteen;

/* Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1,
2, 3, ..., n^2 так, что суммы по каждому солбцу, каждой строке и каждой из двух больших диагоналей
равны между собой. Построить такой квадрат. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите порядок магического квадрата ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		System.out.println();
		
		if (n < 3) {
			n = 3;
		}
		
		int[][] magical_square = new int[n][n];
		
		if (n % 2 != 0) { /* Алгоритм Лубера */
			magical_square = Magical_square_odd.Algorithm_of_Luber(magical_square, n);
		}
		
		if (n % 4 == 0) { /* Метод Рауза-Болла */
			magical_square = Magical_square_even.RauzBoll_method(magical_square, n);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magical_square[i][j] + " ");
			}
			System.out.println();
		}
	}
}