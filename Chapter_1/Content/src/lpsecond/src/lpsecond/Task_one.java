package lpsecond;

//������: ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������,�
//���� ��, �� ����� �� �� �������������.
import global.Input_value_double;

public class Task_one {

	public static void main(String[] args) {
		double angle1 = 0;
		double angle2 = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("������� ������ ���� (� ��������)");
		angle1 = Input_value_double.Input_value(angle1);
		System.out.println("������� ������ ���� (� ��������)");
		angle2 = Input_value_double.Input_value(angle2);
		double angle3 = 180 - angle1 - angle2;
		if (angle3 < 90) {
			System.out.println("����� ����������� ����������, ��� ��� ���� ������.");
		} else {
			if (angle3 == 90) {
				System.out.println("����� ����������� ����������, �� �������������.");
			} else {
				System.out.println("����� ����������� �� ����������.");
			}
		}
	}

}
