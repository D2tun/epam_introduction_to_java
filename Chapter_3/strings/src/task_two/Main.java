package task_two;

// �������� � ������ ��� ��������� 'word' �� 'letter'.

public class Main {

	public static void main(String[] args) {
		
		String before = "word room point word loom word word Rolf";
		System.out.println("�� ������: " + before);
		
		String after = before.replace("word", "letter");
		System.out.println("����� ������: " + after);
	}

}
