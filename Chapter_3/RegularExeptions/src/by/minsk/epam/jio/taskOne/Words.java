package by.minsk.epam.jio.taskOne;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Words {

	public static String sortByLength(String text) {

		Pattern sentence = Pattern.compile("([.{1,3}!?\"])");
		Pattern word = Pattern.compile(",");
		Matcher d = word.matcher(text);
		text = d.replaceAll("");

		String[] sent = sentence.split(text);

		int sequence = 0;
		System.out.print("Введите порядок сортировки слов "
						+ "(по возрастанию - 1/по убыванию - 2) ");
		sequence = StrictMath.abs(ValueInt.inputValue(sequence));

		String res = "";

		switch (sequence) {
		case 1: {
			for (int i = 0; i < sent.length; i++) {
				String[] words = sent[i].split("[ ]");
				boolean iteration = true;
				while (iteration) {
					iteration = false;
					for (int j = 1; j < words.length; j++) {
						if (words[j].length() < words[j - 1].length()) {
							String temp = words[j - 1];
							words[j - 1] = words[j];
							words[j] = temp;
							iteration = true;
						}
					}
				}
				for (int x = 0; x < words.length; x++) {
					res += words[x] + " ";
				}
				res += "\n";

			}
			break;
		}

		case 2: {
			for (int i = 0; i < sent.length; i++) {

				String[] words = sent[i].split("[ ]");
				boolean iteration = true;
				while (iteration) {
					iteration = false;
					for (int j = 1; j < words.length; j++) {
						if (words[j].length() > words[j - 1].length()) {
							String temp = words[j - 1];
							words[j - 1] = words[j];
							words[j] = temp;
							iteration = true;
						}
					}
				}
				for (int x = 0; x < words.length; x++) {
					res += words[x] + " ";
				}
				res += "\n";
			}
			break;
		}
		
		default: {
			res = "Ошибка ввода. Перезапустите программу.";
		}
			break;
		}

		return res;
	}

	public static String sortBySymbol(String text) {

		Scanner sc = new Scanner(System.in);

		String symbol;
		System.out.print("Cимвол для сортировки по убыванию "
						+ "(без учёта регистра): ");
		symbol = sc.nextLine();
		symbol = symbol.trim();
		char[] symbolCheck = symbol.toCharArray();
		char finalSymbol = Character.toLowerCase(symbolCheck[0]);
		if (symbolCheck.length > 1) {
			return "Ошибка ввода. Перезапустите программу.";
		}

		Pattern sentence = Pattern.compile("([.{1,3}!?\"])");
		Pattern word = Pattern.compile(",");
		Matcher d = word.matcher(text);
		text = d.replaceAll("");

		String[] sent = sentence.split(text);

		String res = "";

		for (int i = 0; i < sent.length; i++) {
			String[] words = sent[i].split("[ ]");
			int[] count = new int[words.length];
			for (int j = 0; j < words.length; j++) {
				for (int s = 0; s < words[j].length(); s++) {
					if (finalSymbol == words[j].charAt(s)) {
						count[j]++;
					}
				}
			}

			boolean iteration = true;
			while (iteration) {
				iteration = false;
				for (int j = 1; j < words.length; j++) {
					if (count[j] > count[j - 1]) {
						int temp = count[j - 1];
						count[j - 1] = count[j];
						count[j] = temp;
						String temp2 = words[j - 1];
						words[j - 1] = words[j];
						words[j] = temp2;
						iteration = true;
					}
				}
			}

			for (int j = 0; j < words.length; j++) {
				for (int q = 0; q < words.length; q++) {
					String w1 = words[j].toLowerCase();
					String w2 = words[q].toLowerCase();
					if (count[j] == count[q] & j != q & w1.compareTo(w2) < 0) {
						String temp = words[j];
						words[j] = words[q];
						words[q] = temp;
					}
				}
			}
			
			for (int j = 0; j < words.length; j++) {
				res += words[j] + " ";
			}
			res += "\n";
		}
		
		return res;
	}
}
