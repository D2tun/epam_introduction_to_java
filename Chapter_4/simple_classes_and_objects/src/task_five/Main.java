package task_five;

/* ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ��� ��������
�� ������� � �������� ���������. ������������� ������������� �������� ���������� �� ��������� �
������������� ����������. ������� ����� ������ ���������� � ���������� ���������, � ����� �����������
�������� ��� ������� ���������. �������� ���, �������������� ��� ����������� ������. */
/***/
import task_four.Input_value_int;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("������� �� ���������:");
		Counter c1 = new Counter();
		System.out.println(c1.get_counter_state());
		c1.increment();
		System.out.println(c1.get_counter_state());
		c1.decrement();
		System.out.println(c1.get_counter_state());
		c1.decrement();
		System.out.println(c1.get_counter_state());

		System.out.println();
		
		System.out.println("������������ �������:");
		Counter c2 = new Counter(2, 98);
		System.out.println(c2.get_counter_state());
		c2.increment();
		System.out.println(c2.get_counter_state());
		c2.increment();
		System.out.println(c2.get_counter_state());
		c2.decrement();
		System.out.println(c2.get_counter_state());
		
		
	}

}
