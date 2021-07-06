package task_four;

/* ���������� ��������. ���� ������������������ ����� a1=<a2=<...=<an. ��������� ����������� ����� �
������� �����������. ��� ����� ������������ ��� �������� ����� ai � a[i+1]. ���� ai>a[i+1], ��
�������� ������������. ��� ������������ �� ��� ���, ���� ��� �������� �� ������ ����������� � 
������� �����������. ��������� �������� ����������, ����������� ���������� ������������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("������� ���������� ����� ");
		n = (int) StrictMath.abs(Input_value_int.Input_value(n));
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) StrictMath.round(StrictMath.random() * 101);
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		boolean iteration = true;
		int swap = 0;
		while (iteration) {
			iteration = false;
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1]) {
				int greater = arr[i - 1];
				int lesser = arr[i];
				arr[i - 1] = lesser;
				arr[i] = greater;
				swap++;
				iteration = true;
			}
			
		}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("����� ������������: " + swap);
	}

}
