package task_one;

// �������� �����(�) ��� ��������� ����������� ������ �������� � ����������� ������ �������� 2 ����������� �����.

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.print("������� ������ ����� ");
		a = Input_value_int.Input_value(a);
		
		int b = 0;
		System.out.print("������� ������ ����� ");
		b = Input_value_int.Input_value(b);

		int nod = Compute_GCD_LCM.GCD(a, b);
		System.out.println("���������� ����� ��������: " + nod);
		
		int nok = Compute_GCD_LCM.LCM(a, b);
		System.out.println("���������� ����� ������� " + nok);
	}

}
