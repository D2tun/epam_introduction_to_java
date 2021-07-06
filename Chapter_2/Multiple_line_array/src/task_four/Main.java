package task_four;

// ������������ ���������� ������� ������ n �� ��������� ������� (��. 4 �������) (n - ������)

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("������� ������ ������� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					matrix[i][j] = j+1;
					System.out.print(matrix[i][j] + " ");
				} 
				
			} else {
				for (int j = 0, k = n; j < n; j++, k--) {
					matrix[i][j] = k;
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
