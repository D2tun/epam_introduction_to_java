package lpthird;

//��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����. m � n �������� � ����������.
import global.Input_value_int;

public class Task_seven {

	public static void main(String[] args) {
		Input_value_int value = new Input_value_int();
		int m = 0;
		int n = 0;
		int number = 0;
		int div = 0;
		System.out.print("m=");
		m = Input_value_int.Input_value(m);
		System.out.print("n=");
		n = Input_value_int.Input_value(n);
		number = m;
		while ((number >= m) & (number <= n)) {
			System.out.print("�������� " + number + ": ");
			for (div = 2; div < (number); div++) {
				if (StrictMath.floorMod(number, div) == 0 & div != n & div != m) {
					System.out.print(div + ", ");
				}
			}
			System.out.println();
			number = number + 1;
		}
	}
}