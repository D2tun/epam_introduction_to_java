package lpfirst.task_two;

// ������: ��������� �������� ��������� �� ������� ((b+(((b^2)-4*a*c)^(1/2))/(2*a))-(a^3)*3+(b^-2) (��� ���������� ��������� �������������� ��������).
import global.Input_value_double;

public class task_two {

	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		double sum=0;
		
		Input_value_double value = new Input_value_double();
		System.out.println("������� �������� a");
		a = Input_value_double.Input_value(a);
		System.out.println("a=" + a);
		System.out.println("������� �������� b");
		b = Input_value_double.Input_value(b);
		System.out.println("b=" + b);
		System.out.println("������� �������� c");
		c = Input_value_double.Input_value(c);
		System.out.println("c=" + c);
		sum = (b + StrictMath.sqrt(StrictMath.pow(b, 2) + 4 * a * c)) - StrictMath.pow(a, 3) * c + StrictMath.pow(b, -2);
		System.out.println("���������: " + sum);
	}

}
