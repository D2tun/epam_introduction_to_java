package by.minsk.epam.jio.taskSix;

/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку.");
		String singleCharLine = sc.next();
		System.out.println(singleCharLine);

		StringBuilder duplicatedCharLine = new StringBuilder(singleCharLine);
		for (int i = 0; i < duplicatedCharLine.length(); i += 2) {
			duplicatedCharLine.insert(i + 1, duplicatedCharLine.charAt(i));
		}

		System.out.println(duplicatedCharLine);
		sc.close();
	}
}
