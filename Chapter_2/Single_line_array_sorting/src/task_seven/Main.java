package task_seven;

/* ����� ���� ��� ����������� ������������������ �������������� ����� a1=<a2=<...=<an � b1=<b2=<...=<bm.
��������� ������� �� �����, �� ������� ����� ��������� �������� ������������������ b1=<b2=<...=<bm
� ������ ������������������ ���, ����� ����� ������������������ ���������� ������������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("������� ���������� ����� � ������������������ � ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int m = 0;
		System.out.print("������� ���������� ����� � ������������������ b ");
		m = StrictMath.abs(Input_value_int.Input_value(m));

		System.out.println();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i * 2;
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = i * 2 + 1;
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				if (b[j] > a[i]) {
					System.out.println("����� " + b[j] + " ����� �������� ����� ����� " + a[i]);
					break;
				}
			}
		}
	
	}

}
