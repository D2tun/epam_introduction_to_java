/* 
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные 
 * центры. 
 */

package by.minsk.epam.jio.taskThree;

public class Main {

	public static void main(String[] args) {

		City city1 = new City("Минск", true, true, true);
		City city2 = new City("Витебск", true, true, false);
		City city3 = new City("Могилёв", true, true, false);
		City city4 = new City("Гомель", true, true, false);
		City city5 = new City("Брест", true, true, false);
		City city6 = new City("Гродно", true, true, false);

		Region region1 = new Region(32800);
		region1.addCity(city5);
		Region region2 = new Region(40000);
		region2.addCity(city2);
		Region region3 = new Region(40400);
		region3.addCity(city4);
		Region region4 = new Region(25100);
		region4.addCity(city6);
		Region region5 = new Region(40200);
		region5.addCity(city1);
		Region region6 = new Region(29100);
		region6.addCity(city3);

		Area area1 = new Area();
		area1.addRegion(region1);
		Area area2 = new Area();
		area2.addRegion(region2);
		Area area3 = new Area();
		area3.addRegion(region3);
		Area area4 = new Area();
		area4.addRegion(region4);
		Area area5 = new Area();
		area5.addRegion(region5);
		Area area6 = new Area();
		area6.addRegion(region6);

		Country country = new Country("Республика Беларусь");
		country.addArea(area1);
		country.addArea(area2);
		country.addArea(area3);
		country.addArea(area4);
		country.addArea(area5);
		country.addArea(area6);

		System.out.println("Государство: " + country.getName());
		System.out.println("Столица: г. " + country.getCapital());
		System.out.println(country.getNumberOfAreas() + " областей");
		System.out.println("Площадь: " + country.getTotalArea() + " км. кв.");
		System.out.println("Областные центры: " + country.getAreaCentres());
	}
}
