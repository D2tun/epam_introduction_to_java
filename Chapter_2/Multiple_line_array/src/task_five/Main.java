package task_five;

//������������ ���������� ������� ������� n �� ��������� ������� (��. ������� 5) (n - ������)

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("������� ������ ���������� ������� ");
		n = Input_value_int.Input_value(n);
		
		int k = n;
		
		System.out.println();
		
		int[][] matrix = new int[n][n];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				matrix[i][j] = j+1;
				if (i > k-1) {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			k--;
		}
		

	}

}
