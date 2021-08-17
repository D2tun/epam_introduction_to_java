package by.minsk.epam.jio.taskThree;

import java.util.List;
import java.util.ArrayList;

public class Country {

	private String name;
	private List<Area> areaList;

	public Country(String name) {
		this.name = name;
		this.areaList = new ArrayList<Area>();
	}

	public void addArea(Area area) {
		areaList.add(area);
	}

	public int getArea() {
		int res = 0;
		for (int i = 0; i < areaList.size(); i++) {
			res += areaList.get(i).getArea();
		}
		return res;
	}

	public String getName() {
		return this.name;
	}

	public String getCapital() { 
		boolean check = false;
		for (int i = 0; i < areaList.size(); i++) {
			for (int j = 0; j < areaList.get(i).getList().size(); j++) {
				for (int k = 0; k < areaList.get(i).getList().get(j).getList()
						.size(); k++) {
					if (areaList.get(i).getList().get(j).getList().get(k)
							.checkCapital() & (check == false)) {
						check = true;
						return areaList.get(i).getList().get(j).getList()
								.get(k).getName();
					}
				}
			}
		}
		return "";
	}

	public int getNumberOfAreas() {
		return this.areaList.size();
	}

	public int getTotalArea() {
		int res = 0;
		for (int i = 0; i < this.areaList.size(); i++) {
			res += this.areaList.get(i).getArea();
		}
		return res;
	}

	public String getAreaCentres() {
		String res = "";
		for (int i = 0; i < areaList.size(); i++) {
			for (int j = 0; j < areaList.get(i).getList().size(); j++) {
				for (int k = 0; k < areaList.get(i).getList().get(j).getList()
						.size(); k++) {
					if (areaList.get(i).getList().get(j).getList().get(k)
							.checkArealCenter()) {
						res += areaList.get(i).getList().get(j).getList()
								.get(k).getName() + " ";
					}
				}
			}
		}
		return res;
	}
}
