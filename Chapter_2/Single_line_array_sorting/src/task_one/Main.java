package task_one;

/* Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
при этом не используя дополнительный массив. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int arr1_size = 0;
		System.out.print("ÂВведите размер первого массива ");
		arr1_size = StrictMath.abs(Input_value_int.Input_value(arr1_size));
		
		int arr2_size = 0;
		System.out.print("Введите размер второго массива ");
		arr2_size = StrictMath.abs(Input_value_int.Input_value(arr2_size));
		
		int k = 0;
		System.out.print("k=");
		k = StrictMath.abs(Input_value_int.Input_value(k));
		
		int[] arr1 = new int[arr1_size];
		for (int i = 0; i < arr1_size; i++) {
			arr1[i] = (int) (StrictMath.round(StrictMath.random() * 10));
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		
		int[] arr2 = new int[arr2_size];
		for (int i = 0; i < arr2_size; i++) {
			arr2[i] = (int) (StrictMath.round(StrictMath.random() * 10)) + 10;
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int[] result = new int[arr1_size + arr2_size];
		for (int i = 0; i <= k; i++) {
			result[i] = arr1[i];
		}
		for (int i = k + 1, j = 0; i < k + arr2_size + 1; i++, j++) {
			result[i] = arr2[j]; 
		}
		for (int i = k + arr2_size + 1, j = k + 1; i < arr1_size + arr2_size; i++) {
			result[i] = arr1[j];
		}
		for (int i = 0; i < arr1_size + arr2_size; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
