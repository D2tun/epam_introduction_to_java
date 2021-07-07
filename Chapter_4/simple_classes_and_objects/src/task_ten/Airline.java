package task_ten;

public class Airline {

	private String destination;
	private int airline_number;
	private String airplane_type;
	private String start_time;
	private String day_of_week;

	public void set_desination(String destination) {
		this.destination = destination;
	}

	public String get_destination() {
		return this.destination;
	}

	public void set_airline_number(int number) {
		this.airline_number = number;
	}

	public int get_airline_number() {
		return this.airline_number;
	}

	public void set_airplane_type(String airplane_type) {
		this.airplane_type = airplane_type;
	}

	public String get_airplane_type() {
		return this.airplane_type;
	}

	public void set_start_time(String start_time) {
		this.start_time = start_time;
	}

	public String get_start_time() {
		return this.start_time;
	}

	public void set_day_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	public String get_day_of_week() {
		return this.day_of_week;
	}

	public String toString() {
		return "Рейс № " + this.airline_number + ": Время и день вылета: " + this.start_time + " " + this.day_of_week
				+ ", Пункт назначения: " + this.destination + ", самолёт: " + this.airplane_type;
	}
}
