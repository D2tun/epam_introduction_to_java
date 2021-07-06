package task_seven;

/* ������������ ���������� ������� ������� N �� ������� A[I,J]=sin(((I^2)-(J^2))/N)
� ���������� ���������� ������������� ��������� � ���. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int N = 0;
		System.out.print("������� ������ ���������� ������� ");
		N = StrictMath.abs(Input_value_int.Input_value(N));

		System.out.println();

		int pos = 0;

		double[][] A = new double[N][N];
		for (int I = 0; I < N; I++) {
			for (int J = 0; J < N; J++) {
				A[I][J] = StrictMath.sin((I * I - J * J) / N);
				System.out.print(A[I][J] + " ");
				if (A[I][J] > 0) {
					pos++;
				}
			}
			System.out.println();
		}
		System.out.print("���������� ������������ ����� � �������: " + pos);
	}

}
