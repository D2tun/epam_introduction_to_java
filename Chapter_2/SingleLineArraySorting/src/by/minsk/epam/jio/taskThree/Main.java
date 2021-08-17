package by.minsk.epam.jio.taskThree;

/* Сортировка выбором. Дана последовательность чисел а1<a2<...<an. Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого
 * в массиве, начиная с первого, выбирается наибольший элемент и ставится на
 * первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором. */

import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество чисел ");
		n = StrictMath.abs(ValueInt.inputValue(n));
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (StrictMath.round(StrictMath.random() * 101));
		}
		for (int first = 0; first < n; first++) {
			int max = first;
			for (int i = first; i < n; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
			int lesser = arr[first];
			int greater = arr[max];
			arr[first] = greater;
			arr[max] = lesser;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
