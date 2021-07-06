package lpthird;

//Задача: напишите программу, где пользователь вводит любое целое положительное число.
//А программа суммирует все числа от 1 до введённого пользователем числа.
import global.Input_value_int;

public class Task_one {

	public static void main(String[] args) {
		Input_value_int value = new Input_value_int();
		int a = 0;
		int i = 0;
		int g = 0;
		System.out.println("Введите целое положительное число");
		a = Input_value_int.Input_value(a);
		if (a < 0) {
			System.out.println("Число должно быть положительным");
		} else {
			for (i = 1; i <= a; i++) {
				g = g + i;
			}
			System.out.println("Сумма чисел от 1 до " + a + ": " + g);

		}

	}

}
