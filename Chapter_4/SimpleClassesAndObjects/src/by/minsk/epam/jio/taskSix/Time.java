package by.minsk.epam.jio.taskSix;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;
	
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public void setSeconds(int seconds) {

		if ((seconds > 60) | (seconds < 0)) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void setMinutes(int minutes) {

		if ((minutes > 60) | (minutes < 0)) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public void setHours(int hours) {

		if ((hours > 24) | (hours < 0)) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public void addSeconds(int seconds) {
		this.seconds += seconds;
		while (this.seconds >= 60) {
			this.seconds -= 60;
			this.minutes += 1;
		}
	}

	public void addMinutes(int minutes) {
		this.minutes += minutes;
		while (this.minutes >= 60) {
			this.minutes -= 60;
			this.hours += 1;
		}
	}

	public void addHours(int hours) {
		this.hours += hours;
		while (this.hours >= 24) {
			this.hours -= 24;
		}
	}

	@Override
	public String toString() {
		return "Время: " + this.hours + ":" + this.minutes + ":" + this.seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}
}
