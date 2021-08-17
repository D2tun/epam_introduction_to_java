package by.minsk.epam.jio.taskThree;

import java.util.List;
import java.util.ArrayList;

public class Area {

	private List<Region> regionList;

	public Area() {
		this.regionList = new ArrayList<Region>();
	}

	public String getArealCenter() {
		boolean check = false;
		City c = null;
		for (int i = 0; i < this.regionList.size(); i++) {
			for (int j = 0; j < this.regionList.get(i).getList().size(); j++) {
				if (this.regionList.get(i).getList().get(j).checkArealCenter()) {
					c = this.regionList.get(i).getList().get(j);
					check = true;
				}
				if (check == true) {
					break;
				}
			}
			if (check == true) {
				break;
			}
		}
		return c.getName();
	}

	public String getArealName() {
		boolean check = false;
		City c = null;
		for (int i = 0; i < this.regionList.size(); i++) {
			for (int j = 0; j < this.regionList.get(i).getList().size(); j++) {
				if (this.regionList.get(i).getList().get(j).checkArealCenter()) {
					c = this.regionList.get(i).getList().get(j);
					check = true;
				}
				if (check == true) {
					break;
				}
			}
			if (check == true) {
				break;
			}
		}
		return c.getName() + "ая";
	}

	public void addRegion(Region region) {
		this.regionList.add(region);
	}

	public int getArea() {
		int sum = 0;
		for (int i = 0; i < regionList.size(); i++) {
			sum += regionList.get(i).getArea();
		}
		return sum;
	}

	public List<Region> getList() {
		return this.regionList;
	}
}
