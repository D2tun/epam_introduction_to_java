package task_four;

import java.util.List;
import java.util.ArrayList;

public class Client_accounts_management {

	private List<Account> accounts;

	public Client_accounts_management() {
		this.accounts = new ArrayList<Account>();
	}

	public void add_account(Account account) {
		accounts.add(account);
	}

	public void sort_accounts() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < accounts.size(); i++) {
				if (accounts.get(i).get_account().compareTo(accounts.get(i - 1).get_account()) < 0) {
					Account tmp = accounts.get(i);
					accounts.set(i, accounts.get(i - 1));
					accounts.set(i - 1, tmp);
					iteration = true;
				}
			}
		}
	}

	public long get_total_sum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			res += accounts.get(i).get_money();
		}
		return res;
	}

	public long get_positive_sum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).get_money() > 0) {
				res += accounts.get(i).get_money();
			}
		}
		return res;
	}

	public long get_negative_sum() {
		long res = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).get_money() < 0) {
				res += accounts.get(i).get_money();
			}
		}
		return res;
	}

	public void show_account_list() {
		System.out.println("Список счетов:");
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).show_account_state();
		}
	}
}
