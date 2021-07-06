package task_three;

// ���� �������. ������� k-� ������ � p-� ������� �������.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int column_number = 0;
		System.out.print("������� ���������� �������� ");
		column_number = StrictMath.abs(Input_value_int.Input_value(column_number));

		int string_number = 0;
		System.out.print("������� ���������� ����� ");
		string_number = StrictMath.abs(Input_value_int.Input_value(string_number));

		int[][] matrix = new int[string_number][column_number];
		for (int i = 0; i < string_number; i++) {
			for (int j = 0; j < column_number; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 51);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int k = 0;
		System.out.print("������� ����� ������ ");
		k = StrictMath.abs(Input_value_int.Input_value(k));

		int p = 0;
		System.out.print("������� ����� ������� ");
		p = StrictMath.abs(Input_value_int.Input_value(p));

		if (k > string_number) {
			System.out.print("������� ������ ��������� ��� �������.");
		} else {
			System.out.print(k + "-�� ������: ");
			for (int j = 0; j < column_number; j++) {
				System.out.print(matrix[k-1][j] + " ");
			}
		}
		
		System.out.println();
		
		if (p > column_number) {
			System.out.print("������� ������� ��������� ��� �������.");
		} else {
			System.out.print(p + "-� �������: ");
			for (int i = 0; i < string_number; i++) {
				System.out.print(matrix[i][p-1] + " ");
			}
		}

	}

}
