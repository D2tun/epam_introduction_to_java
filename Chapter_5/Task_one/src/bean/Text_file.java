package bean;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Text_file extends File {

	private String content = "";
	private String full_name;

	public Text_file(String name, String path) {
		super(name, path);
		this.full_name = super.get_name() + ".txt";
	}

	@Override
	public void create_file() {
		Path path = Path.of(super.get_directory().get_directory() + this.full_name);
		try {
			Files.createFile(path);
		} catch (IOException e) {
			System.out.println("Файл с таким именем уже существует.");
		}
	}

	@Override
	public void rename(String new_name) {
		Path path = Path.of(super.get_directory().get_directory() + this.full_name);
		try {
			this.full_name = new_name + ".txt";
			Path new_path = Path.of(super.get_directory().get_directory() + this.full_name);
			Files.move(path, new_path);
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}

	}

	@Override
	public void show_content() {
		Path path = Path.of(super.get_directory().get_directory() + this.full_name);
		try {
			System.out.print(Files.readString(path));
		} catch (IOException e) {
			System.out.println("Файл не найден.");
		}
	}

	@Override
	public void add_content() {
		Scanner sc = new Scanner(System.in);
		Path path = Path.of(super.get_directory().get_directory() + this.full_name);
		try (BufferedWriter a = new BufferedWriter(new FileWriter(path.toString()))) {
			this.content += sc.nextLine();
			a.write(this.content);
		} catch (IOException e) {
			System.out.println("Ôàéë íå íàéäåí.");
		}
		sc.close();

	}

	@Override
	public void delete() {
		Path path = Path.of(super.get_directory().get_directory() + this.full_name);
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
		Text_file other = (Text_file) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

}
