package task_sixteen;

public class Magical_square_even {

	public static int[][] RauzBoll_method(int[][] magical_square, int size) {

		int number = 1;

		int[][] direct_matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				direct_matrix[i][j] = number;
				number++;
			}
		}

		number = (int) StrictMath.pow(size, 2);

		int[][] reverse_matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				reverse_matrix[i][j] = number;
				number--;
			}
		}
		if (size == 4) {
			for (int i = 0; i < size / 2; i++) {
				magical_square[i][i] = reverse_matrix[i][i];
				magical_square[size - 1 - i][i] = reverse_matrix[size - 1 - i][i];
				magical_square[size - 1 - i][size - 1 - i] = reverse_matrix[size - 1 - i][size - 1 - i];
				magical_square[i][size - 1 - i] = reverse_matrix[i][size - 1 - i];
			}

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (magical_square[i][j] == 0) {
						magical_square[i][j] = direct_matrix[i][j];
					}
				}
			}
		} else {

			for (int i = 0; i < size / 2; i++) {
				magical_square[i][i] = reverse_matrix[i][i];
				magical_square[size - 1 - i][i] = reverse_matrix[size - 1 - i][i];
				magical_square[size - 1 - i][size - 1 - i] = reverse_matrix[size - 1 - i][size - 1 - i];
				magical_square[i][size - 1 - i] = reverse_matrix[i][size - 1 - i];
				magical_square[i][((size - 1) / 2) - i] = reverse_matrix[i][((size - 1) / 2) - i];
				magical_square[(size / 2) + i][i] = reverse_matrix[(size / 2) + i][i];
				magical_square[i][(size / 2) + i] = reverse_matrix[i][(size / 2) + i];
				magical_square[(size / 2) + i][size - i - 1] = reverse_matrix[(size / 2) + i][size - i - 1];
			}

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (magical_square[i][j] == 0) {
						magical_square[i][j] = direct_matrix[i][j];
					}
				}
			}
		}
		return magical_square;

	}

}
