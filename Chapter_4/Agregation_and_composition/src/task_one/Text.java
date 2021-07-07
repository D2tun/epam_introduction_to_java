package task_one;

public class Text {
	
	private String text = "";
	private String title;
	
	public void add_sentence(Sentence sentence) {
		this.text += sentence.toString() + "\n";
	}
	
	public void set_title (String title) {
		this.title = title;
	}
	
	public void print_text() {
		System.out.println(this.text);
	}
	
	public void print_title() {
		System.out.println(this.title);
	}

}
