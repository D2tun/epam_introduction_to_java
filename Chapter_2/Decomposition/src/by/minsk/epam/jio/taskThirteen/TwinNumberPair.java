package by.minsk.epam.jio.taskThirteen;

public class TwinNumberPair {

	public static void search(int[] array) {

		int count = 1;
		
		System.out.println("пары близнецов: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = count; j < array.length; j++) {
				if ((array[i] + 2) == array[j]) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
			count++;
		}
	}
}
