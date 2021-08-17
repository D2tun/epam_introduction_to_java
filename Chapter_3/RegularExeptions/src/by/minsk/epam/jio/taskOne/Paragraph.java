package by.minsk.epam.jio.taskOne;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Paragraph {

	public static String sortByNumberOfSentences(String text) {

		Pattern paragraph = Pattern.compile("\\W\\t");
		String[] paragraphs = paragraph.split(text);

		int sequence = 0;
		System.out.print("Введите порядок сортировки абзацев"
						+ "(по возрастанию - 1/по убыванию - 2) ");
		sequence = StrictMath.abs(ValueInt.inputValue(sequence));
		
		Pattern sentence = Pattern.compile("\s*[.|!|?|...]\s");

		boolean iteration = true;

		int[] count = new int[paragraphs.length];

		for (int i = 0; i < paragraphs.length; i++) {
			Matcher c = sentence.matcher(paragraphs[i]);
			while (c.find()) {
				count[i]++;
			}
		}

		String res = "";

		if (sequence == 1) {
			while (iteration) {
				iteration = false;
				for (int i = 1; i < paragraphs.length; i++) {
					if (count[i - 1] > count[i]) {
						iteration = true;
						String buff = paragraphs[i];
						int tmp = count[i];
						paragraphs[i] = paragraphs[i - 1];
						count[i] = count[i - 1];
						paragraphs[i - 1] = buff;
						count[i - 1] = tmp;
					}
				}
			}

			for (int i = 0; i < paragraphs.length; i++) {
				res += paragraphs[i];
			}
		} else if (sequence == 2) {
			while (iteration) {
				iteration = false;
				for (int i = 1; i < paragraphs.length; i++) {
					if (count[i - 1] < count[i]) {
						iteration = true;
						String buff = paragraphs[i - 1];
						int tmp = count[i - 1];
						paragraphs[i - 1] = paragraphs[i];
						count[i - 1] = count[i];
						paragraphs[i] = buff;
						count[i] = tmp;
					}
				}
			}

				for (int i = 0; i < paragraphs.length; i++) {
					res += paragraphs[i];
				}	
		} else {
			res = "Ошибка ввода. Перезапустите программу.";
		}
		
		return res;
	}
}
