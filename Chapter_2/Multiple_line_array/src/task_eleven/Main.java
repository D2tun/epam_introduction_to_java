package task_eleven;

/* Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывесли на экран саму матрицу и номера
строк, в которых число 5 встречается три и более раз. */

public class Main {

	public static void main(String[] args) {
		
		int[] meet_five = new int[20];
		
		int[][] matrix = new int[10][20];
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				matrix[i][j] = (int) StrictMath.round(StrictMath.random() * 16);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] == 5) {
					meet_five[i]++;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Число 5 встречалось более 3 раз в строках: ");
		
		for (int i = 0; i < 20; i++) {
			if (meet_five[i] > 2) {
				System.out.print(i + ", ");
			}
		}

	}

}
