
/* Создать класс Payment с внутренним классом, с помощью которого можно
сформировать покупку из нескольких товаров. */

import bean.Payment;
import bean.Payment.Good;

public class Main {

	public static void main(String[] args) {

		Payment p = new Payment();

		Good good1 = p.new Good("джинсы", 120);
		Good good2 = p.new Good("кофта", 65);
		Good good3 = p.new Good("видеокамера", 200);
		Good good4 = p.new Good("ручка", 2);
		Good good5 = p.new Good("настольная игра", 50);

		p.add_good(good1);
		p.add_good(good2);
		p.add_good(good3);
		p.add_good(good4);
		p.add_good(good5);

		p.show_list();

		System.out.println("Итого: " + p.get_total_cost() + " у.е.");

	}

}
