/* 
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или 
 * уменьшать своё значение на единицу в заданном диапазоне. Предусмотрите 
 * инициализацию счётчика значениями по умолчанию и произвольными значениями. 
 * Счётчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демострирующий все возможности
 * класса.  
 */

package by.minsk.epam.jio.taskFive;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Счётчик по умолчанию:");
		Counter c1 = new Counter();
		System.out.println(c1.getCounterState());
		c1.incrementing();
		System.out.println(c1.getCounterState());
		c1.decrementing();
		System.out.println(c1.getCounterState());
		c1.decrementing();
		System.out.println(c1.getCounterState());

		System.out.println();
		
		System.out.println("Произвольный счётчик:");
		Counter c2 = new Counter(2, 98);
		System.out.println(c2.getCounterState());
		c2.incrementing();
		System.out.println(c2.getCounterState());
		c2.incrementing();
		System.out.println(c2.getCounterState());
		c2.decrementing();
		System.out.println(c2.getCounterState());	
	}
}
