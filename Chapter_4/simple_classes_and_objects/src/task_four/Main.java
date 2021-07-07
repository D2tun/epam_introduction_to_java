package task_four;

/* �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� �������
�� ������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
�������� ����������� ���������� ����� �� ������ ����������, ������ ������ � ����������� �������� ����������
������ ���� ����������� �� ������� �����������. */

public class Main {

	public static void main(String[] args) {
		
		Train[] trains = new Train[5];
		trains[0] = new Train("������", 108, "13:30");
		trains[1] = new Train("������", 120, "12:00");
		trains[2] = new Train("������", 101, "6:00");
		trains[3] = new Train("�����", 110, "9:20");
		trains[4] = new Train("�������", 114, "18:00");
		
		System.out.println("������ ��������� �������:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].get_destination() + ", " + trains[i].get_number() + ", " + trains[i].get_start_time());
		}
		
		Train.sort_by_number(trains);

		System.out.println("������ ��������� ������� c ����������� �� �������:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].get_destination() + ", " + trains[i].get_number() + ", " + trains[i].get_start_time());
		}
		
		Train.sort_by_destination(trains);
		
		System.out.println("������ ��������� ������� c ����������� �� ������� ����������:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") " + trains[i].get_destination() + ", " + trains[i].get_number() + ", " + trains[i].get_start_time());
		}
		
		int num = 0;
		System.out.println("������� ����� ������������� ������. ");
		num = Input_value_int.Input_value(num);
		
		System.out.println(Train.get_train_info(trains, num));
	}

}
