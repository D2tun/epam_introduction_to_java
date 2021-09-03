/*
 * Сформировать квадратную матрицу порядка N по правилу и подсчитать количество
 * положительных элементов в ней.
 */

package by.minsk.epam.jio.taskSeven;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int N = 0;
		System.out.print("Введите порядок квадратной матрицы ");
		N = StrictMath.abs(ValueInt.inputValue(N));

		System.out.println();

		int pos = 0;

		double[][] A = new double[N][N];
		for (int I = 0; I < N; I++) {
			for (int J = 0; J < N; J++) {
				A[I][J] = StrictMath.sin((I * I - J * J) / N);
				System.out.print(A[I][J] + " ");
				if (A[I][J] > 0) {
					pos++;
				}
			}
			System.out.println();
		}
		System.out.print("Положительных элементов в матрице: " + pos);
	}
}
