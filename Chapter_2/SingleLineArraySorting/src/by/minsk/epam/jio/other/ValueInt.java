package by.minsk.epam.jio.other;

import java.util.Scanner;

public class ValueInt {
	
	public static int inputValue(int value) {
		
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Неверный формат данных");
		}
		value = sc.nextInt();
		return value;
	}
}
