/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е.
 */

package by.minsk.epam.jio.taskList;

import by.minsk.epam.jio.input.InputValueDouble;

public class TaskFive {

	public static void main(String[] args) {

		int posN = 0;
		int negN = 0;
		double e = 0;
		double anp = 0;
		double ann = 0;
		double absSum = 0;

		System.out.print("e=");
		e = InputValueDouble.inputValue(e);
		System.out.println(e);

		while ((StrictMath.abs(ann) <= e) & (StrictMath.abs(anp) <= e)) {
			anp = (1 / StrictMath.pow(2, posN)) + (1 / StrictMath.pow(3, posN));
			ann = (1 / StrictMath.pow(2, negN)) + (1 / StrictMath.pow(3, negN));
			absSum = absSum + anp + ann;
			posN++;
			negN--;
		}
		System.out.println("Сумма членов ряда, больших, по модулю, чем " + e 
				   + " :" + " " + absSum);
	}
}
