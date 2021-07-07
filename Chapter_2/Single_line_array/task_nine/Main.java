package task_nine;

import global.Input_value_int;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
число. Если таких чисел несколько, то определить наименьшее из них. */

public class Main {

	public static void main(String args[]) {

		int n = 0;
		System.out.print("Введите количество элементов ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		int[] ar = new int[n];

		System.out.println();
		for (int i = 0; i < n; i++) {
			ar[i] = (int) StrictMath.round(StrictMath.random() * 101);
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		int greater = 0;
		int lesser = 0;
		boolean NeedIteration = true;
		while (NeedIteration) {
			NeedIteration = false;
			for (int i = 1; i < n; i++) {
				if (ar[i] < ar[i-1]) {
					greater = ar[i-1];
					lesser = ar[i];
					ar [i] = greater;
					ar [i-1] = lesser;
					NeedIteration = true;
				}
			}
		}
		for (int i = 0; i<n;i++) {
			System.out.print(ar[i] + " ");
		}
		
		int[] f = new int[n];

		int max = 0;
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ar[i] == ar[j]) {
					f[i]++;
					if (max < f[i]) {
						max = f[i];
					}
				}
			}
		}

		int[] f_check = new int[n];

		System.out.print("Наиболее часто встречающиеся числа: ");
		 for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((((f[i] == max) & (f_check[i] != ar[j])))) {
					f_check[i] = ar[i];
					break;
				}
			}

		}

		 int min = Integer.MAX_VALUE; 
		 for (int i = 0; i < n-1; i++) {
				if (((f_check[i] != 0) & (f_check[i+1] != f_check[i])) & (f[i] == max) & (max > 1)) {
					System.out.print(f_check[i] + " ");
					}
				if ((f_check[i] < min) & (f_check[i] != 0) & (f[i] == max) & (max > 1)) {
					min = f_check[i];
				}
		 }
				
		System.out.println();
		if (min != Integer.MAX_VALUE) {
			System.out.print("Меньшее из них: " + min);
		}
	}

}
