package lpsecond;

//Найти max{min(a,b), min(c,d)}
import global.Input_value_double;

public class Task_two {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		Input_value_double value = new Input_value_double();
		a = Input_value_double.Input_value(a);
		System.out.println("a=" + a);
		b = Input_value_double.Input_value(b);
		System.out.println("b=" + b);
		c = Input_value_double.Input_value(c);
		System.out.println("c=" + c);
		d = Input_value_double.Input_value(d);
		System.out.println("d=" + d);
		double ab_min = 0;
		double cd_min = 0;
		if (a >= b) {
			ab_min = b;
		} else {
			ab_min = a;
		}
		if (c >= d) {
			cd_min = d;
		} else {
			cd_min = c;
		}
		double MaxOfMin = 0;
		if (ab_min >= cd_min) {
			MaxOfMin = cd_min;
		} else {
			MaxOfMin = ab_min;
		}
		System.out.println(MaxOfMin);
	}

}
