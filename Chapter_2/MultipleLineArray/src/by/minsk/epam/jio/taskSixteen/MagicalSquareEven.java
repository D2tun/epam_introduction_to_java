package by.minsk.epam.jio.taskSixteen;

public class MagicalSquareEven {

	public static int[][] buildRauzBollMethod(int[][] magicalSquare, int size) {

		int number = 1;

		int[][] directMatrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				directMatrix[i][j] = number;
				number++;
			}
		}

		number = (int) StrictMath.pow(size, 2);

		int[][] reverseMatrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				reverseMatrix[i][j] = number;
				number--;
			}
		}
		
		if (size == 4) {
			for (int i = 0; i < size / 2; i++) {
				magicalSquare[i][i] = reverseMatrix[i][i];
				magicalSquare[size - 1 - i][i] = reverseMatrix[size - 1 - i][i];
				magicalSquare[size - 1 - i][size - 1 - i] = reverseMatrix[size - 1 - i][size - 1 - i];
				magicalSquare[i][size - 1 - i] = reverseMatrix[i][size - 1 - i];
			}

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (magicalSquare[i][j] == 0) {
						magicalSquare[i][j] = directMatrix[i][j];
					}
				}
			}
		} else {
			for (int i = 0; i < size / 2; i++) {
				magicalSquare[i][i] = reverseMatrix[i][i];
				magicalSquare[size - 1 - i][i] = reverseMatrix[size - 1 - i][i];
				magicalSquare[size - 1 - i][size - 1 - i] = reverseMatrix[size - 1 - i][size - 1 - i];
				magicalSquare[i][size - 1 - i] = reverseMatrix[i][size - 1 - i];
				magicalSquare[i][((size - 1) / 2) - i] = reverseMatrix[i][((size - 1) / 2) - i];
				magicalSquare[(size / 2) + i][i] = reverseMatrix[(size / 2) + i][i];
				magicalSquare[i][(size / 2) + i] = reverseMatrix[i][(size / 2) + i];
				magicalSquare[(size / 2) + i][size - i - 1] = reverseMatrix[(size / 2) + i][size - i - 1];
			}

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (magicalSquare[i][j] == 0) {
						magicalSquare[i][j] = directMatrix[i][j];
					}
				}
			}
		}
		return magicalSquare;
	}
}
