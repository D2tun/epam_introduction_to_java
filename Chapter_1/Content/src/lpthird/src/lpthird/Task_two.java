package lpthird;

//������: ��������� �������� ������� y=x, x>2; -x, x<=2 �� ������� [a, b] � ����� h.
import global.Input_value_double;

public class Task_two {

	public static void main(String[] args) {
		Input_value_double value = new Input_value_double();
		double a = 0;
		double b = 0;
		double h = 0;
		double y = 0;
		System.out.println("������� �������");
		a = Input_value_double.Input_value(a);
		System.out.println("������� ��������");
		b = Input_value_double.Input_value(b);
		System.out.println("������� ��� ����������");
		h = Input_value_double.Input_value(h);
		for (a = a; a <= b; a += h) {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.println("x=" + a + ", " + "y=" + y);
		}

	}

}
