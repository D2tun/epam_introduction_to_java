package lpfirst.task_four;

import java.util.List;

//������: ���� �������������� ����� R ���� nnn.ddd. �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
import global.Input_value_double;

public class Task_four {

	public static void main(String[] args) {
		double R = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("������� �������������� ����� R");
		R = Input_value_double.Input_value(R);
		double a = StrictMath.round(R);
		double b = (R - a) * 1000;
		System.out.println((int) b + "." + (int) a);

	}
}
