package by.minsk.epam.jio.taskNine;

public class Book {

	private int id;
	private String name;
	private String publisher;
	private String author;
	private int publishingYear;
	private int pages;
	private String cost;
	private String cover;

	public Book() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getPublishingYear() {
		return this.publishingYear;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPages() {
		return this.pages;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCover() {
		return this.cover;
	}

	@Override
	public String toString() {
		return "Книга(" + id + "): \"" + this.name + "\"; автор(ы): " 
				+ this.author + "; издательство: " + this.publisher + " "
				+ this.publishingYear + "г.; " + this.pages + "c.; " + "цена: " 
				+ this.cost + "; " + this.cover + " переплёт.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + publishingYear;
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
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (publishingYear != other.publishingYear)
			return false;
		return true;
	}
}
