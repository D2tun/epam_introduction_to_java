package task_five;

/* ���������� ���������. ���� ������������������ ����� �1, a2, ..., an. ��������� ����������� �����
� ������� �����������. �������� ��� ��������� �������. ����� a1, a2, ..., ai - ������������� ������������������,
�. �. a1=<a2=<...=<an. ������ ��������� ����� a[n+1] � ����������� � ������������������ ���, �����
����� ������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� ��������
�� i+1 �� n �� ����� ���������. ����������. ����� ��������� ���������� �������� � ���������������
����� ����������� � ������� ��������� ������. �������� ����� �������� � ���� ���������� �������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		System.out.print("������� ���������� ����� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			if (i <= 2) {
				a[i] = i;
			} else {
				a[i] = (int) StrictMath.round(StrictMath.random() * 101) + 2;
			}
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 3; i < n; i++) {
			int number = a[i];
			int indexToInsert = search.binary(a, number, i);
			for (int j = i; j > indexToInsert; j--) {
				a[j] = a[j - 1];
			}
			a[indexToInsert] = number;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
