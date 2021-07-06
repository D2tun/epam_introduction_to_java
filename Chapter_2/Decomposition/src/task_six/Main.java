package task_six;

// Написать метод(ы), проверяющий, являются ли данные три числа взаимно простыми.

import global.Input_value_int;
import task_one.Compute_GCD_LCM;

public class Main {

	public static void main(String[] args) {

		int[] number = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Введите " + (i + 1) + "-е число");
			number[i] = Input_value_int.Input_value(number[i]);
		}

		int nod = 0;
		boolean mutually_simple = true;
		for (int i = -1; i < 3; i++) {
			if (i < 0) {
				nod = Compute_GCD_LCM.GCD(number[0], number[2]);
				i++;
			} else {
				nod = Compute_GCD_LCM.GCD(number[i - 1], number[i]);
			}
			if (nod != 1) {
				mutually_simple = false;
				break;
			}
		}

		if (mutually_simple == true) {
			System.out.println("Числа являются взаимно простыми.");
		} else {
			System.out.println("Числа не являются взаимно простыми.");
		}
	}

}
