package task_one;

// Написать метод(ы) для нахожденя наибольшего общего делителя и наименьшего общего кратного 2 натуральных чисел.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.print("Введите первое число ");
		a = Input_value_int.Input_value(a);
		
		int b = 0;
		System.out.print("Введите второе число ");
		b = Input_value_int.Input_value(b);

		int nod = Compute_GCD_LCM.GCD(a, b);
		System.out.println("Наибольший общий делитель: " + nod);
		
		int nok = Compute_GCD_LCM.LCM(a, b);
		System.out.println("Наименьшее общее кратное " + nok);
	}

}
