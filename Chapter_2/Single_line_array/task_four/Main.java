package task_four;

/* Даны действительные числа a1, a2, ..., an.
Поменять местами наибольший и наименьший элементы.*/

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int i;
		int greater = 0;
		int lesser = Integer.MAX_VALUE;
		int posg = 0;
		int posl = 0;
		
		System.out.print("Введите количество чисел ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		int[] Array = new int[n];
		
		for (i = 0; i < n; i++) {
			Array[i] = (int) StrictMath.round(StrictMath.random()*100);
			System.out.print(Array[i] + " ");
		}
		for (i = 0 ; i < n; i++) {
			if (Array[i] > greater) {
				greater = Array[i];
				posg = i;
			}
			if (Array[i] < lesser) {
				lesser = Array[i];
				posl = i;
			}
		} 
		
		Array[posl] = greater;
		Array[posg] = lesser;
		System.out.println();
		
		for (i = 0; i < n; i++) {
			System.out.print(Array[i] + " ");
		}


	}

}
