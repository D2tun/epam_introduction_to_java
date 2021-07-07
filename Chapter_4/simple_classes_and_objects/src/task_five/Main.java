package task_five;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать своё значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию и
произвольными значениями. Счётчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демострирующий все возможности класса. */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Счётчик по умолчанию:");
		Counter c1 = new Counter();
		System.out.println(c1.get_counter_state());
		c1.increment();
		System.out.println(c1.get_counter_state());
		c1.decrement();
		System.out.println(c1.get_counter_state());
		c1.decrement();
		System.out.println(c1.get_counter_state());

		System.out.println();
		
		System.out.println("Произвольный счётчик:");
		Counter c2 = new Counter(2, 98);
		System.out.println(c2.get_counter_state());
		c2.increment();
		System.out.println(c2.get_counter_state());
		c2.increment();
		System.out.println(c2.get_counter_state());
		c2.decrement();
		System.out.println(c2.get_counter_state());
				
	}
}
