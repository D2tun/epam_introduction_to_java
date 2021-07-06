package task_five;

/* Сортировка вставками. Дана последовательность чисел а1, a2, ..., an. Требуется переставить числа
в порядке возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность,
т. е. a1=<a2=<...=<an. Берётся следующее число a[n+1] и вставляется в последовательность так, чтобы
новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы
от i+1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную
часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдейльной функции. */

import global.Input_value_int;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		System.out.print("Введите количество чисел ");
		n = StrictMath.abs(Input_value_int.Input_value(n));

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			if (i <= 2) {
				a[i] = i;
			} else {
				a[i] = (int) StrictMath.round(StrictMath.random() * 101) + 2;
			}
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 3; i < n; i++) {
			int number = a[i];
			int indexToInsert = search.binary(a, number, i);
			for (int j = i; j > indexToInsert; j--) {
				a[j] = a[j - 1];
			}
			a[indexToInsert] = number;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
