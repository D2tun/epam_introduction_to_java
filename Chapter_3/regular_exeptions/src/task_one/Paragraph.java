package task_one;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Paragraph {

	public static String sort_by_number_of_sentences(String text) {

		Pattern a = Pattern.compile("\\W\\t");

		String[] M = a.split(text);

		int sequence = 0;
		System.out.print("Введите порядок сортировки абзацев (по возрастанию - 1/по убыванию - 2) ");
		sequence = StrictMath.abs(Input_value_int.Input_value(sequence));
		
		Pattern sentence = Pattern.compile("\s*[.|!|?|...]\s");

		boolean iteration = true;

		int[] count = new int[M.length];

		for (int i = 0; i < M.length; i++) {
			Matcher c = sentence.matcher(M[i]);
			while (c.find()) {
				count[i]++;
			}
		}

		String res = "";

		if (sequence == 1) {
			while (iteration) {
				iteration = false;
				for (int i = 1; i < M.length; i++) {
					if (count[i - 1] > count[i]) {
						iteration = true;
						String buff = M[i];
						int tmp = count[i];
						M[i] = M[i - 1];
						count[i] = count[i - 1];
						M[i - 1] = buff;
						count[i - 1] = tmp;
					}
				}
			}

			for (int i = 0; i < M.length; i++) {
				res += M[i];
			}

		} else {

			if (sequence == 2) {
				while (iteration) {
					iteration = false;
					for (int i = 1; i < M.length; i++) {
						if (count[i - 1] < count[i]) {
							iteration = true;
							String buff = M[i - 1];
							int tmp = count[i - 1];
							M[i - 1] = M[i];
							count[i - 1] = count[i];
							M[i] = buff;
							count[i] = tmp;
						}
					}
				}

				for (int i = 0; i < M.length; i++) {
					res += M[i];
				}
				
			} else {
				res = "Ошибка ввода. Перезапустите программу.";
			}
		}

		return res;
	}

}
