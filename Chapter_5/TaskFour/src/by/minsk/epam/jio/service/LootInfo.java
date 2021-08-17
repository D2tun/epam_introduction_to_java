package by.minsk.epam.jio.service;

import by.minsk.epam.jio.control.DragonCave;

public class LootInfo {

	public static void showLoot(DragonCave cave) {
		System.out.println("Сокровища дракона: ");
		for (int i = 0; i < cave.getLoot().size(); i++) {
			System.out.println((i + 1) + ") "
							   + cave.getLoot().get(i).toString());
		}
	}
	
	public static void showMostExpensive(DragonCave cave) {
		System.out.println(cave.getMostExpensive());
	}
	
	public static void showTreasureForTheAmount(DragonCave cave, int amount) {
		System.out.println(cave.getTreasureForTheAmount(amount));
	}
}
