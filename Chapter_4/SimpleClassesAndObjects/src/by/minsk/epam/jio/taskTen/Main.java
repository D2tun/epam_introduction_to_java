package by.minsk.epam.jio.taskTen;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить 
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс, 
 * агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *	Airline: пункт назначения, номер рейса, тип самолёта, время вылета, дни недели.
 *	Найти и вывести:
 *		a) список рейсов для заданного пункта назначения;
 *		b) список рейсов для заданного дня недели;
 *		c) список рейсов для заданного дня недели, время вылета для которых больше
 *		заданного.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AirlineList airlines = new AirlineList();
		
		Airline airline1 = new Airline();
		airline1.setAirlineNumber(134);
		airline1.setDesination("Москва");
		airline1.setAirplaneType("ТУ-134");
		airline1.setDayOfWeek("сб.");
		airline1.setStartTime("13:00");
		airlines.addAirline(airline1);
		
		Airline airline2 = new Airline();
		airline2.setAirlineNumber(166);
		airline2.setDesination("Хургада");
		airline2.setAirplaneType("Boeing 737-800");
		airline2.setDayOfWeek("пт.");
		airline2.setStartTime("01:00");
		airlines.addAirline(airline2);
		
		Airline airline3 = new Airline();
		airline3.setAirlineNumber(170);
		airline3.setDesination("Рим");
		airline3.setAirplaneType("Embarer E-195");
		airline3.setDayOfWeek("пт.");
		airline3.setStartTime("09:45");
		airlines.addAirline(airline3);
		
		Airline airline4 = new Airline();
		airline4.setAirlineNumber(140);
		airline4.setDesination("Багдад");
		airline4.setAirplaneType("Boeing 737-800");
		airline4.setDayOfWeek("пн.");
		airline4.setStartTime("16:00");
		airlines.addAirline(airline4);
		
		Airline airline5 = new Airline();
		airline5.setAirlineNumber(180);
		airline5.setDesination("Ларнака");
		airline5.setAirplaneType("Embarer E-175");
		airline5.setDayOfWeek("вс.");
		airline5.setStartTime("08:55");
		airlines.addAirline(airline5);
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Введите пункт назначения.");
		String a = sc.nextLine();
		airlines.printAirlinesTo(a);
		
		System.out.println("Введите день недели (например: пн.).");
		String b = sc.nextLine();
		airlines.printAirlinesAtTheDayOfTheWeek(b);*/
		
		System.out.println("Введите день недели (например: пн.).");
		String c = sc.nextLine();
		System.out.println("Введите время.");
		String d = sc.nextLine();
		airlines.printAirlinesAtTheDayOfTheWeekAfterTime(c, d);
		
		sc.close();
	}
}
