/*
 * На плоскости заданы своими координатами n точек. Написать метод(ы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание.
 * Координаты точек занести в массив.
 */

package by.minsk.epam.jio.taskFour;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		System.out.print("Введите количество точек ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		double[] x = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = StrictMath.random() * 101;
		}

		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			y[i] = StrictMath.random() * 101;
		}

		double distance = 0;
		double distanceMax = 0;
		int iMax = -1;
		int jMax = -1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				distance = DistanceBetweenDots.calculate(x[i], y[i], x[j], y[j]);
				if (distanceMax < distance) {
					distanceMax = distance;
					iMax = i;
					jMax = j;
				}
			}
		}

		System.out.println("Расстояние между " + iMax + "-й и " + jMax  
						   + "-й точками - наибольшее.");
	}
}
