package task_five;

/* Удалить в строке все лишние пробелы, то есть сери подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить. */

public class Main {

	public static void main(String[] args) {

		String s = "   eshgwo; seh    qiwehg     qehqe  qeph eqpoqo[  rrr         rqo";
		System.out.println(s);
		String q = "";

		for (int i = 0; i < s.length() - 1; i++) {
			if (Character.isSpaceChar(s.charAt(i)) & Character.isSpaceChar(s.charAt(i + 1))) {
				q += "";
			} else {
				if (Character.isSpaceChar(s.charAt(i)) & !Character.isSpaceChar(s.charAt(i + 1))) {
					q += " ";
				} else {
					if (i == s.length() - 1) {
						q += s.charAt(i) + s.charAt(i + 1);
					} else {
						q += s.charAt(i);
					}
				}
			}
		}

		q = q.trim();
		System.out.println(q);
	}

}
