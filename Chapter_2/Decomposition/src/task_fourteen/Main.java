package task_fourteen;

/* ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����,
���������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k. ��� �������
������ ������������ ������������. */

import global.Input_value_int;
import task_twelve.Get_digits;

public class Main {

	public static void main(String[] args) {
		
		int k = 0;
		System.out.print("������� ������ ������ ");
		k = StrictMath.abs(Input_value_int.Input_value(k));

		System.out.print("����� ����������: ");
		
		for (int i = 1; i <= k; i++) {
			int[] d = Get_digits.of(i);
			boolean get = Armstrong_number.definition(d, i);
			if (get) {
				System.out.print(i + " ");
			}
		}
	}

}
