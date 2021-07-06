package task_sixteen;

/* Написать программу, определяющую сумму n-значных чисел, содержащих только нечётные цифры. Определить
также, сколько чётных цифр найдено в сумме. Для решения задачи использовать декомпозицию. */

/* Уточнение: числа отрицательного диапазона и нуль не учитываются. */

import task_twelve.Get_digits;
import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество разрядов чисел ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		int sum = 0;

		for (int i = 1;;) {
			int[] num = Get_digits.of(i);
			if (num.length < n) {
				i *= StrictMath.pow(10, n - 1);
			}
			if (num.length == n) {
				sum += i;
				i++;
			}
			if (num.length > n) {
				break;
			}
		}

		System.out.println("Сумма чисел с нечётными цифрами, " + n + "-го разряда: " + sum);

		int[] sum_num = Get_digits.of(sum);

		int count_even = 0;
		for (int i = 0; i < sum_num.length; i++) {
			if (sum_num[i] % 2 != 0) {
				count_even++;
			}
		}

		System.out.println("Чётных цифр в сумме: " + count_even);

	}

}
