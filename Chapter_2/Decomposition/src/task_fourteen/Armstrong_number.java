package task_fourteen;

public class Armstrong_number {
	
	public static boolean definition(int[] digits, int number) {
		
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
