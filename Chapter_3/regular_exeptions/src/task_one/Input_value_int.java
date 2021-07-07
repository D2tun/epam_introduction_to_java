package task_one;

import java.util.Scanner;

public class Input_value_int {
	public static int Input_value(int value) {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Неверный формат данных");
		}
		value = sc.nextInt();
		return value;

	}
}