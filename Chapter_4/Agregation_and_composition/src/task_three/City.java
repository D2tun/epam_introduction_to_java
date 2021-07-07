package task_three;

public class City {

	private String city;
	private boolean regional_center;
	private boolean areal_center;
	private boolean capital = false;

	public City(String name, boolean regional_center, boolean areal_center, boolean capital) {
		super();
		this.city = name;
		this.regional_center = regional_center;
		this.areal_center = areal_center;
		this.capital = capital;
	}

	public String get_name() {
		return this.city;
	}

	public boolean is_regional_center() {
		return this.regional_center;
	}

	public boolean is_areal_center() {
		return this.areal_center;
	}

	public boolean is_capital() {
		return capital;
	}

}
