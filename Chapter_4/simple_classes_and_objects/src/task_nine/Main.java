package task_nine;

/* ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get-
������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Book, � ����������� 
�������������� � ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ��������.
����� � �������:
	�) ������ ���� ��������� ������;
	b) ������ ����, ��������� �������� �������������;
	c) ������ ����, ���������� ����� ��������� ����. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Book_List Books = new Book_List();
		
		Book book1 = new Book();
		book1.set_id(52);
		book1.set_name("������ ��������������");
		book1.set_author("�. �. ������, �. �. ��������");
		book1.set_publisher("����������������");
		book1.set_publishing_year(2007);
		book1.set_pages(585);
		book1.set_cost("10�. 54�.");
		book1.set_cover("������");
		Books.add_book(book1);
		
		Book book2 = new Book();
		book2.set_id(53);
		book2.set_name("��������� ������� ���������� ����������������");
		book2.set_author("�. �. ������, �. �. ��������");
		book2.set_publisher("�������� �����");
		book2.set_publishing_year(2016);
		book2.set_pages(159);
		book2.set_cost("4�. 86�.");
		book2.set_cover("������");
		Books.add_book(book2);
		
		Book book3 = new Book();
		book3.set_id(54);
		book3.set_name("����������� �����. ������������ �����������");
		book3.set_author("��. ����");
		book3.set_publisher("���");
		book3.set_publishing_year(1985);
		book3.set_pages(344);
		book3.set_cost("9�. 83�.");
		book3.set_cover("������");
		Books.add_book(book3);
		
		Book book4 = new Book();
		book4.set_id(55);
		book4.set_name("������");
		book4.set_author("�. ��������");
		book4.set_publisher("���");
		book4.set_publishing_year(2017);
		book4.set_pages(832);
		book4.set_cost("42�. 23�.");
		book4.set_cover("������");
		Books.add_book(book4);
		
		Book book5 = new Book();
		book5.set_id(56);
		book5.set_name("1984");
		book5.set_author("��. ������");
		book5.set_publisher("���");
		book5.set_publishing_year(2013);
		book5.set_pages(320);
		book5.set_cost("7�. 85�.");
		book5.set_cover("������");
		Books.add_book(book5);

		Scanner sc = new Scanner(System.in);
		String a = "";
		System.out.println("������� �������� � ������� ������.");
		a = sc.nextLine();
		Books.get_books_of_the_author(a);
		
		
		String b = "";
		System.out.println("������� ��������.");
		b = sc.nextLine();
		Books.get_books_of_the_publisher(b);
	
		int c = 0;
		System.out.println("������� ���.");
		c = sc.nextInt();
		Books.get_books_published_after_the_year(c);
		
		sc.close();
	}

	
}
