/* 
 * Дана последовательность действительных чисел a1, a2, ..., an. Заменить все
 * её члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

package by.minsk.epam.jio.taskTwo;

import by.minsk.epam.jio.input.ValueInt;

public class Main {

	public static void main(String[] args) {
		
		int n = 0;
		int Z = 0;
		String unchanged = "";
		String changed = "";
		int changes = 0;
		
		System.out.print("Введите количество чисел в последовательности ");
		n = ValueInt.inputValue(n);
		System.out.print("Введите предел ");
		Z = ValueInt.inputValue(Z);
		
		int[] a = new int[StrictMath.abs(n)];
		
		for (int i = 0; i < n; i++) {
			
			a[i] = (int) StrictMath.round(StrictMath.random() * 100);
			unchanged += (String.valueOf(a[i]) + " ");
			
			if (a[i] > Z) {
				a[i] = Z;	changes++;
				
			}
			changed += (String.valueOf(a[i]) + " ");
		}
		
		System.out.print(unchanged);
		System.out.println();
		System.out.print(changed);
		System.out.println();
		System.out.print(changes + " замен");
	}
}
