package by.minsk.epam.jio.control;

import java.util.ArrayList;
import java.util.List;

import by.minsk.epam.jio.bean.Treasure;
import by.minsk.epam.jio.generator.TreasureGenerator;

public class DragonCave {

	private List<Treasure> Loot;

	public DragonCave() {
		this.Loot = new ArrayList<Treasure>();
		TreasureGenerator R = new TreasureGenerator();
		for (int i = 0; i < 100; i++) {
			this.Loot.add(R.generateItem());
		}
	}

	public List<Treasure> getLoot() {
		return this.Loot;
	}

	public Treasure getMostExpensive() {
		int cost = 0;
		Treasure mostExpensiveTreasure = null;
		for (int i = 0; i < this.Loot.size(); i++) {
			if (cost < this.Loot.get(i).getCost()) {
				cost = this.Loot.get(i).getCost();
				mostExpensiveTreasure = this.Loot.get(i);
			}
		}
		return mostExpensiveTreasure;
	}

	public ArrayList<Treasure> getTreasureForTheAmount(int amount) {
		ArrayList<Treasure> treasureForTheAmount = new ArrayList<Treasure>();
		for (int i = 0; i < this.Loot.size(); i++) {
			if (this.Loot.get(i).getCost() < amount) {
				treasureForTheAmount.add(this.Loot.get(i));
				amount -= this.Loot.get(i).getCost();
			}
		}
		if (amount != 0) {
			Treasure valuable = new Treasure("Драгоценности на сумму ", amount);
			treasureForTheAmount.add(valuable);
		}
		return treasureForTheAmount;
	}
}
