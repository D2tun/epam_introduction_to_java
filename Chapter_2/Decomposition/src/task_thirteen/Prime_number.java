package task_thirteen;

public class Prime_number {

	public static int[] search(int[] array) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2 != 0 & array[i] % 3 != 0 & array[i] % 5 != 0 & array[i] % 7 != 0)
					^ (array[i] == 3 | array[i] == 5 | array[i] == 7)) {
				count++;
			}
		}

		int[] prime_number = new int[count];

		count = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2 != 0 & array[i] % 3 != 0 & array[i] % 5 != 0 & array[i] % 7 != 0)
					^ (array[i] == 3 | array[i] == 5 | array[i] == 7)) {
				prime_number[count] = array[i];
				count++;
			}
		}
		
		return prime_number;
	}

}
