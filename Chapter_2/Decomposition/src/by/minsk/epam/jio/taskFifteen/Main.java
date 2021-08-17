package by.minsk.epam.jio.taskFifteen;

/*
 * Найти все натуральные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать
 * декомпозицию.
 */

import by.minsk.epam.jio.input.ValueInt;
import by.minsk.epam.jio.taskTwelve.NumberToDigits;

public class Main {

	public static void main(String[] args) {
		
		int limLow = 0;
		System.out.print("Введите нижний предел поиска ");
		limLow = ValueInt.inputValue(limLow);
		
		int limHigh = 0;
		System.out.print("Введите верхний предел поиска ");
		limHigh = ValueInt.inputValue(limHigh);

		if (limLow > limHigh) {
			int temp = limHigh;
			limHigh = limLow;
			limLow = temp;
		}
		
		for (int i = limLow; i <= limHigh; i++) {
			int[] d = NumberToDigits.split(i);
			if (UpscalingDigits.is(d) == true) {
				System.out.print(i + " ");
			}
		}	
	}
}
