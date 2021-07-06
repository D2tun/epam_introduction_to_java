package task_two;

/* ���� ������������������ �������������� ����� a1, a2, ..., an.
�������� ��� � �����, ������� ������� Z, ���� ������. ���������� ���������� �����. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int Z = 0;
		String unchanged = "";
		String changed = "";
		int changes = 0;
		
		System.out.print("������� ���������� ����� � ������������������ ");
		n = Input_value_int.Input_value(n);
		System.out.print("������� ������ ");
		Z = Input_value_int.Input_value(Z);
		
		int[] a = new int[StrictMath.abs(n)];
		
		for (int i = 0; i<n; i++) {
			
			a[i] = (int) StrictMath.round(StrictMath.random() * 100);
			unchanged += (String.valueOf(a[i]) + " ");
			
			if (a[i] > Z) {
				a[i] = Z;
				changes++;
				
			}
			changed += (String.valueOf(a[i]) + " ");
		}
		
		System.out.print(unchanged);
		System.out.println();
		System.out.print(changed);
		System.out.println();
		System.out.print(changes + " �����");

	}

}