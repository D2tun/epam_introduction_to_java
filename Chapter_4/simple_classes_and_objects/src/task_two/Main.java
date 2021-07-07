package task_two;

/* Создайте класс Test2 двумя переменными. Добавьте конструктор с входными пераметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса. */

import task_one.Input_value_double;

public class Main {

	public static void main(String[] args) {

		double value = 0;

		Test2 t = new Test2(2, 4);
		System.out.println("Первое число: " + t.get_num1());
		System.out.println("Второе число: " + t.get_num2());
		System.out.print("Введите значение первого числа: ");
		t.set_num1(Input_value_double.Input_value(value));
		System.out.print("Введите значение второго числа: ");
		t.set_num2(Input_value_double.Input_value(value));
		System.out.println("Первое число: " + t.get_num1());
		System.out.println("Второе число: " + t.get_num2());
	}

}
