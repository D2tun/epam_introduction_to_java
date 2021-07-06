package global;

import java.util.Scanner;

public class Input_value_double {
	public static double Input_value(double value) {
		
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Неверный формат данных");
		}
		value = sc.nextDouble();
		return value;

	}
}