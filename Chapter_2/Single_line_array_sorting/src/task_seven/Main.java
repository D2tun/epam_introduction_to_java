package task_seven;

/* Пусть даны две неубывающие последовательности действительных чисел a1=<a2=<...=<an и b1=<b2=<...=<bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1=<b2=<...=<bm
в первую последовательность так, чтобы новая последовательность оставалась возрастающей. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("Введите количество чисел в последовательности а ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int m = 0;
		System.out.print("Введите количество чисел в последовательности b ");
		m = StrictMath.abs(Input_value_int.Input_value(m));

		System.out.println();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i * 2;
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = i * 2 + 1;
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				if (b[j] > a[i]) {
					System.out.println("Число " + b[j] + " нужно вставить после числа " + a[i]);
					break;
				}
			}
		}
	
	}

}
