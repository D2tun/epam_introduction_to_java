package task_thirteen;

public class Search_twin {

	public static void search(int[] array) {

		int count = 1;
		System.out.println("Пары близнецов: ");
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

