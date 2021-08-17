package by.minsk.epam.jio.bean;

import java.util.List;
import java.util.ArrayList;

public class Payment {

	private List<Good> goodsList;

	public Payment() {
		this.goodsList = new ArrayList<Good>();
	}

	public void addGood(Good good) {
		this.goodsList.add(good);
	}

	public List<Good> getList() {
		return this.goodsList;
	}

	public int getTotalCost() {
		int sum = 0;
		for (int i = 0; i < this.goodsList.size(); i++) {
			sum += this.goodsList.get(i).getCost();
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
		
		public Good() {
			this.cost = 0;
			this.name = "";
		}

		public int getCost() {
			return this.cost;
		}
		
		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name + " " + this.cost + " у.е.";
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
}
