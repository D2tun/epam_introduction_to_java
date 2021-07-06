package task_three;

/* ��� ������ ������������� �����, ����������� �������� N.
����������, ������� � �� �������������, ������������� � ������� ���������. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		int QOP = 0;
		int QON = 0;
		int QOZ = 0;
		String ar = "";
		
		System.out.print("������� ������ ������� ");
		N = StrictMath.abs(Input_value_int.Input_value(N));
		
		int[] Array = new int [N];
		
		for (int i = 0; i < N; i++) {
			Array[i] = (int) StrictMath.round(StrictMath.random() * 100) - 50;
			if (Array[i] > 0) {
				QOP++;
			}
			if (Array[i] < 0) {
				QON++;
			}
			if (Array[i] == 0) {
				QOZ++;
			}
			ar += (String.valueOf(Array[i]) + " ");
		}

		System.out.print(ar);
		System.out.println();
		System.out.print(QOP + " ������������� ���������, " + QOZ + " ������� ���������, " + QON + " ������������� ���������.");
	}

}
