/* 
 * Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывесли на экран саму
 * матрицу и номера строк, в которых число 5 встречается три и более раз. 
 */

package by.minsk.epam.jio.taskEleven;

public class Main {

	public static void main(String[] args) {

		int[] meetFive = new int[20];
		int[][] matrix = new int[10][20];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 16);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] == 5) {
					meetFive[i]++;
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Число 5 встречалось более 3 раз в строках: ");

		for (int i = 0; i < 20; i++) {
			if (meetFive[i] > 2) {
				System.out.print(i + ", ");
			}
		}
	}
}
