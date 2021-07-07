package task_nine;

public class Book {

	private int id;
	private String name;
	private String publisher;
	private String author;
	private int publishing_year;
	private int pages;
	private String cost;
	private String cover;

	public void set_id(int id) {
		this.id = id;
	}

	public int get_id() {
		return this.id;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public String get_name() {
		return this.name;
	}

	public void set_publisher(String publisher) {
		this.publisher = publisher;
	}

	public String get_publisher() {
		return this.publisher;
	}

	public void set_author(String author) {
		this.author = author;
	}

	public String get_author() {
		return this.author;
	}

	public void set_publishing_year(int publishing_year) {
		this.publishing_year = publishing_year;
	}

	public int get_publishing_year() {
		return this.publishing_year;
	}

	public void set_pages(int pages) {
		this.pages = pages;
	}

	public int get_pages() {
		return this.pages;
	}

	public void set_cost(String cost) {
		this.cost = cost;
	}

	public String get_cost() {
		return this.cost;
	}

	public void set_cover(String cover) {
		this.cover = cover;
	}

	public String get_cover() {
		return this.cover;
	}

	public String toString() {
		return "Книга(" + id + "): \"" + this.name + "\"; автор(ы): " + this.author + "; издательство: "
				+ this.publisher + " " + this.publishing_year + "г.; " + this.pages + "c.; " + "цена: " + this.cost
				+ "; " + this.cover + " переплёт.";
	}
}
