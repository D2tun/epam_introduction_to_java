/*
 *  Вводится строка слов, разделённых пробелами. Найти самое длинное слово и
 * вывести его на экран. Случай, когда саых длинных слов может быть несколько,
 * не обрабатывать.
 */

package by.minsk.epam.jio.taskEight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слова через пробел.");
		String st = new String(sc.nextLine());

		int maxLength = 0;

		String[] words = st.split("\s");
		for (int i = 0; i < words.length; i++) {
			if (maxLength < words[i].length()) {
				maxLength = words[i].length();
				st = words[i];
			}
		}

		System.out.println(st);
		sc.close();
	}
}
