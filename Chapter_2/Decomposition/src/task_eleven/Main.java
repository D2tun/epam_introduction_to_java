package task_eleven;

/* Написать метод(ы), определяющий, в каком из данных двух чисел больше цифр. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n1 = 0;
		System.out.print("Введите первое число ");
		String num1 = String.valueOf(Input_value_int.Input_value(n1));
		int n2 = 0;
		System.out.print("Введите второе число ");
		String num2 = String.valueOf(Input_value_int.Input_value(n2));

		if (num1.length() > num2.length()) {
			System.out.println("В первом числе больше цифр.");
		}
		if (num1.length() < num2.length()) {
			System.out.println("Во втором числе больше цифр.");
		}
		if (num1.length() == num2.length()) {
			System.out.println("В обоих числах одинаковое количество цифр.");
		}
	}

}
