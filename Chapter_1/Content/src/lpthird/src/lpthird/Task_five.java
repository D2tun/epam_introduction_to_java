package lpthird;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
import global.Input_value_double;

public class Task_five {

	public static void main(String[] args) {
		Input_value_double value = new Input_value_double();
		int posN = 0;
		int negN = 0;
		double e = 0;
		double anp = 0;
		double ann = 0;
		double AbsSum = 0;
		System.out.print("e=");
		e = Input_value_double.Input_value(e);
		System.out.println(e);
		while ((StrictMath.abs(ann) <= e) & (StrictMath.abs(anp) <= e)) {
			anp = (1/StrictMath.pow(2, posN)) + (1/StrictMath.pow(3, posN));
			ann = (1/StrictMath.pow(2, negN)) + (1/StrictMath.pow(3, negN));
			AbsSum = AbsSum + anp + ann;
			posN++;
			negN--;		
		}
		System.out.println("Сумма членов ряда, больших, по модулю, чем " + e + " :" + " " + AbsSum);
	}

}
