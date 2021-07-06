package task_seven;

// Написать метод(ы) для вычисления суммы факториалов всех нечётных чисел от 1 до 9.

public class Main {

	public static void main(String[] args) {
		
		int f = 0;
		
		for (int j = 1; j <= 9; j++) {
			if (j % 2 != 0) {
			f += Calculate_factorial.calculate(j);
			}
		}
		
		System.out.print(f);
	}

}
