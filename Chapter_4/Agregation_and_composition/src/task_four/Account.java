package task_four;

public class Account {

	private long money;
	private String account;
	private boolean blocked = false;

	public Account(long money, String account_number) {
		super();
		this.account = account_number;
		this.money = money;
	}

	public void show_account_state() {
		String b = "";
		if (this.blocked = true) {
			b = "заблокирован";
		} else {
			b = "";
		}
		System.out.println(this.account + ": " + this.money + " у.е." + " " + b);
	}

	public long get_money() {
		return this.money;
	}

	public String get_account() {
		return this.account;
	}

	public boolean is_blocked() {
		return blocked;
	}

	public void block() {
		this.blocked = true;
	}

	public void unblock() {
		this.blocked = false;
	}

}
