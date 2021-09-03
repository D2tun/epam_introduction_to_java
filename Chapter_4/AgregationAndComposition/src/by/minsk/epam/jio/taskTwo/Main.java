/* 
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку
 * автомобиля. 
 */

package by.minsk.epam.jio.taskTwo;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car("Жигули");
		
		c.showCarBrand();
		c.drive();
		c.fuelTheCar();
		c.fixTheCar();
		c.drive();	
	}	
}
