/* 
 * Создайте класс Train, содержащий поля: название пункта назначения, номер 
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа 
 * Train, добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен 
 * пользователем. Добавьте возможность сортировки масив по пункту назначения,
 * причём поезда с одинаковыми пунктами назначения должны быть упорядочены по 
 * времени отправления. 
 */

package by.minsk.epam.jio.taskFour;

public class Main {

	public static void main(String[] args) {
		
		Train[] trains = new Train[5];
		trains[0] = new Train("Гродно", 108, "13:30");
		trains[1] = new Train("Гродно", 120, "12:00");
		trains[2] = new Train("Могилёв", 101, "6:00");
		trains[3] = new Train("Брест", 110, "9:20");
		trains[4] = new Train("Витебск", 114, "18:00");
		
		System.out.println("Список маршрутов поездов:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].getDestination() + ", " 
		                       + trains[i].getNumber() + ", " 
		                       + trains[i].getStartTime());
		}
		
		Train.sortByNumber(trains);

		System.out.println("Список маршрутов поездов c сортировкой по "
				   + "номерам:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].getDestination() + ", " 
					   + trains[i].getNumber() + ", " 
					   + trains[i].getStartTime());
		}
		
		Train.sortByDestination(trains);
		
		System.out.println("Список маршрутов поездов c сортировкой по пунктам "
				  + "назначения:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].getDestination() + ", " 
					   + trains[i].getNumber() + ", " 
					   + trains[i].getStartTime());
		}
		
		int num = 0;
		System.out.println("Введите номер интересующего поезда. ");
		num = ValueInt.inputValue(num);
		
		System.out.println(Train.getTrainInfo(trains, num));
	}
}
