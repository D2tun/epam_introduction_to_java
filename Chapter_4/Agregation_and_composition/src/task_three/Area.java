package task_three;

import java.util.List;
import java.util.ArrayList;

public class Area {

	private List<Region> region_list;

	public Area() {
		super();
		region_list = new ArrayList<Region>();
	}

	public String get_areal_center() {
		boolean check = false;
		City c = null;
		for (int i = 0; i < this.region_list.size(); i++) {
			for (int j = 0; j < this.region_list.get(i).get_list().size(); j++) {
				if (this.region_list.get(i).get_list().get(j).is_areal_center()) {
					c = this.region_list.get(i).get_list().get(j);
					check = true;
				}
				if (check = true) {
					break;
				}
			}
			if (check = true) {
				break;
			}
		}
		return c.get_name();
	}

	public String get_areal_name() {
		boolean check = false;
		City c = null;
		for (int i = 0; i < this.region_list.size(); i++) {
			for (int j = 0; j < this.region_list.get(i).get_list().size(); j++) {
				if (this.region_list.get(i).get_list().get(j).is_areal_center()) {
					c = this.region_list.get(i).get_list().get(j);
					check = true;
				}
				if (check = true) {
					break;
				}
			}
			if (check = true) {
				break;
			}
		}
		return c.get_name() + "ая";
	}

	public void add_region(Region region) {
		this.region_list.add(region);
	}

	public int get_area() {
		int sum = 0;
		for (int i = 0; i < region_list.size(); i++) {
			sum += region_list.get(i).get_area();
		}
		return sum;
	}

	public List<Region> get_list() {
		return this.region_list;
	}

}
