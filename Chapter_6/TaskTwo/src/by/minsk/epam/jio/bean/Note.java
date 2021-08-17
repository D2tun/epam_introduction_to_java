package by.minsk.epam.jio.bean;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Note {

	private String topic;
	private String email;
	private String content;
	private String creationDate;

	public Note(String topic, String email, String content) {
		this.topic = topic;
		this.content = content;
		this.email = email;
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
		this.creationDate = s.format(d);
	}

	public Note() {
		this.content = "";
		this.email = "";
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
		this.creationDate = s.format(d);
		this.topic = "";
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getTopic() {
		return this.topic;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getCreationDate() {
		return this.creationDate;
	}
	
	@Override
	public String toString() {
		return this.topic + "`" + this.creationDate + "`" + this.email + "`" 
			   + this.content + "``";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((creationDate == null) ? 0 
														  : creationDate
														  		.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}
}
