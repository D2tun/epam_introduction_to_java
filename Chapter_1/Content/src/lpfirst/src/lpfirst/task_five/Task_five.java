package lpfirst.task_five;

// ������: ���� ����������� ����� T, ������� ������������ ������������ ���������� ������� � ��������.
// ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: HH� MM��� SSc.
import global.Input_value_int;

public class Task_five {

	public static void main(String[] args) {
		int T = 0;
		Input_value_int value = new Input_value_int();
		T = Input_value_int.Input_value(T);
		int H = T / 3600;
		int MM = (T / 600) - (H * 6);
		int M = (T / 60) - (H * 60) - (MM * 10);
		int SS = (T / 10) - (H * 360) - (MM * 60) - (M * 6);
		int S = T - (H * 3600) - (MM * 600) - (M * 60) - (SS * 10);


		System.out.println(H + "� " + MM + M + "� " + SS + S + "c");
		
	}

}
