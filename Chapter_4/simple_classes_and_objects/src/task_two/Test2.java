package task_two;

/* �������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. ��������
�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ����������
������. */

public class Test2 {

	private double num1;
	private double num2;

	public Test2() {

		num1 = 0;
		num2 = 0;
	}

	public Test2(double num1, double num2) {

		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void set_num1(double num1) {
		this.num1 = num1;
	}

	public void set_num2(double num2) {
		this.num2 = num2;
	}

	public double get_num1() {
		return this.num1;
	}

	public double get_num2() {
		return this.num2;
	}

}
