package task_seven;

// �������� �����(�) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9.

public class Main {

	public static void main(String[] args) {
		
		int f = 0;
		
		for (int j = 1; j <= 9; j++) {
			if (j % 2 != 0) {
			f += Calculate_factorial.calculate(j);
			}
		}
		
		System.out.print(f);
	}

}
