package task_two;

/* ������� ������ ������ ����������, ��������� ������ ������, ���������. ������: �����, ������������,
������ ������, ������� �� ������� ����� ����������. */

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car("������");
		
		c.show_car_brand();
		c.drive();
		c.fuel_the_car();
		c.fix_the_car();
		c.drive();
		
	}
	
}
