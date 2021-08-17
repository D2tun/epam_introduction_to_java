package by.minsk.epam.jio.taskTwo;

/* 
 * Даны последовательности a1<a2<...<an и b1<b2<...<bm. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей. Примечание.
 * Дополнительный массив не использовать.
 */

import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество чисел a ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int m = 0;
		System.out.print("Введите количество чисел b ");
		m = StrictMath.abs(ValueInt.inputValue(m));

		int[] ab = new int[n + m];
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) StrictMath.round(StrictMath.random() * 101);
			ab[i] = a[i];
		}

		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < n; i++) {
				if (a[i - 1] > a[i]) {
					int greater = a[i-1];
					int lesser = a[i];
					a[i] = greater;
					a[i-1] = lesser;
					iteration = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = (int) StrictMath.round(StrictMath.random() * 101);
			ab[n + i] = b[i];
		}

		iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < m; i++) {
				if (b[i - 1] > b[i]) {
					int greater = b[i-1];
					int lesser = b[i];
					b[i] = greater;
					b[i-1] = lesser;
					iteration = true;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < n + m; i++) {
				if (ab[i - 1] > ab[i]) {
					int greater = ab[i-1];
					int lesser = ab[i];
					ab[i] = greater;
					ab[i-1] = lesser;
					iteration = true;
				}
			}
		}
		
		for (int i = 0; i < n + m; i++) {
			System.out.print(ab[i] + " ");
		}
	}
}
