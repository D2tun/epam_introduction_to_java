package task_three;

/* ��������� ������� ����������� �������������� �� �������� �, ��������� ����� ����������
������� ������������. */

import global.Input_value_double;

public class Main {

	public static void main(String[] args) {

		double a = 0;
		System.out.print("������� ������ ������� ����������� �������������� (��) ");
		a = StrictMath.abs(Input_value_double.Input_value(a));
		
		double square = Calculate_triangle_area.equilateral(a) * 6;
		
		System.out.println("S = " + square);
	}

}
