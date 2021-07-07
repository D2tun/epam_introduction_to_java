package task_five;

import java.util.ArrayList;

/* ������������� ������. ������������ ����� ����������� ������� �� ������ ������������� ������
���������� ���� (�����, ���������, �������, ������, ����� � �.�.) ��� ������������ �����. ���������
����������� ������ ����������, ������� � ����� ����. ����������� ����� � ���������� ������. */

public class Main {

	public static void main(String[] args) {

		Trip trip1 = new Trip("�����", "������", "�� ��������", 7);
		Trip trip2 = new Trip("�����", "������", "��� �������", 8);
		Trip trip3 = new Trip("���������", "�� ���������������", "��� �������", 7);
		Trip trip4 = new Trip("�������", "�����", "����������", 14);
		Trip trip5 = new Trip("�����", "�� ���������������", "������ �������", 11);

		Trip_list list = new Trip_list();
		list.add_trip(trip1);
		list.add_trip(trip2);
		list.add_trip(trip3);
		list.add_trip(trip4);
		list.add_trip(trip5);

		list.show_list();

		System.out.println("���������� �� ����:");
		list.sort_by_type();
		list.show_list();

		System.out.println("���������� �� ����������:");
		list.sort_by_transport();
		list.show_list();

		System.out.println("���������� �� �������:");
		list.sort_by_diet();
		list.show_list();

		System.out.println("���������� �� ��������� ����:");
		list.sort_by_number_of_days();
		list.show_list();

		ArrayList<Trip> t = list.chosen_trip();
		System.out.println("���������� ������:");
		for (int i = 0; i < t.size(); i++) {
			System.out.println(t.get(i).get_type() + ": ��������� - " + t.get(i).get_transport() + ", ������� - "
					+ t.get(i).get_diet() + ", ���� - " + t.get(i).get_number_of_days());
		}
	}

}
