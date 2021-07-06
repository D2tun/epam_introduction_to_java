package note_system;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Note {

	private String topic;
	private String e_mail;
	private String content;
	private String creation_date;

	protected Note(String topic, String e_mail, String content) {
		this.topic = topic;
		this.content = content;
		this.e_mail = e_mail;
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
		this.creation_date = s.format(d);
	}

	@Override
	public String toString() {
		return this.topic + "`" + this.creation_date + "`" + this.e_mail + "`" + this.content + "``";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((creation_date == null) ? 0 : creation_date.hashCode());
		result = prime * result + ((e_mail == null) ? 0 : e_mail.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		Note other = (Note) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (creation_date == null) {
			if (other.creation_date != null)
				return false;
		} else if (!creation_date.equals(other.creation_date))
			return false;
		if (e_mail == null) {
			if (other.e_mail != null)
				return false;
		} else if (!e_mail.equals(other.e_mail))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

}
