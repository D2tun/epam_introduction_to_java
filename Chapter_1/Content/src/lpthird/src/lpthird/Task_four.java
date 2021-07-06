package lpthird;

//Составить программу нахождения произведния квадратов первых двухсот чисел.
import global.Input_value_int;

public class Task_four {

	public static void main(String[] args) {
		Input_value_int value = new Input_value_int();
		int q = 0;
		long SumOfSquaresProduct = 0;
		long SquaresProduct = 0;
		System.out.println("Введите начальное число");
		Input_value_int.Input_value(q);
		int i = q;
		while (i <= (q + 200)) {
			int f = i + 1;
			if (f > i) {
				f = i;
			}
			SquaresProduct = (f * f) * (i * i);
			SumOfSquaresProduct = SumOfSquaresProduct + SquaresProduct;
			i = i + 1;
		}
		System.out.println("Сумма квадратов 200 чисел: " + SumOfSquaresProduct);

	}

}
