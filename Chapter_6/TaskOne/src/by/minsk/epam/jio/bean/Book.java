package by.minsk.epam.jio.bean;

public class Book {

	private String title;
	private boolean electronic = false;
	private boolean paper = false;
	private int number;

	public Book(String title, boolean electronic, boolean paper, int number) {
		this.title = title;
		this.electronic = electronic;
		this.paper = paper;
		if (electronic == true & paper == false) {
			this.number = 0;
		} else {
			this.number = number;
		}
	}
	
	public Book() {
		this.title = "";
		this.electronic = false;
		this.number = 0;
		this.paper = false;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setElectronic(boolean isElectronic) {
		this.electronic = isElectronic;
	}

	public boolean getElectronic() {
		return this.electronic;
	}
	
	public void setPaper(boolean isPaper) {
		this.paper = isPaper;
	}
	
	public boolean getPaper() {
		return this.paper;
	}
	
	@Override
	public String toString() {
		String have_electronic = "";
		String have_paper = "";
		if (this.electronic == true) {
			have_electronic = "в электронном варианте";
		} else {
			have_electronic = "";
		}
		if (this.paper == true) {
			have_paper = "в бумажном варианте";
		} else {
			have_paper = "";
		}
		if (this.paper == false) {
			return "Книга \"" + this.title + "\": " + have_electronic;
		} else {
			return "Книга \"" + this.title + "\": " + have_electronic + ", " 
				    + have_paper + " " + this.number + " шт.";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (electronic ? 1231 : 1237);
		result = prime * result + number;
		result = prime * result + (paper ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (electronic != other.electronic)
			return false;
		if (number != other.number)
			return false;
		if (paper != other.paper)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
