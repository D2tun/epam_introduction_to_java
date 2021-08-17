package by.minsk.epam.jio.taskSixteen;

public class MagicalSquareOdd {

	public static int[][] buildAlgorithmOfLuber(int[][] magicalSquare, int size) {

		int i = 0;
		int j = (size / 2);

		for (int number = 1; number <= StrictMath.pow(size, 2); number++) {

			if (i > size - 1) {
				i = 0;
			}
			if (j > size - 1) {
				j = 0;
			}
			if (i < 0) {
				i = size - 1;
			}
			if (j < 0) {
				j = size - 1;
			}
			magicalSquare[i][j] = number;
			i--;
			j--;
			if (i > size - 1) {
				i = 0;
			}
			if (j > size - 1) {
				j = 0;
			}
			if (i < 0) {
				i = size - 1;
			}
			if (j < 0) {
				j = size - 1;
			}
			if (magicalSquare[i][j] != 0) {
				j++;
				i++;
				if (i > size - 1) {
					i = 0;
				}
				if (j > size - 1) {
					j = 0;
				}
				if (i < 0) {
					i = size - 1;
				}
				if (j < 0) {
					j = size - 1;
				}
				i++;
			}
		}
		return magicalSquare;
	}
}
