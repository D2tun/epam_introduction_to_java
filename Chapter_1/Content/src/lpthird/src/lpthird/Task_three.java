package lpthird;

//����� ����� ��������� ������ ��� �����
import global.Input_value_int;

public class Task_three {

	public static void main(String[] args) {
		Input_value_int value = new Input_value_int();
		int q = 0;
		long SumOfSquares = 0;
		System.out.println("������� ��������� �����");
		Input_value_int.Input_value(q);
		int i = q;
		while (i <= (q + 100)) {
			SumOfSquares = SumOfSquares + (i * i);
			i = i + 1;
		}
		System.out.println("����� ��������� 100 �����: " + SumOfSquares);

	}

}
