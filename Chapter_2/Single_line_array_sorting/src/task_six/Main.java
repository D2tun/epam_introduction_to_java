package task_six;

/* Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это слдующим образом: сравниваются два соседних элемента a[i] и a[i+1]. Если a[i]=<a[i+1],
то продвигаются га один элемент вперёд. Если a[i] > a[i+1], то производится перестановка и сдвигаются
на один элмент назад. Составить алгоритм такой сортировки. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество действительных чисел ");
		n = StrictMath.abs(Input_value_int.Input_value(n));
		
		double[] array = new double [n];
		for(int i = 0; i < n; i++) {
			array[i] = StrictMath.round(StrictMath.random() * 101);
			System.out.print(array[i] + " ");
		}

		System.out.println();
		
		for (int i = 0; i < n - 1; ) {
			if (array[i] > array[i + 1]) {
				double temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				i--;
				if (i < 0) {
					i = 0;
				}
			} else {
				i++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
