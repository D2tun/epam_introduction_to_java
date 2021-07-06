package lpsecond;

//Вычислить функции F(x)=(x^2)-3*x+9, если x<=3; 1/((x^3)+6), если х>3.
import global.Input_value_double;

public class Task_five {

	public static void main(String[] args) {
		double x = 0;
		double F = 0;
		Input_value_double value = new Input_value_double();
		System.out.print("x=");
		x = Input_value_double.Input_value(x);
		System.out.println(x);
		if (x > 3) {
			F = 1 / (StrictMath.pow(x, 3) + 6);
		} else {
			F = x * (x - 3) + 9;
		}
		System.out.println("F(x)=" + F);

	}

}
