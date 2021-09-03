/*
 * Написать метод(ы), проверяющий, являются ли данные три числа взаимно
 * простыми.
 */

package by.minsk.epam.jio.taskSix;

import by.minsk.epam.jio.input.ValueInt;
import by.minsk.epam.jio.taskOne.GCDOrLCM;

public class Main {

	public static void main(String[] args) {

		int[] number = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Введите " + (i + 1) + "-е число");
			number[i] = ValueInt.inputValue(number[i]);
		}

		int nod = 0;
		boolean mutuallySimple = true;
		for (int i = -1; i < 3; i++) {
			if (i < 0) {
				nod = GCDOrLCM.calculateGCD(number[0], number[2]);
				i++;
			} else {
				nod = GCDOrLCM.calculateGCD(number[i - 1], number[i]);
			}
			if (nod != 1) {
				mutuallySimple = false;
				break;
			}
		}

		if (mutuallySimple == true) {
			System.out.println("Числа являются взаимно простыми.");
		} else {
			System.out.println("Числа не являются взаимно простыми.");
		}
	}
}
