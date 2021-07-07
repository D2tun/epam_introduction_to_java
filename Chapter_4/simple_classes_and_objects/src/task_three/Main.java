package task_three;

/* �������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������
(������ �� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������
������� � ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10. */

public class Main {

	public static void main(String[] args) {

		Student[] Students = new Student[10];
		Students[0] = new Student("������", "�.�.", 10475);
		Students[1] = new Student("��������", "�.�.", 10476);
		Students[2] = new Student("������������", "�.�.", 10485);
		Students[3] = new Student("��������", "�.�.", 10486);
		Students[4] = new Student("�����", "�.�.", 10475);
		Students[5] = new Student("������", "�.�.", 10485);
		Students[6] = new Student("�����", "�.�.", 10476);
		Students[7] = new Student("���������", "�.�.", 10486);
		Students[8] = new Student("�������", "�.�.", 10475);
		Students[9] = new Student("��������", "�.�.", 10486);

		System.out.println("������ �����������:");
		for (int i = 0; i < 10; i++) {
			boolean check = true;
			String marks = "";
			int[] m = Students[i].get_academic_performance();
			for (int j = 0; j < m.length; j++) {
				marks += m[j] + " ";
			}
			System.out.println(Students[i].get_name() + " " + Students[i].get_group() + " " + marks);
		}

		System.out.println("������ ����������:");
		for (int i = 0; i < 10; i++) {
			boolean check = true;
			String marks = "";
			int[] m = Students[i].get_academic_performance();
			for (int j = 0; j < m.length; j++) {
				if (m[j] < 9) {
					check = false;
					break;
				}
				marks += m[j] + " ";
			}
			if (check) {
				System.out.println(Students[i].get_name() + " " + Students[i].get_group() + " " + marks);
			}
		}
	}

}
