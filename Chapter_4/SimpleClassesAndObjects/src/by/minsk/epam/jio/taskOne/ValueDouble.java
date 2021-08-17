package by.minsk.epam.jio.taskOne;

import java.util.Scanner;

public class ValueDouble {
	
	public static double inputValue(double value) {
		
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Неверный формат данных");
		}
		
		value = sc.nextDouble();
		
		return value;
	}
}