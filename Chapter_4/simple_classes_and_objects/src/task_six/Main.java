package task_six;

/* Составьте описание класса для представления времени. Предусмотрите возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей устанавливается в значение 0. Создать методы изменения времени
на заданное количество часов, минут и секунд. */

public class Main {

	public static void main(String[] args) {

		Time clock = new Time();
		clock.set_hours(10);
		clock.set_minutes(105);
		clock.set_seconds(30);
		System.out.println(clock.get_time());

		clock.add_hours(2);
		clock.add_minutes(10);
		clock.add_seconds(31);
		System.out.println(clock.get_time());
	}

}
