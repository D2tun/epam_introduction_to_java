/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только
 * нечётные цифры. Опредеить также, сколько чётных цифр в найденной сумме. Для
 * решения задачи использовать декомпозицию.
 */

package by.minsk.epam.jio.taskSixteen;

import by.minsk.epam.jio.input.ValueInt;
import by.minsk.epam.jio.taskTwelve.NumberToDigits;

public class Main {

	/* Уточнение: числа отрицательного диапазона и нуль не учитываются. */

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество разрядов чисел ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int sum = 0;

		for (int i = 1;;) {
			int[] num = NumberToDigits.split(i);
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

		System.out.println("Сумма чисел с нечётными цифрами, " + n 
						   + "-го разряда: " + sum);

		int[] sumNum = NumberToDigits.split(sum);

		int countEven = 0;
		for (int i = 0; i < sumNum.length; i++) {
			if (sumNum[i] % 2 != 0) {
				countEven++;
			}
		}

		System.out.println("Чётных цифр в сумме: " + countEven);
	}
}
