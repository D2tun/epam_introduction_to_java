package task_two;

/* �������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. ��������
�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ����������
������. */

import task_one.Input_value_double;

public class Main {

	public static void main(String[] args) {

		double value = 0;

		Test2 t = new Test2(2, 4);
		System.out.println("������ �����: " + t.get_num1());
		System.out.println("������ �����: " + t.get_num2());
		System.out.print("������� �������� ������� �����: ");
		t.set_num1(Input_value_double.Input_value(value));
		System.out.print("������� �������� ������� �����: ");
		t.set_num2(Input_value_double.Input_value(value));
		System.out.println("������ �����: " + t.get_num1());
		System.out.println("������ �����: " + t.get_num2());
	}

}
