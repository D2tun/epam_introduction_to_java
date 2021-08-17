package by.minsk.epam.jio.main;

import java.util.List;

import by.minsk.epam.jio.bean.Payment;
import by.minsk.epam.jio.bean.Payment.Good;

public class Main {

	public static void main(String[] args) {

		Payment p = new Payment();

		Good good1 = p.new Good("джинсы", 120);
		Good good2 = p.new Good("кофта", 65);
		Good good3 = p.new Good("видеокамера", 200);
		Good good4 = p.new Good("ручка", 2);
		Good good5 = p.new Good("настольная игра", 50);

		p.addGood(good1);
		p.addGood(good2);
		p.addGood(good3);
		p.addGood(good4);
		p.addGood(good5);

		List<Good> goods = p.getList();

		for (int i = 0; i < goods.size(); i++) {
			System.out.println(goods.get(i).toString());
		}
		
		System.out.println("Итого: " + p.getTotalCost() + " у.е.");
	}
}
