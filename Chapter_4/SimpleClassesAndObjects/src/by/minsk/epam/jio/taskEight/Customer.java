package by.minsk.epam.jio.taskEight;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String creditCardNumber;
	private String bankAccountNumber;
	
	public Customer() {
		this.id = 0;
		this.surname = null;
		this.name = null;
		this.patronymic = null;
		this.address = null;
		this.creditCardNumber = null;
		this.bankAccountNumber = null;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getPatronymic() {
		return this.patronymic;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardNumber() {
		return this.creditCardNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	@Override
	public String toString() {
		return this.surname + " " + this.name + " " + this.patronymic + " Кредитная карта № " + this.creditCardNumber
				+ " Банковский счёт № " + this.bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bankAccountNumber == null) 
				 				  ? 0 
				 				  : bankAccountNumber.hashCode());
		result = prime * result + ((creditCardNumber == null)
								  ? 0 
								  : creditCardNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) 
								  ? 0 
								  : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber == null) {
			if (other.bankAccountNumber != null)
				return false;
		} else if (!bankAccountNumber.equals(other.bankAccountNumber))
			return false;
		if (creditCardNumber == null) {
			if (other.creditCardNumber != null)
				return false;
		} else if (!creditCardNumber.equals(other.creditCardNumber))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}	
}
