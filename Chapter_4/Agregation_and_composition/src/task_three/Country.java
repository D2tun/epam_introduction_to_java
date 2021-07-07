package task_three;

import java.util.List;
import java.util.ArrayList;

public class Country {

	private String name;
	private List<Area> area_list;

	public Country(String name) {
		super();
		this.name = name;
		this.area_list = new ArrayList<Area>();
	}

	public void add_area(Area area) {
		area_list.add(area);
	}

	public int get_area() {
		int res = 0;
		for (int i = 0; i < area_list.size(); i++) {
			res += area_list.get(i).get_area();
		}
		return res;
	}

	public String get_name() {
		return this.name;
	}

	public String get_capital() { 
		boolean check = false;
		for (int i = 0; i < area_list.size(); i++) {
			for (int j = 0; j < area_list.get(i).get_list().size(); j++) {
				for (int k = 0; k < area_list.get(i).get_list().get(j).get_list().size(); k++) {
					if (area_list.get(i).get_list().get(j).get_list().get(k).is_capital() & check == false) {
						check = true;
						return area_list.get(i).get_list().get(j).get_list().get(k).get_name();
					}
				}
			}
		}
		return "";
	}

	public int get_number_of_areas() {
		return this.area_list.size();
	}

	public int get_total_area() {
		int res = 0;
		for (int i = 0; i < this.area_list.size(); i++) {
			res += this.area_list.get(i).get_area();
		}
		return res;
	}

	public String get_area_centres() {
		String res = "";
		for (int i = 0; i < area_list.size(); i++) {
			for (int j = 0; j < area_list.get(i).get_list().size(); j++) {
				for (int k = 0; k < area_list.get(i).get_list().get(j).get_list().size(); k++) {
					if (area_list.get(i).get_list().get(j).get_list().get(k).is_areal_center()) {
						res += area_list.get(i).get_list().get(j).get_list().get(k).get_name() + " ";
					}
				}
			}
		}
		return res;
	}

}
