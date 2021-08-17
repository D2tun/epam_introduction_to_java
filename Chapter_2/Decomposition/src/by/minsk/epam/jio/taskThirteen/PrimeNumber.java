package by.minsk.epam.jio.taskThirteen;

public class PrimeNumber {

	public static int[] search(int[] array) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (((array[i] % 2 != 0) & (array[i] % 3 != 0) & (array[i] % 5 != 0) 
					& (array[i] % 7 != 0)) ^ ((array[i] == 3) | (array[i] == 5) 
					| (array[i] == 7))) {
				count++;
			}
		}

		int[] primeNuber = new int[count];

		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (((array[i] % 2 != 0) & (array[i] % 3 != 0) & (array[i] % 5 != 0)
					& (array[i] % 7 != 0)) ^ ((array[i] == 3) | (array[i] == 5) 
					| (array[i] == 7))) {
				primeNuber[count] = array[i];
				count++;
			}
		}

		return primeNuber;
	}
}
