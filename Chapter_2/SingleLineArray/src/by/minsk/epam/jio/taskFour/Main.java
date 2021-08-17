package by.minsk.epam.jio.taskFour;

/*
 * Даны действительные числа а1, а2,..., an. Поменять местами наибольший и
 * наменьший элементы.
 */

import by.minsk.epam.jio.input.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int i;
		int greater = 0;
		int lesser = Integer.MAX_VALUE;
		int posG = 0;
		int posL = 0;
		
		System.out.print("Введите длину массива ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		int[] array = new int[n];
		
		for (i = 0; i < n; i++) {
			array[i] = (int) StrictMath.round(StrictMath.random() * 100);
			System.out.print(array[i] + " ");
		}
		for (i = 0 ; i < n; i++) {
			if (array[i] > greater) {
				greater = array[i];
				posG = i;
			}
			if (array[i] < lesser) {
				lesser = array[i];
				posL = i;
			}
		} 
		
		array[posL] = greater;
		array[posG] = lesser;
		System.out.println();
		
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
