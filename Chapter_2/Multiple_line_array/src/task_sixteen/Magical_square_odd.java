package task_sixteen;

/*Методы создания магических квадратов нечётных размерностей*/

public class Magical_square_odd {

	public static int[][] Algorithm_of_Luber(int[][] magical_square, int size) {

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
			magical_square[i][j] = number;
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
			if (magical_square[i][j] != 0) {
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
		return magical_square;
	}

}
