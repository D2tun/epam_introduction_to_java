package task_two;

// ���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int size = 0;
		System.out.print("������� ������ ���������� ������� ");
		size = StrictMath.abs(Input_value_int.Input_value(size));

		System.out.println();

		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 80 + 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		System.out.print("������� ���������: ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(matrix[i][i] + " ");
		}

	}

}
