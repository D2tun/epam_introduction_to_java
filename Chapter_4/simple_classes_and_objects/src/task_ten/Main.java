package task_ten;

/* ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get-
������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� ��������������
� ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
 Airline: ����� ����������, ����� �����, ��� �������, ����� ������, ��� ������.
 ����� � �������:
 a) ������ ������ ��� ��������� ������ ����������;
 b) ������ ������ ��� ��������� ��� ������;
 c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Airline_list airlines = new Airline_list();
		
		Airline airline1 = new Airline();
		airline1.set_airline_number(134);
		airline1.set_desination("������");
		airline1.set_airplane_type("��-134");
		airline1.set_day_of_week("��.");
		airline1.set_start_time("13:00");
		airlines.add_airline(airline1);
		
		Airline airline2 = new Airline();
		airline2.set_airline_number(166);
		airline2.set_desination("�������");
		airline2.set_airplane_type("Boeing 737-800");
		airline2.set_day_of_week("��.");
		airline2.set_start_time("01:00");
		airlines.add_airline(airline2);
		
		Airline airline3 = new Airline();
		airline3.set_airline_number(170);
		airline3.set_desination("���");
		airline3.set_airplane_type("Embarer E-195");
		airline3.set_day_of_week("��.");
		airline3.set_start_time("09:45");
		airlines.add_airline(airline3);
		
		Airline airline4 = new Airline();
		airline4.set_airline_number(140);
		airline4.set_desination("������");
		airline4.set_airplane_type("Boeing 737-800");
		airline4.set_day_of_week("��.");
		airline4.set_start_time("16:00");
		airlines.add_airline(airline4);
		
		Airline airline5 = new Airline();
		airline5.set_airline_number(180);
		airline5.set_desination("�������");
		airline5.set_airplane_type("Embarer E-175");
		airline5.set_day_of_week("��.");
		airline5.set_start_time("08:55");
		airlines.add_airline(airline5);
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("������� ����� ����������.");
		String a = sc.nextLine();
		airlines.airlines_to(a);
		
		System.out.println("������� ���� ������ (��������: ��.).");
		String b = sc.nextLine();
		airlines.airlines_at_the_day_of_the_week(b);*/
		
		System.out.println("������� ���� ������ (��������: ��.).");
		String c = sc.nextLine();
		System.out.println("������� �����.");
		String d = sc.nextLine();
		airlines.airlines_at_the_day_of_the_week_after_time(c, d);
		
		sc.close();
	}

}
