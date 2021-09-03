/* 
 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными
 * пераметрами. Добавьте конструктор, инициализирующий члены класса по 
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса. 
 */

package by.minsk.epam.jio.taskTwo;

import by.minsk.epam.jio.taskOne.ValueDouble;

public class Main {

	public static void main(String[] args) {

		double value = 0;

		Test2 t = new Test2(2, 4);
		System.out.println("Первое число: " + t.getNum1());
		System.out.println("Второе число: " + t.getNum2());
		
		System.out.print("Введите значение первого числа: ");
		t.setNum1(ValueDouble.inputValue(value));
		System.out.print("Введите значение второго числа: ");
		t.setNum2(ValueDouble.inputValue(value));
		
		System.out.println("Первое число: " + t.getNum1());
		System.out.println("Второе число: " + t.getNum2());;
	}
}
