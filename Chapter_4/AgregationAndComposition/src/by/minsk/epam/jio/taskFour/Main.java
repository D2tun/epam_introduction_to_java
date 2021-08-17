package by.minsk.epam.jio.taskFour;

/* 
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
 * блокировки/разблокировки счёта. Релизовать поиск и сортирову счетов.
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account(5000, "42437769321457864135");
		Account account2 = new Account(-7500, "42437769321457864136");
		Account account3 = new Account(-10000, "42437769321457864140");
		account3.block();
		Account account4 = new Account(20000, "42437769321457864144");
		Account account5 = new Account(2000, "42437769321457864146");

		ClientAccountsManagement m = new ClientAccountsManagement();
		m.addAccount(account5);
		m.addAccount(account3);
		m.addAccount(account4);
		m.addAccount(account1);
		m.addAccount(account2);
		
		m.showAccountList();
		m.sortAccounts();
		
		System.out.println("После сортировки по номерам");
		m.showAccountList();
		System.out.println("Сумма задолженностей:");
		System.out.println(m.getNegativeSum());
		System.out.println("Сумма в наличии:");
		System.out.println(m.getPositiveSum());
		System.out.println("Сумма всего:");
		System.out.println(m.getTotalSum());
	}
}
