package task_five;

/* Заданы целые числа a1, a2, ..., an. Вывести на печать только те числа, для
которых ai>i */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int i;
		int n = 0;

		System.out.print("Введите количество чисел ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = (int) StrictMath.round(StrictMath.random() * 20) - 10;
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
