package task_thirteen;

/* ��� ������� ����� ���������� "����������", ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
����� � ���������� ��� ���� "���������" �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2.
��� ������� ������ ������������ ������������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("������� ������ ������ ������ ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int[] number = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			number[i] = n + i;
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		int[] prime_num = Prime_number.search(number);
		

		
		Search_twin.search(prime_num);
		


	}

}
