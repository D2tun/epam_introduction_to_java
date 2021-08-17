package by.minsk.epam.jio.taskFive;

public class Trip {

	private String type;
	private String transport;
	private String diet;
	private int numberOfDays;
	
	public Trip(String type, String transport, String diet, int number_of_days) {
		this.diet = diet;
		this.transport = transport;
		this.type = type;
		this.numberOfDays = number_of_days;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getTransport() {
		return this.transport;
	}
	
	public String getDiet() {
		return this.diet;
	}
	
	public int getNumberOfDays() {
		return this.numberOfDays;
	}
}
