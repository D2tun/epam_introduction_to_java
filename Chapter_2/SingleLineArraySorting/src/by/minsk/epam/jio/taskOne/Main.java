package by.minsk.epam.jio.taskOne;

/* 
 * Заданы два одномерных массива с различным количеством элементов и
 * натуральное число k. Объединить их в один массив, включив второй массив
 * между k-м и (k+1)-м элементами первого, при этом не используя дополнительный
 * массив.
 */

import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int arr1Size = 0;
		System.out.print("Введите размер первого массива ");
		arr1Size = StrictMath.abs(ValueInt.inputValue(arr1Size));
		
		int arr2Size = 0;
		System.out.print("Введите размер второго массива ");
		arr2Size = StrictMath.abs(ValueInt.inputValue(arr2Size));
		
		int k = 0;
		System.out.print("k=");
		k = StrictMath.abs(ValueInt.inputValue(k));
		
		int[] arr1 = new int[arr1Size];
		for (int i = 0; i < arr1Size; i++) {
			arr1[i] = (int) (StrictMath.round(StrictMath.random() * 10));
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		
		int[] arr2 = new int[arr2Size];
		for (int i = 0; i < arr2Size; i++) {
			arr2[i] = (int) (StrictMath.round(StrictMath.random() * 10)) + 10;
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int[] result = new int[arr1Size + arr2Size];
		
		for (int i = 0; i <= k; i++) {
			result[i] = arr1[i];
		}
		for (int i = k + 1, j = 0; i < k + arr2Size + 1; i++, j++) {
			result[i] = arr2[j]; 
		}
		for (int i = k + arr2Size + 1, j = k + 1; i < arr1Size + arr2Size; i++) {
			result[i] = arr1[j];
		}
		for (int i = 0; i < arr1Size + arr2Size; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
