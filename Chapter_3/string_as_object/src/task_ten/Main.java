package task_ten;

/* ������ � ������� �� ���������� �����������, ������ �� ������� ��������� ������, ���������������
��� �������������� ������. ���������� ���������� ����������� � ������ �. */

public class Main {

	public static void main(String[] args) {
		
		String X = "������ ����������. ������ �����������? ������ �����������!";
		
		int counter = 0;
		
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i) == '.' | X.charAt(i) == '!' | X.charAt(i) == '?') {
				counter++;
			}
		}

		System.out.println("����������� � ������: " + counter);
		
	}

}
