package task_twelve;

public class Get_digits {

	public static int[] of(int number) {

		String num = String.valueOf(number);

		int[] digit = new int[num.length()];

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '-') {
				i++;
				digit[i] = -Integer.valueOf(num.valueOf(num.charAt(i)));
			} else {
				digit[i] = Integer.valueOf(num.valueOf(num.charAt(i)));
			}
		}

		return digit;
	}

}
