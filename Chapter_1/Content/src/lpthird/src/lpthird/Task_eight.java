package lpthird;

import java.util.LinkedHashSet;

/*Даны 2 числа. Определить цифры, входящие в запись как первого 
так и второго числа.*/

import global.Input_value_int;

public class Task_eight {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int na = 0;
		int i1 = 0;
		int i2 = 0;
		String c = " ";
		System.out.print("а=");
		a = Input_value_int.Input_value(StrictMath.abs(a));
		System.out.print("b=");
		b = Input_value_int.Input_value(StrictMath.abs(b));
		
		int nb = b;
		
		System.out.print("Цифры, содержащтеся в обоих числах: ");
		
		while (a > 0) {
			na = a % 10;
			a = a / 10;
			
			while (b > 0) {
				if ((b % 10)==na)	{
					c = c + Integer.toString(na);
					System.out.print(na + ", ");	
				}
				b = b / 10;

			}
			b = nb;
		}
		System.out.println(c);
		// конец работающей части
		char [] cch = c.toCharArray();
		StringBuilder result = new StringBuilder();
		for (i1 = 0 ; i1<c.length(); i1++) {
			for (i2 = 0 ; i2<c.length(); i2++) {
				if (cch[i1]==cch[i2]) {
					break;
				}
				if (cch[i1]!=cch[i2]) {
					result.append(cch[i1]);
				}
			}
		}
		System.out.println(result);
	}

}
