package task_two;

// Написать метод(ы) для нахождения наибольшего общего делителя четырёх натуральных чисел.

import task_one.Compute_GCD_LCM;

public class Main {

	public static void main(String[] args) {
		
		int[] number = new int [4];
		for (int i = 0; i < 4; i++) {
			number[i] = (int) (StrictMath.random() * 101);
			System.out.print(number[i] + " ");
		}
		
		int nod = 0;
		for (int i = 1; i < 4; i++) {
			nod = Compute_GCD_LCM.GCD(number[i - 1], number[i]);
		}
		
		System.out.println();
		System.out.println("Набольший общий делитель: " + nod);

	}

}
