package lpthird;

//������: �������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
//� ��������� ��������� ��� ����� �� 1 �� ��������� ������������� �����.
import global.Input_value_int;

public class Task_one {

	public static void main(String[] args) {
		Input_value_int value = new Input_value_int();
		int a = 0;
		int i = 0;
		int g = 0;
		System.out.println("������� ����� ������������� �����");
		a = Input_value_int.Input_value(a);
		if (a < 0) {
			System.out.println("����� ������ ���� �������������");
		} else {
			for (i = 1; i <= a; i++) {
				g = g + i;
			}
			System.out.println("����� ����� �� 1 �� " + a + ": " + g);

		}

	}

}
