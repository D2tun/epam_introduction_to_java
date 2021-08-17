package by.minsk.epam.jio.taskEight;

/* 
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс, 
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной 
 *	карточки, номер банковского счёта.
 *	Найти и вывести:
 *		a) список покупателей в алфавитном порядке
 *		b) список покупателей, у которых номер кредитной карточки находится в 
 *		заданном интервале 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CustomerList List = new CustomerList();
		
		Customer customer1 = new Customer();
		customer1.setAddress("Россия, г. Москва, ул. Есенина 45/1");
		customer1.setBankAccountNumber("20014587479312430003");
		customer1.setCreditCardNumber("4587479312430003");
		customer1.setId(145);
		customer1.setName("Григорий");
		customer1.setPatronymic("Николаевич");
		customer1.setSurname("Жуковский");
		List.addCustomer(customer1);

		Customer customer2 = new Customer();
		customer2.setAddress("Беларусь, г. Минск, ул. Тимирязева 12");
		customer2.setBankAccountNumber("20014587479312430012");
		customer2.setCreditCardNumber("4587479312430012");
		customer2.setId(148);
		customer2.setName("Константин");
		customer2.setPatronymic("Васильевич");
		customer2.setSurname("Шов");
		List.addCustomer(customer2);

		Customer customer3 = new Customer();
		customer3.setAddress("Польша, г. Варшава, площадь Замковая 1/13");
		customer3.setBankAccountNumber("20014587479312430011");
		customer3.setCreditCardNumber("4587479312430011");
		customer3.setId(153);
		customer3.setName("Ян");
		customer3.setPatronymic("");
		customer3.setSurname("Ковальский");
		List.addCustomer(customer3);
		
		Customer customer4 = new Customer();
		customer4.setAddress("Литва, г. Вильнюс, Tilto g. 21-9B");
		customer4.setBankAccountNumber("20014587479312430045");
		customer4.setCreditCardNumber("4587479312430045");
		customer4.setId(151);
		customer4.setName("Неринга");
		customer4.setPatronymic("");
		customer4.setSurname("Даукантайте");
		List.addCustomer(customer4);
		
		Customer customer5 = new Customer();
		customer5.setAddress("Исландия, г. Рейкьявик, Skipholt 33");
		customer5.setBankAccountNumber("20014587479312430000");
		customer5.setCreditCardNumber("4587479312430000");
		customer5.setId(120);
		customer5.setName("Эрик");
		customer5.setPatronymic("Бьёрнсон");
		customer5.setSurname("");
		List.addCustomer(customer5);
		
		List.outputSortedByName();
		
		Scanner sc = new Scanner(System.in);

		String a = "";
		String b = "";
		System.out.println("Введите нижнюю границу номеров карт.");
		a = sc.nextLine();
		System.out.println("Введите верхнюю границу номеров карт.");
		b = sc.nextLine();
		
		List.outputCreditCardNumbersInRange(a, b);	
		sc.close();
	}
}
