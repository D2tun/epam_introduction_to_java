package lpsecond;

//���� ������� �, � ������������� ��������� � ������� x, y, z, �������.
//����������, ������ � ������ ����� ���������
import global.Input_value_double;

public class Task_four {

	public static void main(String[] args) {

		double A = 0;
		double B = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("������� ������ � ������ ���������");
		A = Input_value_double.Input_value(A);
		B = Input_value_double.Input_value(B);
		System.out.println("������� �����, ������, ������ �������");
		x = Input_value_double.Input_value(x);
		y = Input_value_double.Input_value(y);
		z = Input_value_double.Input_value(z);
		if ((A > x || A > y || A > z) & (B > y || B > x || B > z)) {
			System.out.println("������ ������");
		} else {
			System.out.println("������ �� ������");
		}
	}
}
