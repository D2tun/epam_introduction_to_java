package task_eight;

import java.util.Scanner;

/* ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � 
get- ������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Customer, � �����������
�������������� � ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
	����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
	����� � �������:
		a) ������ ����������� � ���������� �������
		b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ��������� */

public class Main {

	public static void main(String[] args) {
		
		Customer_list List = new Customer_list();
		
		Customer customer1 = new Customer();
		customer1.set_address("������, �. ������, ��. ������� 45/1");
		customer1.set_bank_account_number("20014587479312430003");
		customer1.set_credit_card_number("4587479312430003");
		customer1.set_id(145);
		customer1.set_name("��������");
		customer1.set_patronymic("����������");
		customer1.set_surname("���������");
		List.add_customer(customer1);

		Customer customer2 = new Customer();
		customer2.set_address("��������, �. �����, ��. ���������� 12");
		customer2.set_bank_account_number("20014587479312430012");
		customer2.set_credit_card_number("4587479312430012");
		customer2.set_id(148);
		customer2.set_name("����������");
		customer2.set_patronymic("����������");
		customer2.set_surname("���");
		List.add_customer(customer2);

		Customer customer3 = new Customer();
		customer3.set_address("������, �. �������, ������� �������� 1/13");
		customer3.set_bank_account_number("20014587479312430011");
		customer3.set_credit_card_number("4587479312430011");
		customer3.set_id(153);
		customer3.set_name("��");
		customer3.set_patronymic("");
		customer3.set_surname("����������");
		List.add_customer(customer3);
		
		Customer customer4 = new Customer();
		customer4.set_address("�����, �. �������, Tilto g. 21-9B");
		customer4.set_bank_account_number("20014587479312430045");
		customer4.set_credit_card_number("4587479312430045");
		customer4.set_id(151);
		customer4.set_name("�������");
		customer4.set_patronymic("");
		customer4.set_surname("�����������");
		List.add_customer(customer4);
		
		Customer customer5 = new Customer();
		customer5.set_address("��������, �. ���������, Skipholt 33");
		customer5.set_bank_account_number("20014587479312430000");
		customer5.set_credit_card_number("4587479312430000");
		customer5.set_id(120);
		customer5.set_name("����");
		customer5.set_patronymic("��������");
		customer5.set_surname("");
		List.add_customer(customer5);
		
		List.output_sorted_by_name();
		
		Scanner sc = new Scanner(System.in);

		String a = "";
		String b = "";
		System.out.println("������� ������ ������� ������� ����.");
		a = sc.nextLine();
		System.out.println("������� ������� ������� ������� ����.");
		b = sc.nextLine();
		
		List.output_credit_card_numbers_in_range(a, b);
		

		
	}

}
