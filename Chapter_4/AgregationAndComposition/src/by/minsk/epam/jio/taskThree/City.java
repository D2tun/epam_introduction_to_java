package by.minsk.epam.jio.taskThree;

public class City {

	private String city;
	private boolean regionalCenter;
	private boolean arealCenter;
	private boolean capital = false;

	public City(String name, boolean regionalCenter, boolean arealCenter,
				boolean capital) {
		this.city = name;
		this.regionalCenter = regionalCenter;
		this.arealCenter = arealCenter;
		this.capital = capital;
	}

	public String getName() {
		return this.city;
	}

	public boolean checkRegionalCenter() {
		return this.regionalCenter;
	}

	public boolean checkArealCenter() {
		return this.arealCenter;
	}

	public boolean checkCapital() {
		return capital;
	}
}
