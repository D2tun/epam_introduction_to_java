package by.minsk.epam.jio.taskFour;

/*
 * В строке найти количество чисел.
 */

public class Main {

	public static void main(String[] args) {

		String s = "eggewng214 o234r 4kdhoi84";
		char[] ch = s.toCharArray();

		int detect = 0;
		int count = 0;

		for (int i = 1; i < ch.length; i++) {
			if (!Character.isDigit(ch[i - 1]) & Character.isDigit(ch[i])) {
				detect++;
			}
			if (Character.isDigit(ch[i - 1]) & !Character.isDigit(ch[i])) {
				detect++;
			}
			if (Character.isDigit(ch[i]) & i == ch.length - 1) {
				detect++;
			}
			if (detect == 2) {
				count++;
				detect = 0;
			}
		}

		System.out.println(s);
		System.out.println("Чисел в строке: " + count);
	}
}
