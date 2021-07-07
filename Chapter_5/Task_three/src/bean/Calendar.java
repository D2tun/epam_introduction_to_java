package bean;

import java.util.List;
import java.util.ArrayList;

public class Calendar {

	private List<Day> daylist;

	public Calendar() {
		this.daylist = new ArrayList<Day>();
	}

	public void add_day_off_holiday(Day day) {
		if (day.is_day_off() == true | day.is_holiday() == true) {
			daylist.add(day);
		}
	}

	public void show_list() {
		for (int i = 0; i < daylist.size(); i++) {
			System.out.println(daylist.get(i).toString());
		}
	}

	public class Day {

		boolean day_off;
		boolean holiday;
		int day;
		int month;
		int year;

		public Day(int day, int month, int year, boolean day_off, boolean holiday) {
			this.day = day;
			this.month = month;
			this.year = year;
			this.day_off = day_off;
			this.holiday = holiday;
		}

		public int get_day() {
			return this.day;
		}

		public int get_month() {
			return this.month;
		}

		public int get_year() {
			return this.year;
		}

		public boolean is_day_off() {
			return this.day_off;
		}

		public boolean is_holiday() {
			return this.holiday;
		}

		@Override
		public String toString() {
			String day_off;
			String holiday;
			if (this.day_off == true) {
				day_off = "выходной";
			} else {
				day_off = "будний";
			}
			if (this.holiday = true) {
				holiday = "праздник";
			} else {
				holiday = "";
			}
			return this.day + "." + this.month + "." + this.year + " " + day_off + " " + holiday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + day;
			result = prime * result + (day_off ? 1231 : 1237);
			result = prime * result + (holiday ? 1231 : 1237);
			result = prime * result + month;
			result = prime * result + year;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (day != other.day)
				return false;
			if (day_off != other.day_off)
				return false;
			if (holiday != other.holiday)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daylist == null) ? 0 : daylist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (daylist == null) {
			if (other.daylist != null)
				return false;
		} else if (!daylist.equals(other.daylist))
			return false;
		return true;
	}

}
