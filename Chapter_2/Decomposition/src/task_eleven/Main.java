package task_eleven;

/* �������� �����(�), ������������, � ����� �� ������ ���� ����� ������ ����. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n1 = 0;
		System.out.print("������� ������ ����� ");
		String num1 = String.valueOf(Input_value_int.Input_value(n1));
		int n2 = 0;
		System.out.print("������� ������ ����� ");
		String num2 = String.valueOf(Input_value_int.Input_value(n2));

		if (num1.length() > num2.length()) {
			System.out.println("� ������ ����� ������ ����.");
		}
		if (num1.length() < num2.length()) {
			System.out.println("�� ������ ����� ������ ����.");
		}
		if (num1.length() == num2.length()) {
			System.out.println("� ����� ������ ���������� ���������� ����.");
		}
	}

}
