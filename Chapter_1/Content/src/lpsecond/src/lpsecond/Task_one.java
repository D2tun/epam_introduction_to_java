package lpsecond;

//Задача: даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,и
//если да, то будет ли он прямоугольным.
import global.Input_value_double;

public class Task_one {

	public static void main(String[] args) {
		double angle1 = 0;
		double angle2 = 0;
		Input_value_double value = new Input_value_double();
		System.out.println("Введите первый угол (в градусах)");
		angle1 = Input_value_double.Input_value(angle1);
		System.out.println("Введите второй угол (в градусах)");
		angle2 = Input_value_double.Input_value(angle2);
		double angle3 = 180 - angle1 - angle2;
		if (angle3 < 90) {
			System.out.println("Такой треугольник существует, все его углы острые.");
		} else {
			if (angle3 == 90) {
				System.out.println("Такой треугольник существует, он прямоугольный.");
			} else {
				System.out.println("Такой треугольник не существует.");
			}
		}
	}

}
