package bean;

import java.util.List;
import java.util.ArrayList;

public class Gift {

	private List<Candy> gift_content;
	private Pack pack;

	public Gift(Pack pack) {
		this.gift_content = new ArrayList<Candy>();
		this.pack = pack;
	}

	public void add_candy(Candy candy) {
		if (this.gift_content.contains(candy)) {
			int i = this.gift_content.lastIndexOf(candy);
			this.gift_content.get(i).set_quantity(this.gift_content.get(i).get_quantity() + 1);
		} else {
			this.gift_content.add(candy);
		}
	}

	public int get_total_cost() {
		int res = this.get_pack().get_cost();
		for (int i = 0; i < this.gift_content.size(); i++) {
			res += (this.gift_content.get(i).get_cost() * this.gift_content.get(i).get_quantity());
		}
		return res;
	}

	public List<Candy> get_gift_content() {
		return this.gift_content;
	}

	public Pack get_pack() {
		return this.pack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gift_content == null) ? 0 : gift_content.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
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
		Gift other = (Gift) obj;
		if (gift_content == null) {
			if (other.gift_content != null)
				return false;
		} else if (!gift_content.equals(other.gift_content))
			return false;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		return true;
	}

}
