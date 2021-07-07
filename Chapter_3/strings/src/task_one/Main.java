package task_one;

// Дан массив переменных в camelCase. Преобразовать названия в snake_case.

public class Main {

	public static void main(String[] args) {

		String[] a = { "camelCase", "snakeCase", "camelSnake" };
		String[] b = { "", "", "" };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			char[] ch = a[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (Character.isUpperCase(ch[j])) {
					b[i] += "_" + Character.toLowerCase(ch[j]);
				} else {
					b[i] += ch[j];
				}
			}
			System.out.println(b[i]);
		}

	}

}
