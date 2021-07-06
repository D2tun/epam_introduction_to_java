package task_sixteen;

/* ���������� ��������� ������� n ���������� ���������� ������� ������� nxn, ������������ �� ����� 1,
2, 3, ..., n^2 ���, ��� ����� �� ������� ������, ������ ������ � ������ �� ���� ������� ����������
����� ����� �����. ��������� ����� �������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("������� ������� ����������� �������� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		System.out.println();
		
		if (n < 3) {
			n = 3;
		}
		
		int[][] magical_square = new int[n][n];
		
		if (n % 2 != 0) { /* �������� ������ */
			magical_square = Magical_square_odd.Algorithm_of_Luber(magical_square, n);
		}
		
		if (n % 4 == 0) { /* ����� �����-����� */
			magical_square = Magical_square_even.RauzBoll_method(magical_square, n);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magical_square[i][j] + " ");
			}
			System.out.println();
		}
	}
}