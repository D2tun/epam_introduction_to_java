/* 
 * Туристические путёвки. Сформировать набор предложений клиенту по выбору 
 * туристической путёвки различного типа (отдых, экскурсии, лечение, шопинг, 
 * круиз и т.д.) для оптимального выбоа. Учитывать возможность выбора 
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путёвок. 
 */

package by.minsk.epam.jio.taskFive;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Trip trip1 = new Trip("отдых", "самолёт", "всё включено", 7);
		Trip trip2 = new Trip("отдых", "самолёт", "без питания", 8);
		Trip trip3 = new Trip("экскурсия", "не предоставляется", 
							  "без питания", 7);
		Trip trip4 = new Trip("лечение", "поезд", "трёхразовое", 14);
		Trip trip5 = new Trip("круиз", "не предоставляется", 
							  "полный пансион", 11);

		TripList list = new TripList();
		list.addTrip(trip1);
		list.addTrip(trip2);
		list.addTrip(trip3);
		list.addTrip(trip4);
		list.addTrip(trip5);

		list.showList();

		System.out.println("Сортировка по типу: ");
		list.sortByType();
		list.showList();

		System.out.println("ортировка по транспорту:");
		list.sortByTransport();
		list.showList();

		System.out.println("Сортировка по питанию:");
		list.sortByDiet();
		list.showList();

		System.out.println("Сортировка по количеству дней:");
		list.sortByNumberOfDays();
		list.showList();

		ArrayList<Trip> t = list.chosenTrip();
		System.out.println("Подходящие путёвки:");
		for (int i = 0; i < t.size(); i++) {
			System.out.println(t.get(i).getType() + ": транспорт - " 
					   + t.get(i).getTransport() + ", питание - "
					   + t.get(i).getDiet() + ", дней - " 
					   + t.get(i).getNumberOfDays());
		}
	}
}
