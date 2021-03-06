package by.minsk.epam.jio.bean;

public class Pack {

	private String type;
	private int cost;

	public Pack(String type, int cost) {
		this.cost = cost;
		this.type = type;
	}
	
	public Pack() {
		this.cost = 0;
		this.type = "";
	}

	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return this.cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Упаковка: " + this.type + ", цена: " + this.cost + " у.е.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Pack other = (Pack) obj;
		if (cost != other.cost)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
