package task_eight;

/* �������� ������ ����, ���������� ���������. ����� ����� ������� ����� � ������� ��� �� �����.
������, ����� ���� ������� ���� ����� ���� ���������, �� ������������. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ����� ������.");
		String st = new String(sc.nextLine());

		int L = 0;

		String[] Q = st.split("\s");
		for (int i = 0; i < Q.length; i++) {
			if (L < Q[i].length()) {
				L = Q[i].length();
				st = Q[i];
			}
		}

		System.out.println(st);

	}

}
