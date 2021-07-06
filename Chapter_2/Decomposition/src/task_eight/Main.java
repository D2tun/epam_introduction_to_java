package task_eight;

/* Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Сосавить метод(ы) для вычисления суммы трёх последовательно расположенных элеметов массива
с номерами от k до m. */

public class Main {

	public static void main(String[] args) {

		int[] D = new int[7];
		for (int i = 0; i < 7; i++) {
			D[i] = (int) (StrictMath.random() * 101);
			System.out.print(D[i] + " ");
		}

		System.out.println();

		System.out.println("D[1]+D[2]+D[3]=" + Sum_of_three_elements.sum(D[1], D[2], D[3]));
		System.out.println("D[3]+D[4]+D[5]=" + Sum_of_three_elements.sum(D[3], D[4], D[5]));
		System.out.println("D[4]+D[5]+D[6]=" + Sum_of_three_elements.sum(D[4], D[5], D[6]));

	}

}
