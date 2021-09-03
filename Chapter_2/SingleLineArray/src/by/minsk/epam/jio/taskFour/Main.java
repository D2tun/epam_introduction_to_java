/*
 * Даны действительные числа а1, а2,..., an. Поменять местами наибольший и
 * наменьший элементы.
 */

package by.minsk.epam.jio.taskFour;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int i;
		int greater = 0;
		int lesser = Integer.MAX_VALUE;
		int posG = 0;
		int posL = 0;
		
		System.out.print("Введите длину массива ");
		n = StrictMath.abs(ValueInt.inputValue(n));
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
