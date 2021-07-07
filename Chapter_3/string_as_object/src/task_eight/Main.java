package task_eight;

/* Вводится строка слов, разделённых пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда саых длинных слов может быть несколько, не обрабатывать. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слова через пробел.");
		String st = new String(sc.nextLine());

		int L = 0;

		String[] Q = st.split("\s");
		for (int i = 0; i < Q.length; i++) {
			if (L < Q[i].length()) {
				L = Q[i].length();
				st = Q[i];
			}
		}

		System.out.println(st);

	}

}
