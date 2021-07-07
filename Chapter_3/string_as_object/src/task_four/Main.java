package task_four;

// С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".

public class Main {

	public static void main(String[] args) {

		String unchanged = "информатика";
		System.out.println(unchanged);

		String change1 = String.valueOf(unchanged.charAt(7));
		char[] change = new char[2];
		unchanged.getChars(3, 5, change, 0);
		String change2 = String.copyValueOf(change, 0, 2);

		String changed = change1.concat(change2) + change1;
		System.out.println(changed);
	}

}
