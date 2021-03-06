/*
 * Написать метод(ы) для нахождения наибольшего общего делителя четырёх
 * натуральных чисел.
 */

package by.minsk.epam.jio.taskTwo;

import by.minsk.epam.jio.taskOne.GCDOrLCM;

public class Main {

	public static void main(String[] args) {

		int[] number = new int[4];
		for (int i = 0; i < 4; i++) {
			number[i] = (int) (StrictMath.random() * 101);
			System.out.print(number[i] + " ");
		}

		int nod = 0;
		for (int i = 1; i < 4; i++) {
			nod = GCDOrLCM.calculateGCD(number[i - 1], number[i]);
		}

		System.out.println();
		System.out.println("Набольший общий делитель: " + nod);
	}
}
