/* 
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в
 * введенной строке. Учитывать только английские буквы.
 */

package by.minsk.epam.jio.taskNine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку.");
		String line = sc.nextLine();
		
		int counterBig = 0;
		int counterSmall = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) >= 'A' & line.charAt(i) <= 'Z') {
				counterBig++;
			}
			if (line.charAt(i) >= 'a' & line.charAt(i) <= 'z') {
				counterSmall++;
			}
		}
		
		System.out.println("В строке английских прописных букв " + counterBig
				   + ", строчных букв " + counterSmall + ".");
		sc.close();
	}
}
