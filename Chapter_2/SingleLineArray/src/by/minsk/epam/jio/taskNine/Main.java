package by.minsk.epam.jio.taskNine;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
 * них.
 */

import by.minsk.epam.jio.input.Input_value_int;

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
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < n; i++) {
				if (ar[i] < ar[i-1]) {
					greater = ar[i-1];
					lesser = ar[i];
					ar [i] = greater;
					ar [i-1] = lesser;
					needIteration = true;
				}
			}
		}
		for (int i = 0; i<n;i++) {
			System.out.print(ar[i] + " ");
		}
		
		int[] frequency = new int[n];

		int max = 0;
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ar[i] == ar[j]) {
					frequency[i]++;
					if (max < frequency[i]) {
						max = frequency[i];
					}
				}
			}
		}

		int[] frequencyCheck = new int[n];

		System.out.print("Наиболее часто встречающиеся числа: ");
		 for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((((frequency[i] == max) & (frequencyCheck[i] != ar[j])))) {
					frequencyCheck[i] = ar[i];
					break;
				}
			}
		}

		 int min = Integer.MAX_VALUE; 
		 for (int i = 0; i < n-1; i++) {
				if (((frequencyCheck[i] != 0) 
					& (frequencyCheck[i+1] != frequencyCheck[i]))
					& (frequency[i] == max) & (max > 1)) {
					System.out.print(frequencyCheck[i] + " ");
					}
				if ((frequencyCheck[i] < min) & (frequencyCheck[i] != 0) 
					& (frequency[i] == max) & (max > 1)) {
					min = frequencyCheck[i];
				}
		 }
				
		System.out.println();
		if (min != Integer.MAX_VALUE) {
			System.out.print("Меньшее из них: " + min);
		}
	}
}
