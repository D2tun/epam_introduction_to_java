/*
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в
 * нём.
 */

package by.minsk.epam.jio.taskOne;

public class Main {

	public static void main(String[] args) {

		String text = "wfne   wpei     wein           weng nw";
		int count = 0;
		int result = 0;

		for (int i = 1; i < text.length(); i++) {
			if (Character.isSpaceChar(text.charAt(i)) 
					& !Character.isSpaceChar(text.charAt(i - 1))) {
				if (result < count) {
					result = count;
				}
				count = 1;
			} else if (Character.isSpaceChar(text.charAt(i))) {
				count++;
			}		
		}

		System.out.println("Наибольшее количества подряд идущих пробелов: " 
				   + result);
	}
}
