package task_three;

// ���������, �������� �� �������� ����� �����������.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner W = new Scanner(System.in);
		System.out.println("������� �����.");
		StringBuilder Word = new StringBuilder(W.next());

		boolean P = false;
		for (int i = 0; i < Word.length() / 2; i++) {
			if (Word.charAt(i) != Word.charAt((Word.length()) - 1 - i)) {
				break;
			} else {
				P = true;
			}
		}
		if (P) {
			System.out.println("����� '" + Word + "' �������� �����������.");
		} else {
			System.out.println("����� '" + Word + "' �� �������� �����������.");
		}

	}

}
