package task_three;

/* ���������� �������. ���� ������������������ ����� �1<a2<...<an. ��������� ����������� ��������
���, ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ����������
���������� ������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� ��
�������, ��� ��������� �����������. �������� �������� ���������� �������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("������� ���������� ����� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (StrictMath.round(StrictMath.random() * 101));
		}
		for (int first = 0; first < n; first++) {
			int max = first;
			for (int i = first; i < n; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
			int lesser = arr[first];
			int greater = arr[max];
			arr[first] = greater;
			arr[max] = lesser;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
