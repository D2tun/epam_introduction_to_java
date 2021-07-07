package task_two;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car("Жигули");
		
		c.show_car_brand();
		c.drive();
		c.fuel_the_car();
		c.fix_the_car();
		c.drive();
		
	}
	
}
