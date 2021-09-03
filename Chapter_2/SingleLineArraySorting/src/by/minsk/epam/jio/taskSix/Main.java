/* 
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 * его по возрастанию. Делается это слдующим образом: сравниваются два соседних
 * элемента a[i] и a[i+1]. Если a[i] =< a[i+1], то продвигаются на один элемент
 * вперёд. Если a[i] > a[i+1], то производится перестановка и сдвигаются на
 * один элмент назад. Составить алгоритм такой сортировки.
 */

package by.minsk.epam.jio.taskSix;

import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество действительных чисел ");
		n = StrictMath.abs(ValueInt.inputValue(n));
		
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
