package by.minsk.epam.jio.taskFour;

public class Account {

	private long money;
	private String account;
	private boolean blocked = false;

	public Account(long money, String account_number) {
		super();
		this.account = account_number;
		this.money = money;
	}

	public void showAccountState() {
		String b = "";
		if (this.blocked = true) {
			b = "заблокирован";
		} else {
			b = "";
		}
		System.out.println(this.account + ": " + this.money + " у.е." + " " + b);
	}

	public long getMoney() {
		return this.money;
	}

	public String getAccount() {
		return this.account;
	}

	public boolean checkBlock() {
		return blocked;
	}

	public void block() {
		this.blocked = true;
	}

	public void unblock() {
		this.blocked = false;
	}
}
