package task_five;

/* ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� (������� �� ������ �����,
������� ������ ������������� �������� �������, �� ������ ���� ������ ���������). */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		System.out.print("������� ������ ������� ");
		N = StrictMath.abs(Input_value_int.Input_value(N));
		
		int max = 0;
		int i_max = 0;
		
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = (int) StrictMath.round(StrictMath.random() * 101);
			System.out.print(A[i] + " ");
			if (A[i] > max) {
				max = A[i];
				i_max = i;
			}
		}

		max = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] > max & i != i_max) {
				max = A[i];
			}
		}
		
		System.out.println();
		System.out.print(max);
		
	}

}