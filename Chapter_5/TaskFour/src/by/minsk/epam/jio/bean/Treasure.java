package by.minsk.epam.jio.bean;

public class Treasure {

	private String name;
	private int cost;

	public Treasure(String name, int cost) {
		this.cost = cost;
		this.name = name;
	}
	
	public Treasure() {
		this.cost = 0;
		this.name = "";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getName() {
		return this.name;
	}

	public int getCost() {
		return this.cost;
	}

	@Override
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
