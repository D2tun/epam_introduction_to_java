package by.minsk.epam.jio.taskTwelve;

public class NumberToDigits {

	public static int[] split(int number) {

		String num = String.valueOf(number);

		int[] digit = new int[num.length()];

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '-') {
				i++;
				digit[i] = -Integer.valueOf(String.valueOf(num.charAt(i)));
			} else {
				digit[i] = Integer.valueOf(String.valueOf(num.charAt(i)));
			}
		}

		return digit;
	}
}
