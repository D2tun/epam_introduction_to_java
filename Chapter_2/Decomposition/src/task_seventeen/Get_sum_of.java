package task_seventeen;

public class Get_sum_of {
	
	public static int digits(int[] digits) {
		
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}
		
		return sum;
	}

}
