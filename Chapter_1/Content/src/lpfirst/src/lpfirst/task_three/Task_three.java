package lpfirst.task_three;

//������: ��������� �������� ��������� �� ������� ((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(yx) (��� ���������� ��������� �������������� ��������.
import global.Input_value_double;

public class Task_three {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double result = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("������� �������� �");
		x = Input_value_double.Input_value(x);
		System.out.println("x=" + x);
		System.out.println("������� �������� y");
		y = Input_value_double.Input_value(y);
		System.out.println("y=" + y);
		result = (((StrictMath.sin(x)) + (StrictMath.cos(y))) / ((StrictMath.cos(x) - StrictMath.sin(y)))) * StrictMath.tan(x * y);
		System.out.println("((sin(" + x + ")+cos(" + y + "))/(cos(" + x + ")-sin(" + y + ")))*tg(" + x * y + ")=" + result);

	}

}
