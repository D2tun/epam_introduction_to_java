package task_seven;

public class Calculate_factorial {

	public static int calculate (int number) {
		
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
}
