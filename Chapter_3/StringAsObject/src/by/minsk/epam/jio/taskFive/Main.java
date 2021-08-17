package by.minsk.epam.jio.taskFive;

/*
 *  Подсчитать, сколько раз среди символов заданной строки встречается буква
 *  "a".
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку.");
		String enter = sc.next();

		int count = 0;
		for (int i = 0; i < enter.length(); i++) {
			if ((enter.charAt(i) == 'a') | (enter.charAt(i) == 'а')) {
				count++;
			}
		}
		System.out.println("Буква 'a' встретилась " + count + " раз.");
		sc.close();
	}
}
