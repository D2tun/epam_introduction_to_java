package task_seventeen;

/* �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. �������
����� �������� ���� ����������, ����� ��������� ����? ��� ������� ������������ ������������. */

import global.Input_value_int;
import task_twelve.Get_digits;

public class Main {

	public static void main(String[] args) {
		
		int number = 0;
		System.out.print("������� ����� ");
		number = StrictMath.abs(Input_value_int.Input_value(number));
		
		int sum = 0;
		int count = 0;
		while (number > 0) {
			sum = Get_sum_of.digits(Get_digits.of(number));
			count++;
			number -= sum;
		}
		
		System.out.println("����� ���������� " + count + " ��������.");
	}

}
