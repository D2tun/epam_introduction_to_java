package task_nine;

/* ��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������. ���������
������ ���������� �����. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������.");
		String G = sc.nextLine();
		
		int counter_b = 0;
		int counter_s = 0;
		
		for (int i = 0; i < G.length(); i++) {
			if (G.charAt(i) >= 'A' & G.charAt(i) <= 'Z') {
				counter_b++;
			}
			if (G.charAt(i) >= 'a' & G.charAt(i) <= 'z') {
				counter_s++;
			}
		}
		
		System.out.println("� ������ ���������� ��������� ���� " + counter_b + ", �������� ���� " + counter_s + ".");

	}

}
