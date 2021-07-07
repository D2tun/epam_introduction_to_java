package task_one;

/* �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ����
����������. �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� �������
���������� �������� �� ���� ���� ����������. */

public class Test1 {

	private static double num1;
	private static double num2;

	public static void main(String[] args) {

		enter_numbers();
		output_variables();
		System.out.println(num1 + " + " + num2 + " = " + sum());
		System.out.println("���������� �����: " + largest_number());
	}

	public static void enter_numbers() {

		System.out.print("�������� ����� num1: ");
		num1 = Input_value_double.Input_value(num1);
		System.out.print("�������� ����� num2: ");
		num2 = Input_value_double.Input_value(num2);
	}

	public static void output_variables() {
		System.out.println("�������� ����� num1 � num2:");
		System.out.println(num1 + "; " + num2);
	}

	public static double sum() {
		double sum = num1 + num2;
		return sum;
	}

	public static double largest_number() {
		if (num2 > num1) {
			return num2;
		} else {
			return num1;
		}
	}

}