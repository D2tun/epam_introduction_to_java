package task_eight;

import java.util.ArrayList;
import java.util.List;

public class Customer_list {

	private List<Customer> Customers_List;

	public Customer_list() {
		super();
		Customers_List = new ArrayList<Customer>();
	}
	
	public void add_customer(Customer customer) {
		this.Customers_List.add(customer);
	}

	public void output_sorted_by_name() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < this.Customers_List.size(); i++) {
				if (this.Customers_List.get(i - 1).get_surname()
						.compareTo(this.Customers_List.get(i).get_surname()) > 1) {
					iteration = true;
					Customer tmp = this.Customers_List.get(i);
					this.Customers_List.set(i, Customers_List.get(i - 1));
					this.Customers_List.set(i - 1, tmp);
				}
			}
		}
		System.out.println("Список покупателей в алфавитном порядке:");
		for (int i = 0; i < this.Customers_List.size(); i++) {
			System.out.println(this.Customers_List.get(i).toString());
		}
	}

	public void output_credit_card_numbers_in_range(String low_border, String high_border) {
		if (high_border.compareTo(low_border) < 0) {
			String tmp = high_border;
			high_border = low_border;
			low_border = tmp;
		}/***/
		System.out.println("Поупатели с номерами кредитных карт от " + low_border + " до " + high_border + ":");
		for (int i = 0; i < this.Customers_List.size(); i++) {
			if (this.Customers_List.get(i).get_credit_card_number().compareTo(low_border) >= 0 
					& this.Customers_List.get(i).get_credit_card_number().compareTo(high_border) <= 0) {
				System.out.println(this.Customers_List.get(i).toString());
			}
		}
	}

}
