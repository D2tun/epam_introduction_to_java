package task_three;

// В строке найти количество цифр.

public class Main {

	public static void main(String[] args) {

		String s = "qwerty12345";
		int count = 0;

		char[] sd = s.toCharArray();
		for (int i = 0; i < sd.length; i++) {
			if (Character.isDigit(sd[i])) {
				count++;
			}
		}

		System.out.println(s);
		System.out.println("Цифр в строке: " + count);
	}

}
