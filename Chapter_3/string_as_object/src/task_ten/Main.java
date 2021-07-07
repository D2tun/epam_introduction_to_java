package task_ten;

/* Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
или вопросительным знаком. определить количество предложений в строке Х. */

public class Main {

	public static void main(String[] args) {
		
		String X = "Первое предложние. Второе предложение? Третье предложение!";
		
		int counter = 0;
		
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i) == '.' | X.charAt(i) == '!' | X.charAt(i) == '?') {
				counter++;
			}
		}

		System.out.println("Предложений в строке: " + counter);
		
	}

}
