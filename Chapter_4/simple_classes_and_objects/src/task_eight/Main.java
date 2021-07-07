package task_eight;

import java.util.Scanner;

/* Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и 
get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счёта.
	Найти и вывести:
		a) список покупателей в алфавитном порядке
		b) список покупателей, у которых номер кредитной карточки находится в заданном интервале */

public class Main {

	public static void main(String[] args) {
		
		Customer_list List = new Customer_list();
		
		Customer customer1 = new Customer();
		customer1.set_address("Россия, г. Москва, ул. Есенина 45/1");
		customer1.set_bank_account_number("20014587479312430003");
		customer1.set_credit_card_number("4587479312430003");
		customer1.set_id(145);
		customer1.set_name("Григорий");
		customer1.set_patronymic("Николаевич");
		customer1.set_surname("Жуковский");
		List.add_customer(customer1);

		Customer customer2 = new Customer();
		customer2.set_address("Беларусь, г. Минск, ул. Тимирязева 12");
		customer2.set_bank_account_number("20014587479312430012");
		customer2.set_credit_card_number("4587479312430012");
		customer2.set_id(148);
		customer2.set_name("Константин");
		customer2.set_patronymic("Васильевич");
		customer2.set_surname("Шов");
		List.add_customer(customer2);

		Customer customer3 = new Customer();
		customer3.set_address("Польша, г. Варшава, площадь Замковая 1/13");
		customer3.set_bank_account_number("20014587479312430011");
		customer3.set_credit_card_number("4587479312430011");
		customer3.set_id(153);
		customer3.set_name("Ян");
		customer3.set_patronymic("");
		customer3.set_surname("Ковальский");
		List.add_customer(customer3);
		
		Customer customer4 = new Customer();
		customer4.set_address("Литва, г. Вильнюс, Tilto g. 21-9B");
		customer4.set_bank_account_number("20014587479312430045");
		customer4.set_credit_card_number("4587479312430045");
		customer4.set_id(151);
		customer4.set_name("Неринга");
		customer4.set_patronymic("");
		customer4.set_surname("Даукантайте");
		List.add_customer(customer4);
		
		Customer customer5 = new Customer();
		customer5.set_address("Исландия, г. Рейкьявик, Skipholt 33");
		customer5.set_bank_account_number("20014587479312430000");
		customer5.set_credit_card_number("4587479312430000");
		customer5.set_id(120);
		customer5.set_name("Эрик");
		customer5.set_patronymic("Бьёрнсон");
		customer5.set_surname("");
		List.add_customer(customer5);
		
		List.output_sorted_by_name();
		
		Scanner sc = new Scanner(System.in);

		String a = "";
		String b = "";
		System.out.println("Введите нижнюю границу номеров карт.");
		a = sc.nextLine();
		System.out.println("Введите верхнюю границу номеров карт.");
		b = sc.nextLine();
		
		List.output_credit_card_numbers_in_range(a, b);
		

		
	}

}
