package task_five;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Trip_list {

	private List<Trip> trip_list;

	public Trip_list() {
		super();
		trip_list = new ArrayList<Trip>();
	}

	public void add_trip(Trip trip) {
		trip_list.add(trip);
	}

	public void sort_by_type() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trip_list.size(); i++) {
				if (trip_list.get(i).get_type().compareTo(trip_list.get(i - 1).get_type()) < 0) {
					Trip tmp = trip_list.get(i);
					trip_list.set(i, trip_list.get(i - 1));
					trip_list.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sort_by_transport() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trip_list.size(); i++) {
				if (trip_list.get(i).get_transport().compareTo(trip_list.get(i - 1).get_transport()) < 0) {
					Trip tmp = trip_list.get(i);
					trip_list.set(i, trip_list.get(i - 1));
					trip_list.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sort_by_diet() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trip_list.size(); i++) {
				if (trip_list.get(i).get_diet().compareTo(trip_list.get(i - 1).get_diet()) < 0) {
					Trip tmp = trip_list.get(i);
					trip_list.set(i, trip_list.get(i - 1));
					trip_list.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sort_by_number_of_days() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trip_list.size(); i++) {
				if (trip_list.get(i).get_number_of_days() < (trip_list.get(i - 1).get_number_of_days())) {
					Trip tmp = trip_list.get(i);
					trip_list.set(i, trip_list.get(i - 1));
					trip_list.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void show_list() {
		System.out.println("ѕутЄвки:");
		for (int i = 0; i < trip_list.size(); i++) {
			System.out.println(i + ") " + trip_list.get(i).get_type() + ", " + trip_list.get(i).get_number_of_days()
					+ ", " + trip_list.get(i).get_transport() + ", " + trip_list.get(i).get_diet());
		}
	}

	public ArrayList<Trip> chosen_trip() {
		Scanner sc = new Scanner(System.in);

		String type = "";
		System.out.println("¬ведите тип поездки (оставьте поле пустым если этот параметр не важен).");
		type = sc.nextLine();

		String transport = "";
		System.out.println("¬ведите вид траспорта (оставьте поле пустым если этот параметр не важен).");
		transport = sc.nextLine();

		String diet = "";
		System.out.println("¬ведите питание (оставьте поле пустым если этот параметр не важен).");
		diet = sc.nextLine();

		int number_of_days = 0;
		System.out.println("¬ведите количество дней (введите \"0\" если этот параметр не важен).");
		number_of_days = sc.nextInt();

		sc.close();

		ArrayList<Trip> chosen_trips = new ArrayList<Trip>();

		for (int i = 0; i < this.trip_list.size(); i++) {
			if ((this.trip_list.get(i).get_diet().compareTo(diet) == 0 | diet.isBlank())
					& (this.trip_list.get(i).get_type().compareTo(type) == 0 | type.isBlank())
					& (this.trip_list.get(i).get_transport().compareTo(transport) == 0 | transport.isBlank())
					& (this.trip_list.get(i).get_number_of_days() == number_of_days | number_of_days == 0)) {
				chosen_trips.add(trip_list.get(i));
			}
		}

		return chosen_trips;
	}

}
