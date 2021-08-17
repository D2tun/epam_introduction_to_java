package by.minsk.epam.jio.bean;

import java.util.List;
import java.util.ArrayList;

public class Calendar {

	private List<Day> dayList;

	public Calendar() {
		this.dayList = new ArrayList<Day>();
	}

	public void addDayOffHoliday(Day day) {
		if (day.getDayOff() == true | day.getHoliday() == true) {
			this.dayList.add(day);
		}
	}

	public List<Day> getDates() {
		return this.dayList;
	}

	public class Day {

		private boolean dayOff;
		private boolean holiday;
		private int day;
		private int month;
		private int year;

		public Day(int day, int month, int year, boolean dayOff, 
				boolean holiday) {
			this.day = day;
			this.month = month;
			this.year = year;
			this.dayOff = dayOff;
			this.holiday = holiday;
		}
		
		public Day() {
			this.day = 0;
			this.dayOff = false;
			this.holiday = false;
			this.month = 0;
			this.year = 0;
		}

		public int getDay() {
			return this.day;
		}
		
		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return this.month;
		}
		
		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return this.year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		public boolean getDayOff() {
			return this.dayOff;
		}
		
		public void setDayOff(boolean isDayOff) {
			this.dayOff = isDayOff;
		}

		public boolean getHoliday() {
			return this.holiday;
		}
		
		public void setHoliday(boolean isHoliday) {
			this.holiday = isHoliday;
		}

		@Override
		public String toString() {
			String dayOff;
			String holiday;
			if (this.dayOff == true) {
				dayOff = "выходной";
			} else {
				dayOff = "будний";
			}
			if (this.holiday == true) {
				holiday = "праздник";
			} else {
				holiday = "";
			}
			return this.day + "." + this.month + "." + this.year + " " + dayOff 
					+ " " + holiday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + day;
			result = prime * result + (dayOff ? 1231 : 1237);
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
			if (dayOff != other.dayOff)
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
}
