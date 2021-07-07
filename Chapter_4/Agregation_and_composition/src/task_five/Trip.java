package task_five;

public class Trip {

	private String type;
	private String transport;
	private String diet;
	private int number_of_days;
	
	public Trip(String type, String transport, String diet, int number_of_days) {
		super();
		this.diet = diet;
		this.transport = transport;
		this.type = type;
		this.number_of_days = number_of_days;
	}
	
	public String get_type() {
		return this.type;
	}
	
	public String get_transport() {
		return this.transport;
	}
	
	public String get_diet() {
		return this.diet;
	}
	
	public int get_number_of_days() {
		return this.number_of_days;
	}
}
