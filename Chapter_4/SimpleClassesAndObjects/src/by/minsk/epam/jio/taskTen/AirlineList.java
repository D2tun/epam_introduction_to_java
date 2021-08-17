package by.minsk.epam.jio.taskTen;

import java.util.List;
import java.util.ArrayList;

public class AirlineList {

	private List<Airline> airlineList;
	
	public AirlineList() {
		airlineList = new ArrayList<Airline>();
	}
	
	public void addAirline(Airline airline) {
		airlineList.add(airline);
	}
	
	public void printAirlinesTo(String destination) {
		System.out.println("Рейсы в " + destination + ":");
		for (int i = 0; i < airlineList.size(); i++) {
			if (airlineList.get(i).getDestination().contains(destination)) {
				System.out.println(airlineList.get(i).toString());
			}
		}
	}
	
	public void printAirlinesAtTheDayOfTheWeek(String dayOfTheWeek) {
		System.out.println("Рейсы в " + dayOfTheWeek + ":");
		for (int i = 0; i < airlineList.size(); i++) {
			if (airlineList.get(i).getDayOfWeek().contains(dayOfTheWeek)) {
				System.out.println(airlineList.get(i).toString());
			}
		}
	}
	
	public void printAirlinesAtTheDayOfTheWeekAfterTime(String dayOfTheWeek, 
				String time) {
		System.out.println("Рейсы в  " + dayOfTheWeek + ":");
		for (int i = 0; i < airlineList.size(); i++) {
			if (airlineList.get(i).getDayOfWeek().contains(dayOfTheWeek) 
					& (airlineList.get(i).getStartTime().compareTo(time) > 0)) {
				System.out.println(airlineList.get(i).toString());
			}
		}
	}
}
