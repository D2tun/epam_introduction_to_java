package task_ten;

/* ���� ����������� ����� N. �������� �����(�) ��� ������������ �������, ���������� ��������
�������� ����� ����� N. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int number = 0;
		System.out.print("������� ����������� ����� ");
		String num = String.valueOf(Input_value_int.Input_value(number));
		
		char[] digit = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			digit[i] =  (num.charAt(i));
		}
		
		for (int i = 0; i < num.length(); i++) {
			System.out.print(digit[i] + " ");
		}

	}

}
