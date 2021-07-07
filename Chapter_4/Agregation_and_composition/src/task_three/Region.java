package task_three;

import java.util.List;
import java.util.ArrayList;

public class Region {

	private List<City> cities_of_region;
	private int area;

	public Region(int area) {
		super();
		cities_of_region = new ArrayList<City>();
		this.area = area;
	}

	public int get_area() {
		return this.area;
	}

	public String get_name() {
		String c = "";
		for (int i = 0; i < cities_of_region.size(); i++) {
			if (cities_of_region.get(i).is_regional_center()) {
				c = cities_of_region.get(i).get_name() + "ий";
				break;
			}
		}
		return c;
	}

	public void add_city(City city) {
		this.cities_of_region.add(city);
	}

	public List<City> get_list() {
		return this.cities_of_region;
	}

}
