package task_seven;

/* ������� �����, �������������� �����������. ������������� ������  ��� �������� ��������, ����������
�������, ��������� � ����� ����������� ������. */

public class Main {

	public static void main(String[] args) {
		
		Triangle a = new Triangle(0, 0, 5, 2, 3, 3);
		System.out.println("�������� ������������: " + a.get_perimeter());
		System.out.println("������� ������������: " + a.get_area());
		System.out.println("���������� ����� ����������� ������a�: x = " + a.get_median_crossing()[0] + "; y = " + a.get_median_crossing()[1]);
	}

}
