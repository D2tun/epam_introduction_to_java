/*
 * Даны действительные числа a1, a2, ..., an.
 * Найти max(a1+a2n, a2+a(2n-1), ..., an+a(n+1)).
 */

package by.minsk.epam.jio.taskSeven;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		int i;
		int ans = 0;

		System.out.print("Введите количество чисел ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = (int) StrictMath.round(StrictMath.random() * 51);
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (i = 0; i < n; i++) {
			if ((i != n - i - 1)) {
				if ((a[i] + a[n - i - 1]) > ans) {
					ans = a[i] + a[n - 1 - i];
				}
			}
		}

		System.out.println(ans);
	}
}
