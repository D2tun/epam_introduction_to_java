package task_one;

public class Sentence {
	
	private String sentence = ""; 
	
	public void add_word(Word word) {
		
		this.sentence += word.toString() + " ";
	}

	public String toString() {
	
		this.sentence += ".";
		return this.sentence;
	}
}
