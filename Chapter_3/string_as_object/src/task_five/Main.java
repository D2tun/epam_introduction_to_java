package task_five;

// ����������, ������� ��� ����� �������� �������� ������ ����������� ����� "a".

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������.");
		String enter = sc.next();

		int count = 0;
		for (int i = 0; i < enter.length(); i++) {
			if (enter.charAt(i) == 'a' | enter.charAt(i) == '�') {
				count++;
			}
		}
		System.out.println("����� 'a' ����������� " + count + " ���.");
	}

}
