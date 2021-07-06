package lpsecond;

//Даны размеры А, В прямоугльного отверстия и размеры x, y, z, кирпича.
//Определить, пройдёт и кирпич через отверстие
import global.Input_value_double;

public class Task_four {

	public static void main(String[] args) {

		double A = 0;
		double B = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("Введите ширину и высоту отверстия");
		A = Input_value_double.Input_value(A);
		B = Input_value_double.Input_value(B);
		System.out.println("Введите длину, ширину, высоту кирпича");
		x = Input_value_double.Input_value(x);
		y = Input_value_double.Input_value(y);
		z = Input_value_double.Input_value(z);
		if ((A > x || A > y || A > z) & (B > y || B > x || B > z)) {
			System.out.println("Кирпич пройдёт");
		} else {
			System.out.println("Кирпич не пройдёт");
		}
	}
}
