package task_five;

import java.util.ArrayList;

/* Туристические путёвки. Сформировать набор предложений клиенту по выбору туристической путёвки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбоа. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путёвок. */

public class Main {

	public static void main(String[] args) {

		Trip trip1 = new Trip("отдых", "самолёт", "всё включено", 7);
		Trip trip2 = new Trip("отдых", "самолёт", "без питания", 8);
		Trip trip3 = new Trip("экскурсия", "не предоставляется", "без питания", 7);
		Trip trip4 = new Trip("лечение", "поезд", "трёхразовое", 14);
		Trip trip5 = new Trip("круиз", "не предоставляется", "полный пансион", 11);

		Trip_list list = new Trip_list();
		list.add_trip(trip1);
		list.add_trip(trip2);
		list.add_trip(trip3);
		list.add_trip(trip4);
		list.add_trip(trip5);

		list.show_list();

		System.out.println("Сортировка по типу:");
		list.sort_by_type();
		list.show_list();

		System.out.println("Сортировка по транспорту:");
		list.sort_by_transport();
		list.show_list();

		System.out.println("Сортировка по питанию:");
		list.sort_by_diet();
		list.show_list();

		System.out.println("Сортировка по количеству дней:");
		list.sort_by_number_of_days();
		list.show_list();

		ArrayList<Trip> t = list.chosen_trip();
		System.out.println("Подходящие путёвки:");
		for (int i = 0; i < t.size(); i++) {
			System.out.println(t.get(i).get_type() + ": транспорт - " + t.get(i).get_transport() + ", питание - "
					+ t.get(i).get_diet() + ", дней - " + t.get(i).get_number_of_days());
		}
	}

}
