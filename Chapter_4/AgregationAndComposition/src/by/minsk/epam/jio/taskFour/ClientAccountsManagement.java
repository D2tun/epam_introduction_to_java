package by.minsk.epam.jio.taskFour;

import java.util.List;
import java.util.ArrayList;

public class ClientAccountsManagement {

	private List<Account> accounts;

	public ClientAccountsManagement() {
		this.accounts = new ArrayList<Account>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void sortAccounts() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < accounts.size(); i++) {
				if (accounts.get(i).getAccount()
						.compareTo(accounts.get(i - 1).getAccount()) < 0) {
					Account tmp = accounts.get(i);
					accounts.set(i, accounts.get(i - 1));
					accounts.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public long getTotalSum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			res += accounts.get(i).getMoney();
		}
		return res;
	}

	public long getPositiveSum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getMoney() > 0) {
				res += accounts.get(i).getMoney();
			}
		}
		return res;
	}

	public long getNegativeSum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getMoney() < 0) {
				res += accounts.get(i).getMoney();
			}
		}
		return res;
	}

	public void showAccountList() {
		System.out.println("Список счетов:");
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).showAccountState();
		}
	}
}
