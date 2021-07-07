package task_six;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public void set_seconds(int seconds) {

		if (seconds > 60 | seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void set_minutes(int minutes) {

		if (minutes > 60 | minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public void set_hours(int hours) {

		if (hours > 24 | hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public void add_seconds(int seconds) {
		this.seconds += seconds;
		while (this.seconds >= 60) {
			this.seconds -= 60;
			this.minutes += 1;
		}
	}

	public void add_minutes(int minutes) {
		this.minutes += minutes;
		while (this.minutes >= 60) {
			this.minutes -= 60;
			this.hours += 1;
		}
	}

	public void add_hours(int hours) {
		this.hours += hours;
		while (this.hours >= 24) {
			this.hours -= 24;
		}
	}

	public String get_time() {
		return "Время: " + this.hours + ":" + this.minutes + ":" + this.seconds;
	}
}
