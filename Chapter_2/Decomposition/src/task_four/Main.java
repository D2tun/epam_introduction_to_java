package task_four;

/* �� ��������� ������ ������ ������������ n �����. �������� �����(�), ������������, ����� ������
�� ��� ����� ����� ������� ����������. ��������. ���������� ����� ������� � ������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		System.out.print("������� ���������� ����� ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		double[] x = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = StrictMath.random() * 101;
		}

		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			y[i] = StrictMath.random() * 101;
		}

		double distance = 0;
		double distance_max = 0;
		int i_max = -1;
		int j_max = -1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				distance = Calculate_distance_between.dots(x[i], y[i], x[j], y[j]);
				if (distance_max < distance) {
					distance_max = distance;
					i_max = i;
					j_max = j;
				}
			}
		}

		System.out.println("���������� ����� " + i_max + "-� � " + j_max + "-� ������� - ����������.");
	}

}
