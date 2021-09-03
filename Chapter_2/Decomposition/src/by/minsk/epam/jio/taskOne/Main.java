/*
 * Написать метод(ы) для нахождения наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел.
 */

package by.minsk.epam.jio.taskOne;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		System.out.print("Введите первое число ");
		a = ValueInt.inputValue(a);

		int b = 0;
		System.out.print("Введите второе число ");
		b = ValueInt.inputValue(b);

		int nod = GCDOrLCM.calculateGCD(a, b);
		System.out.println("Наибольший общий делитель: " + nod);

		int nok = GCDOrLCM.calculateLCM(a, b);
		System.out.println("Наименьшее общее кратное " + nok);
	}
}
