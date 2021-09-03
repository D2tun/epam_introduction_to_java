/* 
 * Создать класс Book, спецификация которого приведена ниже. Определить 
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс, 
 * агрегирующий массив типа Book, с подходящими конструкторами и методати. 
 * Задать критерии выбора данных и вывести эти данные на консоль. Book: id,
 * название, автор(ы), издательство, год издания, количество страниц, цена, тип
 * переплёта.
 *	Найти и вывести:
 * 		а) список книг заданного автора;
 *		b) список книг, выпущнных заданным издательством;
 *		c) список книг, выпущенных после заданного года. 
 */

package by.minsk.epam.jio.taskNine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BookList Books = new BookList();
		
		Book book1 = new Book();
		book1.setId(52);
		book1.setName("Теория электропривода");
		book1.setAuthor("Б. И. Фираго, Л. Б. Павлячик");
		book1.setPublisher("Техноперспектива");
		book1.setPublishingYear(2007);
		book1.setPages(585);
		book1.setCost("10р. 54к.");
		book1.setCover("твёрдый");
		Books.addBook(book1);
		
		Book book2 = new Book();
		book2.setId(53);
		book2.setName("Векторные системы управления электроприводами");
		book2.setAuthor("Б. И. Фираго, Д. С. Васильев");
		book2.setPublisher("Вышэйшая школа");
		book2.setPublishingYear(2016);
		book2.setPages(159);
		book2.setCost("4р. 86к.");
		book2.setCover("мягкий");
		Books.addBook(book2);
		
		Book book3 = new Book();
		book3.setId(54);
		book3.setName("Электронные схемы. Практическое руководство");
		book3.setAuthor("Дж. Ленк");
		book3.setPublisher("Мир");
		book3.setPublishingYear(1985);
		book3.setPages(344);
		book3.setCost("9р. 83к.");
		book3.setCover("мягкий");
		Books.addBook(book3);
		
		Book book4 = new Book();
		book4.setId(55);
		book4.setName("Ктулху");
		book4.setAuthor("Г. Лавкрафт");
		book4.setPublisher("АСТ");
		book4.setPublishingYear(2017);
		book4.setPages(832);
		book4.setCost("42р. 23к.");
		book4.setCover("твёрдый");
		Books.addBook(book4);
		
		Book book5 = new Book();
		book5.setId(56);
		book5.setName("1984");
		book5.setAuthor("Дж. Оруэлл");
		book5.setPublisher("АСТ");
		book5.setPublishingYear(2013);
		book5.setPages(320);
		book5.setCost("7р. 85к.");
		book5.setCover("мягкий");
		Books.addBook(book5);

		Scanner sc = new Scanner(System.in);
		String a = "";
		System.out.println("Введите инициалы и фамилию автора.");
		a = sc.nextLine();
		Books.getBooksOfTheAuthor(a);
		
		
		String b = "";
		System.out.println("Введите издателя.");
		b = sc.nextLine();
		Books.getBooksOfThePublisher(b);
	
		int c = 0;
		System.out.println("Введите год.");
		c = sc.nextInt();
		Books.getBooksPublishedAfterTheYear(c);
		
		sc.close();
	}
}
