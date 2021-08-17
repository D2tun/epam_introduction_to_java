package by.minsk.epam.jio.builder;

import java.util.List;
import by.minsk.epam.jio.bean.*;

import java.util.ArrayList;

public class Gift {

	private List<Candy> gift_content;
	private Pack pack;

	public Gift(Pack pack) {
		this.gift_content = new ArrayList<Candy>();
		this.pack = pack;
	}

	public void addCandy(Candy candy) {
		if (this.gift_content.contains(candy)) {
			int i = this.gift_content.lastIndexOf(candy);
			this.gift_content.get(i)
				.setQuantity(this.gift_content.get(i).getQuantity() + 1);
		} else {
			this.gift_content.add(candy);
		}
	}

	public int getTotalCost() {
		int res = this.getPack().getCost();
		for (int i = 0; i < this.gift_content.size(); i++) {
			res += (this.gift_content.get(i).getCost() 
					* this.gift_content.get(i).getQuantity());
		}
		return res;
	}

	public List<Candy> getGiftContent() {
		return this.gift_content;
	}

	public Pack getPack() {
		return this.pack;
	}
}
