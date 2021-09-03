/*
 * Вывести на экран соответствий между символами и их численными 
 * обозначениями в памяти компьютера.
 */

package by.minsk.epam.jio.taskList;

import java.util.Scanner;

public class TaskSix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String i = scanner.next();
		char ch = i.charAt(0);
		int a = (int) ch;
		System.out.println("Символу " + ch + " соответствует код " + a);
		scanner.close();
	}
}
