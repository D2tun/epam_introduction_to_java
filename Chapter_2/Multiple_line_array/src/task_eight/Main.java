package task_eight;

/* � �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������
������� ��������� �� ��������������� �� ������� �������, � ��� �������� ������� �����������
� ������. ������ �������� ������ ������������ � ����������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int column_number = 0;
		System.out.print("������� ����� �������� ");
		column_number = StrictMath.abs(Input_value_int.Input_value(column_number));

		int string_number = 0;
		System.out.print("������� ����� ����� ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));

		System.out.println();

		int[][] matrix = new int[string_number][column_number];
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 101);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		int a = 0;
		int b = 0;
		System.out.print("������� ������ ������������ �������� (�� 0 �� " + (column_number-1) + ") ");
		System.out.println();
		System.out.print("������� ����� ������� ������������� ������� ");
		a = StrictMath.abs(Input_value_int.Input_value(a));
		System.out.print("������� ����� ������� ������������� ������� ");
		b = StrictMath.abs(Input_value_int.Input_value(b));
		
		int first_replaced = 0;
		int second_replaced = 0;
		
		if (a > column_number-1 | b > column_number-1) {
			
			System.out.println("�����(�) ��������� ��� ����������� �������.");
		} else {
		
		for (int i = 0; i < string_number; i++) {
			first_replaced = matrix[i][a];
			second_replaced = matrix[i][b];
			matrix[i][a] = second_replaced;
			matrix[i][b] = first_replaced;
		}
		
		System.out.println("��������� �������: ");
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		}
	}

}
