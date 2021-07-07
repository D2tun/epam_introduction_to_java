package task_four;

/* �����. ������ ����� ����� ��������� ������ � �����. ��������� ����������� ����������/�������������
�����. ���������� ����� � ��������� ������. ���������� ����� ����� �� ������. ���������� ����� ��
���� ������, ������� ������������� � ������������� ������� ��������. */

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account(5000, "42437769321457864135");
		Account account2 = new Account(-7500, "42437769321457864136");
		Account account3 = new Account(-10000, "42437769321457864140");
		account3.block();
		Account account4 = new Account(20000, "42437769321457864144");
		Account account5 = new Account(2000, "42437769321457864146");

		Client_accounts_management m = new Client_accounts_management();
		m.add_account(account5);
		m.add_account(account3);
		m.add_account(account4);
		m.add_account(account1);
		m.add_account(account2);
		m.show_account_list();
		m.sort_accounts();
		System.out.println("����� ���������� �� �������");
		m.show_account_list();
		System.out.println("����� ��������������:");
		System.out.println(m.get_negative_sum());
		System.out.println("����� � �������:");
		System.out.println(m.get_positive_sum());
		System.out.println("����� �����:");
		System.out.println(m.get_total_sum());
	}

}