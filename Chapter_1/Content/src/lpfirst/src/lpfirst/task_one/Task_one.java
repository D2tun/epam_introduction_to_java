package lpfirst.task_one; //����� �������� �����

// ������: ��������� ��������� z=((a-3)*b/2)+c

import global.Input_value_double;

public class Task_one {

	public static void main(String[] args) {
		// ���� ���������
		double a=0;
		double b=0;
		double c=0;
		double z=0;
		Input_value_double input_value_double = new Input_value_double(); // �������� ���������� ������	
		System.out.println("������� �������� a");
		a = Input_value_double.Input_value(a);
		System.out.println("a=" + a);
		System.out.println("������� �������� b");
		b = Input_value_double.Input_value(b);
		System.out.println("b=" + b);
		System.out.println("������� �������� c");
		c = Input_value_double.Input_value(c);
		System.out.println("c=" + c);
		z = ((a - 3) * b / 2) + c;
		System.out.println("((" + a + "-3)*" + b + "/2)+" + c + "=" + z);
	}
}
