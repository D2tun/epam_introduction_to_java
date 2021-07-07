package task_nine;

/* Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать
только английские буквы. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку.");
		String G = sc.nextLine();
		
		int counter_b = 0;
		int counter_s = 0;
		
		for (int i = 0; i < G.length(); i++) {
			if (G.charAt(i) >= 'A' & G.charAt(i) <= 'Z') {
				counter_b++;
			}
			if (G.charAt(i) >= 'a' & G.charAt(i) <= 'z') {
				counter_s++;
			}
		}
		
		System.out.println("В строке английских прописных букв " + counter_b + ", строчных букв " + counter_s + ".");

	}

}
