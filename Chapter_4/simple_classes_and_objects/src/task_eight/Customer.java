package task_eight;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String credit_card_number;
	private String bank_account_number;

	public void set_id(int id) {
		this.id = id;
	}

	public int get_id() {
		return this.id;
	}

	public void set_surname(String surname) {
		this.surname = surname;
	}

	public String get_surname() {
		return this.surname;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public String get_name() {
		return this.name;
	}

	public void set_patronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String get_patronymic() {
		return this.patronymic;
	}

	public void set_address(String address) {
		this.address = address;
	}

	public String get_address() {
		return this.address;
	}

	public void set_credit_card_number(String credit_card_number) {
		this.credit_card_number = credit_card_number;
	}

	public String get_credit_card_number() {
		return this.credit_card_number;
	}

	public void set_bank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
	}

	public String get_bank_account_number() {
		return this.bank_account_number;
	}

	public String toString() {
		return this.surname + " " + this.name + " " + this.patronymic + " Кредитная карта № " + this.credit_card_number
				+ " Банковский счёт № " + this.bank_account_number;
	}
}
