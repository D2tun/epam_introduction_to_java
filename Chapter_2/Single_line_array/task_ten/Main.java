package task_ten;

/* ��� ������������� ������ � ����������� ��������� n. ����� ������, �������� �� ���� ������
������ ������� (�������������� �������� ��������� ������). ����������. ��������������
������ �� ������������. */

import global.Input_value_int;

public class Main {

	public static void main (String[] args) {
		
		int c = 1;
		int n = 0;
		System.out.print("������� ������ ������� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		System.out.println();
		
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) StrictMath.round(StrictMath.random()*101);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i  = 0; i < n; i++, c++) {
			if (c > 2) {
				c = 1;
			}
			if (c == 2) {
				arr[i] = 0;
			}
			System.out.print(arr[i] + " ");
		}
	}
}