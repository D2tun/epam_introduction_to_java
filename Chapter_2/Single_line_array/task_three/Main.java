package task_three;

/* Дан массив действитльных чисел, размерность которого N.
Подсчитать, сколько в нём отрицательных, положительных и нулевых элементов. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		int QOP = 0;
		int QON = 0;
		int QOZ = 0;
		String ar = "";
		
		System.out.print("Введите размер массива ");
		N = StrictMath.abs(Input_value_int.Input_value(N));
		
		int[] Array = new int [N];
		
		for (int i = 0; i < N; i++) {
			Array[i] = (int) StrictMath.round(StrictMath.random() * 100) - 50;
			if (Array[i] > 0) {
				QOP++;
			}
			if (Array[i] < 0) {
				QON++;
			}
			if (Array[i] == 0) {
				QOZ++;
			}
			ar += (String.valueOf(Array[i]) + " ");
		}

		System.out.print(ar);
		System.out.println();
		System.out.print(QOP + " положительных элементов, " + QOZ + " нулевых элементов, " + QON + " отрицательных элементов.");
	}

}
