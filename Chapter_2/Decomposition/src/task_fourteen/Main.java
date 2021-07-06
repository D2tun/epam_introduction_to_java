package task_fourteen;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведённая в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения
задачи использовать декомпозицию. */

import global.Input_value_int;
import task_twelve.Get_digits;

public class Main {

	public static void main(String[] args) {
		
		int k = 0;
		System.out.print("Введите предел поиска ");
		k = StrictMath.abs(Input_value_int.Input_value(k));

		System.out.print("Числа Армстронга: ");
		
		for (int i = 1; i <= k; i++) {
			int[] d = Get_digits.of(i);
			boolean get = Armstrong_number.definition(d, i);
			if (get) {
				System.out.print(i + " ");
			}
		}
	}

}
