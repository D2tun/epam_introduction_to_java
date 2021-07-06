package task_one;

// Ќаписать метод(ы) дл€ нахожден€ наибольшего общего делител€ и наименьшего общего кратного 2 натуральных чисел.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.print("¬ведите первое число ");
		a = Input_value_int.Input_value(a);
		
		int b = 0;
		System.out.print("¬ведите второе число ");
		b = Input_value_int.Input_value(b);

		int nod = Compute_GCD_LCM.GCD(a, b);
		System.out.println("Ќаибольший общий делитель: " + nod);
		
		int nok = Compute_GCD_LCM.LCM(a, b);
		System.out.println("Ќаименьшее общее кратное " + nok);
	}

}
