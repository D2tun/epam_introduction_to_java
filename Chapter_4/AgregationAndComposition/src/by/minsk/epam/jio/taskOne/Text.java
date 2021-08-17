package by.minsk.epam.jio.taskOne;

public class Text {
	
	private String text = "";
	private String title;
	
	public Text() {
		this.text = "";
		this.title = "";
	}
	
	public void addSentence(Sentence sentence) {
		this.text += sentence.toString() + "\n";
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void printText() {
		System.out.println(this.text);
	}
	
	public void printTitle() {
		System.out.println("\t" + this.title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
