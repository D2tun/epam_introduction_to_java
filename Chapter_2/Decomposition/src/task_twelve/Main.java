package task_twelve;

/* Даны натуральные числа K и N. Написать метод(ы) формирования массива А, элементами которого являются
числа, сумма цифр которых равна K и которые не больше N. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int K = 0;
		System.out.print("Введите число К ");
		K = Input_value_int.Input_value(K);
		
		int N = 0;
		System.out.print("Введите число N ");
		N = Input_value_int.Input_value(N);
		
		int count = 0;
		int[] A = new int[1000];
		for (int i = 1; i < N; i++) {
			int[] num = Get_digits.of(i);
			int sum = 0;
			for (int j = 0; j < num.length; j++) {
				sum += num[j];
			}
			if (sum == K) {
				A[count] = i;
				count++;
			}
		}
		
		System.out.println();
		
		for (int i = 0 ; i < count; i++) {
			if (A[i] != 0) {
			System.out.print(A[i] + " ");
			}
		}
	}

}
