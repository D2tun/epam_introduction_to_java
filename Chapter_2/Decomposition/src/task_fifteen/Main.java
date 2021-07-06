package task_fifteen;

/* ����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������ ������������������
(��������, 1234, 5789). ��� ������� ������ ������������ ������������. */

import task_twelve.Get_digits;
import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int lim_low = 0;
		System.out.print("������� ������ ������ ������ ");
		lim_low = Input_value_int.Input_value(lim_low);
		
		int lim_high = 0;
		System.out.print("������� ������� ������ ������ ");
		lim_high = Input_value_int.Input_value(lim_high);

		if (lim_low > lim_high) {
			int temp = lim_high;
			lim_high = lim_low;
			lim_low = temp;
		}
		
		for (int i = lim_low; i <= lim_high; i++) {
			int[] d = Get_digits.of(i);
			if (Upscaling_digits.is(d) == true) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
