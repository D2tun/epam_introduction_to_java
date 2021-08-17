package by.minsk.epam.jio.taskThree;

import java.util.List;
import java.util.ArrayList;

public class Region {

	private List<City> citiesOfRegion;
	private int area;

	public Region(int area) {
		super();
		citiesOfRegion = new ArrayList<City>();
		this.area = area;
	}

	public int getArea() {
		return this.area;
	}

	public String getName() {
		String c = "";
		for (int i = 0; i < citiesOfRegion.size(); i++) {
			if (citiesOfRegion.get(i).checkRegionalCenter()) {
				c = citiesOfRegion.get(i).getName() + "ий";
				break;
			}
		}
		return c;
	}

	public void addCity(City city) {
		this.citiesOfRegion.add(city);
	}

	public List<City> getList() {
		return this.citiesOfRegion;
	}
}
