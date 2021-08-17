package by.minsk.epam.jio.taskFive;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TripList {

	private List<Trip> tripList;

	public TripList() {
		tripList = new ArrayList<Trip>();
	}

	public void addTrip(Trip trip) {
		tripList.add(trip);
	}

	public void sortByType() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < tripList.size(); i++) {
				if (tripList.get(i).getType()
						.compareTo(tripList.get(i - 1).getType()) < 0) {
					Trip tmp = tripList.get(i);
					tripList.set(i, tripList.get(i - 1));
					tripList.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sortByTransport() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < tripList.size(); i++) {
				if (tripList.get(i).getTransport()
						.compareTo(tripList.get(i - 1).getTransport()) < 0) {
					Trip tmp = tripList.get(i);
					tripList.set(i, tripList.get(i - 1));
					tripList.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sortByDiet() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < tripList.size(); i++) {
				if (tripList.get(i).getDiet()
						.compareTo(tripList.get(i - 1).getDiet()) < 0) {
					Trip tmp = tripList.get(i);
					tripList.set(i, tripList.get(i - 1));
					tripList.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void sortByNumberOfDays() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < tripList.size(); i++) {
				if (tripList.get(i).getNumberOfDays()
						< (tripList.get(i - 1).getNumberOfDays())) {
					Trip tmp = tripList.get(i);
					tripList.set(i, tripList.get(i - 1));
					tripList.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public void showList() {
		System.out.println("Путёвки:");
		for (int i = 0; i < tripList.size(); i++) {
			System.out.println(i + ") " + tripList.get(i).getType() + ", " 
							  + tripList.get(i).getNumberOfDays() + ", " 
							  + tripList.get(i).getTransport() + ", " 
							  + tripList.get(i).getDiet());
		}
	}

	public ArrayList<Trip> chosenTrip() {
		Scanner sc = new Scanner(System.in);

		String type = "";
		System.out.println("Введите тип поездки (оставьте поле пустым если этот"
				+ " параметр не важен).");
		type = sc.nextLine();

		String transport = "";
		System.out.println("Введите вид транспорта (оставьте поле пустым если "
				+ "этот параметр не важен).");
		transport = sc.nextLine();

		String diet = "";
		System.out.println("Введите питание (оставьте поле пустым если этот "
				+ "параметр не важен).");
		diet = sc.nextLine();

		int numberOfDays = 0;
		System.out.println("Введите количество дней (введите \"0\" если этот "
				+ "параметр не важен).");
		numberOfDays = sc.nextInt();

		sc.close();

		ArrayList<Trip> chosenTrips = new ArrayList<Trip>();

		for (int i = 0; i < this.tripList.size(); i++) {
			if ((this.tripList.get(i).getDiet().compareTo(diet) == 0 
					| diet.isBlank())
					& (this.tripList.get(i).getType().compareTo(type) == 0 
					| type.isBlank())
					& (this.tripList.get(i).getTransport()
							.compareTo(transport) == 0 | transport.isBlank())
					& (this.tripList.get(i).getNumberOfDays() == numberOfDays 
					| numberOfDays == 0)) {
				chosenTrips.add(tripList.get(i));
			}
		}

		return chosenTrips;
	}
}
