package task_six;

/* Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые
номера которых являются простыми числами. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		int sum = 0;
		
		System.out.print("Введите количество чисел ");
		N = StrictMath.abs(Input_value_int.Input_value(N));
		
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = (int) (StrictMath.random() * 30);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			if (((i % 2) != 0) & ((i % 3) != 0) & ((i % 5) != 0) & ((i % 7) != 0) & (i != 1)) {
				System.out.print(a[i] + " ");
				sum += a[i];
			}
			if ((i == 2) | (i == 3) | (i == 5) | (i == 7) | (i == 1)) {
				System.out.print(a[i] + " ");
				sum += a[i];
			}
		}
		
		System.out.println();
		System.out.print(sum);
	}

}
