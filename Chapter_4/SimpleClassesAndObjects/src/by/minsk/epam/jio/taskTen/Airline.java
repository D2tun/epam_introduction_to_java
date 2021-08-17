package by.minsk.epam.jio.taskTen;

public class Airline {

	private String destination;
	private int airlineNumber;
	private String airplaneType;
	private String startTime;
	private String dayOfWeek;
	
	public Airline() {
		
	}

	public Airline(String destination, int airlineNumber, String airplaneType,
			String startTime, String dayOfWeek) {
		this.airlineNumber = airlineNumber;
		this.destination = destination;
		this.airplaneType = airplaneType;
		this.startTime = startTime;
		this.dayOfWeek = dayOfWeek;
	}
	
	public void setDesination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setAirlineNumber(int number) {
		this.airlineNumber = number;
	}

	public int getAirlineNumber() {
		return this.airlineNumber;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getAirplaneType() {
		return this.airplaneType;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public String toString() {
		return "Рейс № " + this.airlineNumber + ": Время и день вылета: " 
				+ this.startTime + " " + this.dayOfWeek + ", Пункт назначения: "
				+ this.destination + ", самолёт: " + this.airplaneType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + airlineNumber;
		result = prime * result + ((airplaneType == null) 
								  ? 0
								  : airplaneType.hashCode());
		result = prime * result + ((dayOfWeek == null) 
								  ? 0
								  : dayOfWeek.hashCode());
		result = prime * result + ((destination == null)
								  ? 0 
								  : destination.hashCode());
		result = prime * result + ((startTime == null) 
								  ? 0 
								  : startTime.hashCode());
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
		Airline other = (Airline) obj;
		if (airlineNumber != other.airlineNumber)
			return false;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
}
