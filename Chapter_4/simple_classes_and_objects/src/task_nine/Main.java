package task_nine;

/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get-
методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими 
конструкторами и методати. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.
Найти и вывести:
	а) список книг заданного автора;
	b) список книг, выпущнных заданным издательством;
	c) список книг, выпущенных после заданного года. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Book_List Books = new Book_List();
		
		Book book1 = new Book();
		book1.set_id(52);
		book1.set_name("Теория электропривода");
		book1.set_author("Б. И. Фираго, Л. Б. Павлячик");
		book1.set_publisher("Техноперспектива");
		book1.set_publishing_year(2007);
		book1.set_pages(585);
		book1.set_cost("10р. 54к.");
		book1.set_cover("твёрдый");
		Books.add_book(book1);
		
		Book book2 = new Book();
		book2.set_id(53);
		book2.set_name("Векторные системы управления электроприводами");
		book2.set_author("Б. И. Фираго, Д. С. Васильев");
		book2.set_publisher("Вышэйшая школа");
		book2.set_publishing_year(2016);
		book2.set_pages(159);
		book2.set_cost("4р. 86к.");
		book2.set_cover("мягкий");
		Books.add_book(book2);
		
		Book book3 = new Book();
		book3.set_id(54);
		book3.set_name("Электронные схемы. Практическое руководство");
		book3.set_author("Дж. Ленк");
		book3.set_publisher("Мир");
		book3.set_publishing_year(1985);
		book3.set_pages(344);
		book3.set_cost("9р. 83к.");
		book3.set_cover("мягкий");
		Books.add_book(book3);
		
		Book book4 = new Book();
		book4.set_id(55);
		book4.set_name("Ктулху");
		book4.set_author("Г. Лавкрафт");
		book4.set_publisher("АСТ");
		book4.set_publishing_year(2017);
		book4.set_pages(832);
		book4.set_cost("42р. 23к.");
		book4.set_cover("твёрдый");
		Books.add_book(book4);
		
		Book book5 = new Book();
		book5.set_id(56);
		book5.set_name("1984");
		book5.set_author("Дж. Оруэлл");
		book5.set_publisher("АСТ");
		book5.set_publishing_year(2013);
		book5.set_pages(320);
		book5.set_cost("7р. 85к.");
		book5.set_cover("мягкий");
		Books.add_book(book5);

		Scanner sc = new Scanner(System.in);
		String a = "";
		System.out.println("Введите инициалы и фамилию автора.");
		a = sc.nextLine();
		Books.get_books_of_the_author(a);
		
		
		String b = "";
		System.out.println("Введите издателя.");
		b = sc.nextLine();
		Books.get_books_of_the_publisher(b);
	
		int c = 0;
		System.out.println("Введите год.");
		c = sc.nextInt();
		Books.get_books_published_after_the_year(c);
		
		sc.close();
	}

	
}
