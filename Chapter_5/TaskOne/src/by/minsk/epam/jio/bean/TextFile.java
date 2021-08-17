package by.minsk.epam.jio.bean;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFile extends File {

	private String content = "";
	private String fullName;
	private Directory directory;

	public TextFile(String name, String path) {
		this.fullName = name + ".txt";
		this.directory = new Directory(path);
	}
	
	public TextFile() {
		this.fullName = "";
	}

	@Override
	public void createFile() {
		Path path = Path.of(this.directory.getDirectory()
					+ this.fullName);
		try {
			Files.createFile(path);
		} catch (IOException e) {
			System.out.println("Файл с таким именем уже существует.");
		}
	}

	@Override
	public void rename(String newName) {
		Path path = Path.of(this.directory.getDirectory() 
					+ this.fullName);
		try {
			this.fullName = newName + ".txt";
			Path newPath = Path.of(this.directory.getDirectory() 
									+ this.fullName);
			Files.move(path, newPath);
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}
	}

	@Override
	public String getContent() {
		Path path = Path.of(this.directory.getDirectory() 
							+ this.fullName);
		try {
			this.content = Files.readString(path);
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}
		return this.content;
	}

	@Override
	public void addContent(String content) {
		Path path = Path.of(this.directory.getDirectory()
							+ this.fullName);
		try  {
			this.content = Files.readString(path) + content;
			Files.writeString(path, this.content + "");
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}
	}

	@Override
	public void delete() {
		Path path = Path.of(this.directory.getDirectory() 
							+ this.fullName);
		try {
			Files.delete(path);
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}
}
