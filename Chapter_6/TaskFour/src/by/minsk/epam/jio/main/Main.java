/*
 * Многопоточность. Порт. Корабли захдят в порт для разгрузки/загрузки 
 * контейнеров. Число контейнеров, находящихся в текущий момент в порту и на 
 * корабле, должо быть неотрицательным и превышающим заданную грузоподъёмность 
 * судна и вместительность порта. В порту работает несколько причалов. У одного 
 * причала может стоять один корабль. Корабль может загружаться у причала или 
 * разгружаться.
 */

package by.minsk.epam.jio.main;

import java.util.Scanner;
import by.minsk.epam.jio.bean.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество причалов.");
		Port port = new Port(sc.nextInt());
		System.out.println("Введите количество кораблей.");
		for (int i = 0; i <= sc.nextInt(); i++) {
			Thread ship = new Thread(new Ship(port));
			ship.start();
		}
	//	System.out.println("Порт вмещает " + port.get_port_capacity() + " контейнеров, в данный момент в порту " + port.get_containers_in_port() + " контейнеров");
	}
}
