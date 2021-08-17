package by.minsk.epam.jio.taskEight;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customersList;

	public CustomerList() {
		customersList = new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer customer) {
		this.customersList.add(customer);
	}

	public void outputSortedByName() {
		
		boolean iteration = true;
		
		while (iteration) {
			iteration = false;
			for (int i = 1; i < this.customersList.size(); i++) {
				if (this.customersList.get(i - 1).getSurname()
						.compareTo(this.customersList.get(i).getSurname()) > 1) {
					iteration = true;
					Customer tmp = this.customersList.get(i);
					this.customersList.set(i, customersList.get(i - 1));
					this.customersList.set(i - 1, tmp);
				}
			}
		}
		
		System.out.println("Список покупателей в алфавитном порядке:");
		for (int i = 0; i < this.customersList.size(); i++) {
			System.out.println(this.customersList.get(i).toString());
		}
	}

	public void outputCreditCardNumbersInRange(String lowBorder, 
											   String highBorder) {
		if (highBorder.compareTo(lowBorder) < 0) {
			String tmp = highBorder;
			highBorder = lowBorder;
			lowBorder = tmp;
		}
		
		System.out.println("Поупатели с номерами кредитных карт от " 
						   + lowBorder + " до " + highBorder + ":");
		for (int i = 0; i < this.customersList.size(); i++) {
			if ((this.customersList.get(i).getCreditCardNumber()
					.compareTo(lowBorder) >= 0) & (this.customersList.get(i)
							.getCreditCardNumber().compareTo(highBorder)
							<= 0)) {
				System.out.println(this.customersList.get(i).toString());
			}
		}
	}
}
