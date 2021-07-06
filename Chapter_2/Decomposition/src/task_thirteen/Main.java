package task_thirteen;

/* Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("Введите нижний предел поиска ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int[] number = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			number[i] = n + i;
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		int[] prime_num = Prime_number.search(number);
		

		
		Search_twin.search(prime_num);
		


	}

}
