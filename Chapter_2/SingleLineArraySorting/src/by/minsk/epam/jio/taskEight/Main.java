package by.minsk.epam.jio.taskEight;

/* 
 * Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить
 * программу, которая приводит эти дроби к общему знаменателю и упорядочивает
 * их в порядке возрастания.
 */

import by.minsk.epam.jio.other.GCDOrLCM;
import by.minsk.epam.jio.other.ValueInt;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		System.out.print("Введите количество дробей ");
		n = StrictMath.abs(ValueInt.inputValue(n));

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = (int) StrictMath.round(StrictMath.random() * 101);
		}

		int[] q = new int[n];
		for (int i = 0; i < n; i++) {
			q[i] = (int) StrictMath.round(StrictMath.random() * 101);
			if (q[i] == 0) {
				q[i] = q[i] + 1;
			}
		}

		int w = 1;
		for (int i = 0; i < n; i++) {
			if ((p[i] < 0) & (q[i] < 0)) {
				p[i] = p[i] * -1;
				q[i] = q[i] * -1;
			}
			while ((p[i] % 2 == 0) & (q[i] % 2 == 0)) {
				p[i] = p[i] / 2;
				q[i] = q[i] / 2;
			}
			while ((p[i] % 3 == 0) & (q[i] % 3 == 0)) {
				p[i] = p[i] / 3;
				q[i] = q[i] / 3;
			}
			while ((p[i] % 5 == 0) & (q[i] % 5 == 0)) {
				p[i] = p[i] / 5;
				q[i] = q[i] / 5;
			}
			while ((p[i] % 7 == 0) & (q[i] % 7 == 0)) {
				p[i] = p[i] / 7;
				q[i] = q[i] / 7;
			}
			if (StrictMath.abs(q[i]) > w) {
				w = StrictMath.abs(q[i]);
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(p[i] + "/" + q[i] + " ");
		}
		
		while (q[0] != q[n - 1]) {
			for (int i = 1; i < n; i++) {
				if (q[i] != q[i - 1]) {
					w = GCDOrLCM.calculateLCM(q[i - 1], q[i]);
					p[i - 1] = p[i - 1] * (w / q[i]);
					p[i] = p[i] * (w / q[i - 1]);
					q[i] = w;
					q[i - 1] = w;
				}
			}
		}
		
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 0; i < n - 1; i++) {
				if (p[i] > p[i + 1]) {
					int temp = p[i];
					p[i] = p[i + 1];
					p[i + 1] = temp;
					iteration = true;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(p[i] + "/" + q[i] + " ");
		}
	}
}
