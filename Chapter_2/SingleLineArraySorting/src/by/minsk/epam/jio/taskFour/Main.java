package by.minsk.epam.jio.taskFour;

/* 
 * Сортировка обменами. Дана последовательность чисел a1=<a2=<...=<an.
 * Требуется переставить числа в порядке возрастания. Для этого сравниваются
 * два соседних числа ai и a[i+1]. Если ai>a[i+1], то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в
 * порядке возрастания. Составить алгоритм сортировки, подсчитывая количество
 * перестановок.
 */

import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		boolean iteration = true;
		int swap = 0;
		
		int n = 0;
		System.out.print("Введите количество чисел ");
		n = (int) StrictMath.abs(ValueInt.inputValue(n));
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = (int) StrictMath.round(StrictMath.random() * 101);
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		while (iteration) {
			iteration = false;
			for (int i = 1; i < n; i++) {
				if (arr[i] < arr[i - 1]) {
					int greater = arr[i - 1];
					int lesser = arr[i];
					arr[i - 1] = lesser;
					arr[i] = greater;
					swap++;
					iteration = true;
				}
				
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Всего перестановок: " + swap);
	}
}
