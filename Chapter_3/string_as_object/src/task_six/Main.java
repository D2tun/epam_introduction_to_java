package task_six;

// Из заданной строки получить новую, повторив каждый символ дважды.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку.");
		String a = sc.next();
		System.out.println(a);

		StringBuilder aa = new StringBuilder(a);
		for (int i = 0; i < aa.length(); i += 2) {
			aa.insert(i + 1, aa.charAt(i));
		}

		System.out.println(aa);
	}

}
