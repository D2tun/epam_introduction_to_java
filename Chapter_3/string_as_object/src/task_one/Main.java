package task_one;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нём.

public class Main {

	public static void main(String[] args) {

		String s = "wfne   wpei     wein           weng nw";
		int count = 0;
		int result = 0;

		for (int i = 1; i < s.length(); i++) {
			if (Character.isSpaceChar(s.charAt(i)) & !Character.isSpaceChar(s.charAt(i - 1))) {
				if (result < count) {
					result = count;
				}
				count = 1;
			} else {
				if (Character.isSpaceChar(s.charAt(i))) {
					count++;
				}
			}
		}

		System.out.println("Наибольшее количества подряд идущих пробелов: " + result);
	}

}
