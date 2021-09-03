/* 
 * Составьте описание класса для представления времени. Предусмотрите 
 * возможности установки времени и изменения его отдельных полей (час, минута, 
 * секунда) с проверкой допустимости вводимых значений. В случае недопустимых 
 * значений полей устанавливается в значение 0. Создать методы изменения 
 * времени на заданное количество часов, минут и секунд. 
 */

package by.minsk.epam.jio.taskSix;

public class Main {

	public static void main(String[] args) {

		Time clock = new Time();
		clock.setHours(10);
		clock.setMinutes(105);
		clock.setSeconds(30);
		System.out.println(clock.toString());

		clock.addHours(2);
		clock.addMinutes(10);
		clock.addSeconds(31);
		System.out.println(clock.toString());
	}
}
