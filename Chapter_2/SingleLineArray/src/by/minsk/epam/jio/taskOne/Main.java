package by.minsk.epam.jio.taskOne;

/*
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов,
 * которые кратны данному К.
 */

import by.minsk.epam.jio.input.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int K = 0;
		int N = 0;
		int sum = 0;

		System.out.print("Введите размер масcива ");
		N = Input_value_int.Input_value(N);
		System.out.print("Введите кратность ");
		K = Input_value_int.Input_value(K);

		int[] A = new int[StrictMath.abs(N)];

		for (int i = 0; i < StrictMath.abs(N); i++) {
			A[i] = (int) StrictMath.round(StrictMath.random() * 1000);
			System.out.print(A[i] + " ");
			if ((A[i] % K) == 0) {
				sum += A[i];
			}
		}
		System.out.println();
		System.out.println("Сумма чисел, кратных " + K + ": " + sum);
	}
}
