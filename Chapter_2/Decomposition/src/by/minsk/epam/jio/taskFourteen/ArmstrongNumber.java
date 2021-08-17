package by.minsk.epam.jio.taskFourteen;

public class ArmstrongNumber {

	public static boolean definite(int[] digits, int number) {
		
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}
		
		if (StrictMath.pow(sum, digits.length) == number) {
			return true;
		} else {
			return false;
		}
	}
}
