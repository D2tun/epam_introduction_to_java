package by.minsk.epam.jio.main;

/* 
 * Создать класс Календарь с внутренним классом, с помощью объектов которого 
 * можно хранить информацию о выходных и праздничных днях. 
 */

import java.util.List;
import by.minsk.epam.jio.bean.Calendar;
import by.minsk.epam.jio.bean.Calendar.Day;

public class Main {

	public static void main(String[] args) {

		Calendar c = new Calendar();

		Day day1 = c.new Day(21, 02, 2045, false, false);
		Day day2 = c.new Day(22, 02, 2045, false, false);
		Day day3 = c.new Day(23, 02, 2045, false, true);
		Day day4 = c.new Day(24, 02, 2045, false, false);
		Day day5 = c.new Day(25, 02, 2045, false, false);
		Day day6 = c.new Day(26, 02, 2045, true, false);
		Day day7 = c.new Day(27, 02, 2045, true, false);

		c.addDayOffHoliday(day1);
		c.addDayOffHoliday(day2);
		c.addDayOffHoliday(day3);
		c.addDayOffHoliday(day4);
		c.addDayOffHoliday(day5);
		c.addDayOffHoliday(day6);
		c.addDayOffHoliday(day7);

		List<Day> dates = c.getDates();
		for (int i = 0; i < dates.size(); i++) {
			System.out.println(dates.get(i).toString());
		}
	}
}
