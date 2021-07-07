package task_two;

// Замените в строке все вхождения 'word' на 'letter'.

public class Main {

	public static void main(String[] args) {
		
		String before = "word room point word loom word word Rolf";
		System.out.println("До замены: " + before);
		
		String after = before.replace("word", "letter");
		System.out.println("После замены: " + after);
	}

}
