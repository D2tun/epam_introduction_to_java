package task_ten;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 Airline: пункт назначения, номер рейса, тип самолёта, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Airline_list airlines = new Airline_list();
		
		Airline airline1 = new Airline();
		airline1.set_airline_number(134);
		airline1.set_desination("Москва");
		airline1.set_airplane_type("ТУ-134");
		airline1.set_day_of_week("сб.");
		airline1.set_start_time("13:00");
		airlines.add_airline(airline1);
		
		Airline airline2 = new Airline();
		airline2.set_airline_number(166);
		airline2.set_desination("Хургада");
		airline2.set_airplane_type("Boeing 737-800");
		airline2.set_day_of_week("пт.");
		airline2.set_start_time("01:00");
		airlines.add_airline(airline2);
		
		Airline airline3 = new Airline();
		airline3.set_airline_number(170);
		airline3.set_desination("Рим");
		airline3.set_airplane_type("Embarer E-195");
		airline3.set_day_of_week("пт.");
		airline3.set_start_time("09:45");
		airlines.add_airline(airline3);
		
		Airline airline4 = new Airline();
		airline4.set_airline_number(140);
		airline4.set_desination("Багдад");
		airline4.set_airplane_type("Boeing 737-800");
		airline4.set_day_of_week("пн.");
		airline4.set_start_time("16:00");
		airlines.add_airline(airline4);
		
		Airline airline5 = new Airline();
		airline5.set_airline_number(180);
		airline5.set_desination("Ларнака");
		airline5.set_airplane_type("Embarer E-175");
		airline5.set_day_of_week("вс.");
		airline5.set_start_time("08:55");
		airlines.add_airline(airline5);
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Введите пункт назначения.");
		String a = sc.nextLine();
		airlines.airlines_to(a);
		
		System.out.println("Введите день недели (например: пн.).");
		String b = sc.nextLine();
		airlines.airlines_at_the_day_of_the_week(b);*/
		
		System.out.println("Введите день недели (например: пн.).");
		String c = sc.nextLine();
		System.out.println("Введите время.");
		String d = sc.nextLine();
		airlines.airlines_at_the_day_of_the_week_after_time(c, d);
		
		sc.close();
	}

}
