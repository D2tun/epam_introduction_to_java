
/* Создать класс Календарь с внутренним классом, с помощью объектов которого можно 
хранить информацию о выходных и праздничных днях. */

import bean.Calendar;
import bean.Calendar.Day;

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

		c.add_day_off_holiday(day1);
		c.add_day_off_holiday(day2);
		c.add_day_off_holiday(day3);
		c.add_day_off_holiday(day4);
		c.add_day_off_holiday(day5);
		c.add_day_off_holiday(day6);
		c.add_day_off_holiday(day7);

		c.show_list();
	}

}
