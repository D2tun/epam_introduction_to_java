package bean;

import java.util.ArrayList;
import java.util.List;

public class Dragon_cave {

	private List<Treasure> Loot;

	public Dragon_cave() {
		this.Loot = new ArrayList<Treasure>();
		Treasure_generator R = new Treasure_generator();
		for (int i = 0; i < 100; i++) {
			this.Loot.add(R.generate_item());
		}
	}

	public void show_Loot() {
		System.out.println("Сокровища дракона: ");
		for (int i = 0; i < this.Loot.size(); i++) {
			System.out.println((i + 1) + ") " + this.Loot.get(i).toString());
		}
	}

	public Treasure get_most_expensive() {
		int cost = 0;
		Treasure most_expensive_treasure = null;
		for (int i = 0; i < this.Loot.size(); i++) {
			if (cost < this.Loot.get(i).get_cost()) {
				cost = this.Loot.get(i).get_cost();
				most_expensive_treasure = this.Loot.get(i);
			}
		}
		return most_expensive_treasure;
	}

	public ArrayList<Treasure> get_treasure_for_the_amount(int amount) {
		ArrayList<Treasure> treasure_for_the_amount = new ArrayList<Treasure>();
		for (int i = 0; i < this.Loot.size(); i++) {
			if (this.Loot.get(i).get_cost() < amount) {
				treasure_for_the_amount.add(this.Loot.get(i));
				amount -= this.Loot.get(i).get_cost();
			}
		}
		if (amount != 0) {
			Treasure valuable = new Treasure("Драгоценности на сумму" + amount, amount);
			treasure_for_the_amount.add(valuable);
		}
		return treasure_for_the_amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Loot == null) ? 0 : Loot.hashCode());
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
		Dragon_cave other = (Dragon_cave) obj;
		if (Loot == null) {
			if (other.Loot != null)
				return false;
		} else if (!Loot.equals(other.Loot))
			return false;
		return true;
	}

}
