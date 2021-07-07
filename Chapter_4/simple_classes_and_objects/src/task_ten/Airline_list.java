package task_ten;

import java.util.List;
import java.util.ArrayList;

public class Airline_list {

	private List<Airline> Airline_list;
	
	public Airline_list() {
		super();
		Airline_list = new ArrayList<Airline>();
	}
	
	public void add_airline(Airline airline) {
		Airline_list.add(airline);
	}
	
	public void airlines_to(String destination) {
		System.out.println("–ейсы в " + destination + ":");
		for (int i = 0; i < Airline_list.size(); i++) {
			if (Airline_list.get(i).get_destination().contains(destination)) {
				System.out.println(Airline_list.get(i).toString());
			}
		}
	}
	
	public void airlines_at_the_day_of_the_week(String day_of_the_week) {
		System.out.println("–ейсы в " + day_of_the_week + ":");
		for (int i = 0; i < Airline_list.size(); i++) {
			if (Airline_list.get(i).get_day_of_week().contains(day_of_the_week)) {
				System.out.println(Airline_list.get(i).toString());
			}
		}
	}
	
	public void airlines_at_the_day_of_the_week_after_time(String day_of_the_week, String time) {
		System.out.println("–ейсы в " + day_of_the_week + ":");
		for (int i = 0; i < Airline_list.size(); i++) {
			if (Airline_list.get(i).get_day_of_week().contains(day_of_the_week) & Airline_list.get(i).get_start_time().compareTo(time) > 0) {
				System.out.println(Airline_list.get(i).toString());
			}
		}
	}
}
