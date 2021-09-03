/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */

package by.minsk.epam.jio.taskSix;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		int sum = 0;
		
		System.out.print("Введите количество чисел ");
		N = StrictMath.abs(ValueInt.inputValue(N));
		
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = (int) (StrictMath.random() * 30);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			if (((i % 2) != 0) & ((i % 3) != 0) & ((i % 5) != 0) 
					& ((i % 7) != 0) & (i != 1)) {
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
