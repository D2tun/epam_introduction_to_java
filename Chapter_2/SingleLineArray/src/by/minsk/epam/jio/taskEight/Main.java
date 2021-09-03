/*
 * Дана последовательность целых чисел a1, a2,..., an. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны 
 * min(a1, a2,..., an).
 */

package by.minsk.epam.jio.taskEight;

import by.minsk.epam.jio.input.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int i;
		int min = Integer.MAX_VALUE;
		
		System.out.print("Введите длину массива ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int[] arr = new int [n];
		
		System.out.print("Начальная последовательность: ");
		
		for (i = 0; i < n; i++) {
			arr[i] = (int) StrictMath.round(StrictMath.random() * 100);
			System.out.print(arr[i] + " ");
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.print("Изменённая последовательность: ");
		
		for(i = 0; i < n; i++) {
			if (arr[i] != min) {
				System.out.print(arr[i] + " ");
			}		
		}
	}
}
