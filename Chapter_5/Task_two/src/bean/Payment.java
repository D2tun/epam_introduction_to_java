package bean;

import java.util.List;
import java.util.ArrayList;

public class Payment {

	private List<Good> goods_list;

	public Payment() {
		this.goods_list = new ArrayList<Good>();
	}

	public void add_good(Good good) {
		this.goods_list.add(good);
	}

	public void show_list() {
		for (int i = 0; i < this.goods_list.size(); i++) {
			System.out.println(this.goods_list.get(i).toString());
		}
	}

	public int get_total_cost() {
		int sum = 0;
		for (int i = 0; i < this.goods_list.size(); i++) {
			sum += this.goods_list.get(i).get_cost();
		}
		return sum;
	}

	public class Good {

		private String name;
		private int cost;

		public Good(String name, int cost) {
			this.cost = cost;
			this.name = name;
		}

		public int get_cost() {
			return this.cost;
		}

		public String get_name() {
			return this.name;
		}

		@Override
		public String toString() {
			return this.name + " " + this.cost + " ó.å.";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + cost;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			Good other = (Good) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (cost != other.cost)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods_list == null) ? 0 : goods_list.hashCode());
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
		Payment other = (Payment) obj;
		if (goods_list == null) {
			if (other.goods_list != null)
				return false;
		} else if (!goods_list.equals(other.goods_list))
			return false;
		return true;
	}

}
