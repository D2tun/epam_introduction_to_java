package by.minsk.epam.jio.taskNine;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> bookList;

	public BookList() {
		bookList = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void getBooksOfTheAuthor(String author) {
		System.out.println("Книги за авторством " + author + ":");
		for (int i = 0; i < bookList.size(); i++) {
			if ((bookList.get(i).getAuthor().contains(author))) {
				System.out.println(bookList.get(i).toString());
			}
		}
	}

	public void getBooksOfThePublisher(String publisher) {
		System.out.println("Книги издательства " + publisher + ":");
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getPublisher().equals(publisher)) {
				System.out.println(bookList.get(i).toString());
			}
		}
	}

	public void getBooksPublishedAfterTheYear(int year) {
		System.out.println("Книги, выпущенные после " + year + " года:");
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getPublishingYear() > year) {
				System.out.println(bookList.get(i).toString());
			}
		}
	}
}
