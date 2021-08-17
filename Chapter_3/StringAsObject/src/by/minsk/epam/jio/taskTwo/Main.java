package by.minsk.epam.jio.taskTwo;

/*
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Main {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("fqgqgas a wfqwfqagaa aa ");
		
		System.out.println(s);
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				s.insert(i + 1, 'b');
			}
		}

		System.out.println(s);	
	}
}
