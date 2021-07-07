package task_nine;

/* ѕосчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. ”читывать
только английские буквы. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите строку.");
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
		
		System.out.println("¬ строке английских прописных букв " + counter_b + ", строчных букв " + counter_s + ".");

	}

}
