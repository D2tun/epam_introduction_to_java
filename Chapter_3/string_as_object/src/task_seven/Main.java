package task_seven;

/* �������� ������. ��������� ������� �� �� ������������� ������� � ��� �������. ��������, ����
���� ������� "abc cde def", �� ������ ���� �������� "abcdef". */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������.");
		StringBuilder st = new StringBuilder(sc.nextLine());

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == ' ') {
				st.deleteCharAt(i);
			}
		}

		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				if (st.charAt(i) == st.charAt(j)) {
					st.deleteCharAt(j);
				}
			}
		}

		System.out.println(st);
	}

}
