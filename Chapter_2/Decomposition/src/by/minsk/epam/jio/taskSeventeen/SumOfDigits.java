package by.minsk.epam.jio.taskSeventeen;

public class SumOfDigits {

	public static int get(int[] digits) {
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}

		return sum;
	}
}
