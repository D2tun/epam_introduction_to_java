package task_nine;

import java.util.ArrayList;
import java.util.List;

public class Book_List {

	private List<Book> Book_List;

	public Book_List() {
		super();
		Book_List = new ArrayList<Book>();
	}

	public void add_book(Book book) {
		Book_List.add(book);
	}

	public void get_books_of_the_author(String author) {
		System.out.println("Книги за авторством " + author + ":");
		for (int i = 0; i < Book_List.size(); i++) {
			if ((Book_List.get(i).get_author().contains(author))) {
				System.out.println(Book_List.get(i).toString());
			}
		}
	}

	public void get_books_of_the_publisher(String publisher) {
		System.out.println("Книги издательства " + publisher + ":");
		for (int i = 0; i < Book_List.size(); i++) {
			if (Book_List.get(i).get_publisher().equals(publisher)) {
				System.out.println(Book_List.get(i).toString());
			}
		}
	}

	public void get_books_published_after_the_year(int year) {
		System.out.println("Книги, выпущенные после " + year + " года:");
		for (int i = 0; i < Book_List.size(); i++) {
			if (Book_List.get(i).get_publishing_year() > year) {
				System.out.println(Book_List.get(i).toString());
			}
		}
	}
}
