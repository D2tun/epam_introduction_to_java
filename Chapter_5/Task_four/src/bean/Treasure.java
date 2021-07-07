package bean;

public class Treasure {

	private String name;
	private int cost;

	public Treasure(String name, int cost) {
		this.cost = cost;
		this.name = name;
	}

	public String get_name() {
		return this.name;
	}

	public int get_cost() {
		return this.cost;
	}

	public String toString() {
		return this.name + " " + this.cost + " ç.ì.";
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
		Treasure other = (Treasure) obj;
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
