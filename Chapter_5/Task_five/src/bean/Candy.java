package bean;

public class Candy {

	private String name;
	private int cost;
	private int quantity = 1;

	public Candy(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String get_name() {
		return this.name;
	}

	public int get_cost() {
		return this.cost;
	}

	public void set_quantity(int quantity) {
		this.quantity = quantity;
	}

	public int get_quantity() {
		return this.quantity;
	}

	@Override
	public String toString() {
		return this.name + " " + this.quantity + " ��., ����: " + (this.cost * this.quantity) + " �.�.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Candy other = (Candy) obj;
		if (cost != other.cost)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
