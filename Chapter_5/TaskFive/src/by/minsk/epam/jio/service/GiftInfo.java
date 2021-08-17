package by.minsk.epam.jio.service;

import by.minsk.epam.jio.builder.Gift;

public class GiftInfo {

	public static void print(Gift gift) {
		System.out.println(gift.getPack().toString());
		for (int i = 0; i < gift.getGiftContent().size(); i++) {
			System.out.println(gift.getGiftContent().get(i).toString());
		}
		System.out.println("Итого: " + gift.getTotalCost() + " у.е.");
	}
}
