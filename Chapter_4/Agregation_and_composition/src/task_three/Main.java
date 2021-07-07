package task_three;

/* Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на 
консоль столицу, количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {

		City city1 = new City("Минск", true, true, true);
		City city2 = new City("Витебск", true, true, false);
		City city3 = new City("Могилёв", true, true, false);
		City city4 = new City("Гомель", true, true, false);
		City city5 = new City("Брест", true, true, false);
		City city6 = new City("Гродно", true, true, false);

		Region region1 = new Region(32800);
		region1.add_city(city5);
		Region region2 = new Region(40000);
		region2.add_city(city2);
		Region region3 = new Region(40400);
		region3.add_city(city4);
		Region region4 = new Region(25100);
		region4.add_city(city6);
		Region region5 = new Region(40200);
		region5.add_city(city1);
		Region region6 = new Region(29100);
		region6.add_city(city3);

		Area area1 = new Area();
		area1.add_region(region1);
		Area area2 = new Area();
		area2.add_region(region2);
		Area area3 = new Area();
		area3.add_region(region3);
		Area area4 = new Area();
		area4.add_region(region4);
		Area area5 = new Area();
		area5.add_region(region5);
		Area area6 = new Area();
		area6.add_region(region6);

		Country country = new Country("Республика Беларусь");
		country.add_area(area1);
		country.add_area(area2);
		country.add_area(area3);
		country.add_area(area4);
		country.add_area(area5);
		country.add_area(area6);

		System.out.println("Государство: " + country.get_name());
		System.out.println("Столица: г. " + country.get_capital());
		System.out.println(country.get_number_of_areas() + " областей");
		System.out.println("Площадь: " + country.get_total_area() + " км. кв.");
		System.out.println("Областные центры: " + country.get_area_centres());

	}

}
