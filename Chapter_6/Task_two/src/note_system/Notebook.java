package note_system;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;

public class Notebook {

	private String content = "";
	private String[][] notebook = new String[this.content.split("`{2}").length][4];
	private String path;
	private static Scanner sc = new Scanner(System.in);

	private Notebook(String path) {
		if (path.endsWith("\\")) {
			this.path = path;
		} else {
			this.path = path + "\\";
		}
		try {
			if (!Files.exists(Paths.get(this.path + "Notes.txt"))) {
				Files.createDirectories(Paths.get(this.path));
				Files.createFile(Paths.get(this.path + "Notes.txt"));
				this.content = Files.readString(Paths.get(this.path + "Notes.txt"));
			} else {
				this.content = Files.readString(Paths.get(this.path + "Notes.txt"));
			}
		} catch (IOException e) {
			try {
				Files.createDirectories(Paths.get(this.path));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static Notebook create_notebook() {
		Pattern p = Pattern.compile("([A-Za-z]:){1}(\\\\{1}[^|?/:\"<>*]*\\\\?)*");
		boolean check_path = false;
		System.out.println("Введите путь к заметкам.");
		String path = "";
		Notebook new_notebook = null;
		while (check_path == false) {
			path = sc.nextLine();
			Matcher m = p.matcher(path);
			if (m.matches() == false) {
				System.out.println("Неверный путь, повторите ввод.");
			} else {
				check_path = true;
			}
		}
		if (check_path == true) {
			new_notebook = new Notebook(path);
		}
		return new_notebook;
	}

	public void add_note() {
		System.out.println("Введите тему заметки.");
		String topic = sc.nextLine();
		System.out.println("Введите e-mail.");
		Pattern email = Pattern.compile("\\w+@{1}\\w+\\.{1}\\w+");
		String e_mail = "";
		while (true) {
			e_mail = sc.nextLine();
			if (email.matcher(e_mail).matches()) {
				break;
			} else {
				System.out.println("Неверная электронная почта, повторите ввод.");
			}
		}
		System.out.println("Введите текст заметки.");
		String content = sc.nextLine();
		Note note = new Note(topic, e_mail, content);
		this.content += note.toString();
		try {
			Files.writeString(Paths.get(this.path + "Notes.txt"), this.content);
		} catch (IOException e) {
			try {
				Files.createDirectories(Paths.get(this.path));
				Files.createFile(Paths.get(this.path + "Notes.txt"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void close() {
		try {
			Files.writeString(Paths.get(this.path + "Notes.txt"), content);
		} catch (IOException e) {
			try {
				Files.createDirectories(Paths.get(this.path));
				Files.createFile(Paths.get(this.path + "Notes.txt"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		sc.close();
		System.exit(0);
	}

	private void sort_notes() {
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < this.notebook.length; i++) {
				if (this.notebook[i][0].compareTo(this.notebook[i - 1][0]) < 0) {
					for (int j = 0; j < 4; j++) {
						String temp = this.notebook[i][j];
						this.notebook[i][j] = this.notebook[i - 1][j];
						this.notebook[i - 1][j] = temp;
					}
					iteration = true;
				} else {
					if (this.notebook[i][1].compareTo(this.notebook[i - 1][1]) < 0
							& this.notebook[i][0].compareTo(this.notebook[i - 1][0]) == 0) {
						for (int j = 0; j < 4; j++) {
							String temp = this.notebook[i][j];
							this.notebook[i][j] = this.notebook[i - 1][j];
							this.notebook[i - 1][j] = temp;
						}
						iteration = true;
					}
				}
			}
		}
	}

	public void find_notes_by_parameters() {
		System.out.println("Введите тему (если параметр не важен, оставьте строку пустой).");
		String topic = sc.nextLine();
		if (topic.isBlank()) {
			topic = "";
		}
		System.out.println("Введите дату в формате дд.мм.гггг (если параметр не важен, оставьте строку пустой).");
		Pattern check_date = Pattern.compile("(0[1-9]|[10-31])\\.(0[1-9]|1[012])\\.{1}(\\d{4})");
		boolean correct = false;
		String date = "";
		while (correct == false) {
			date = sc.nextLine();
			if (date.isBlank()) {
				date = "";
				correct = true;
				continue;
			}
			if (check_date.matcher(date).matches()) {
				correct = true;
				String[] c = date.split("\\.");
				if ((c[1].contentEquals("01") | c[1].contentEquals("03") | c[1].contentEquals("05")
						| c[1].contentEquals("07") | c[1].contentEquals("08") | c[1].contentEquals("10")
						| c[1].contentEquals("12")) & c[0].compareTo("31") > 0) {
					correct = false;
				}
				if (c[1].contentEquals("02") & c[0].compareTo("29") > 0) {
					correct = false;
				}
				if ((c[1].contentEquals("04") | c[1].contentEquals("06") | c[1].contentEquals("09")
						| c[1].contentEquals("11")) & c[0].compareTo("30") > 0) {
					correct = false;
				}
			}
			if (correct == false) {
				System.out.println("Неверные данные, повторте ввод.");
			}
		}
		System.out.println("Введите e-mail (если параметр не важен, оставьте строку пустой).");
		Pattern check_email = Pattern.compile("\\w+@{1}\\w+\\.{1}\\w+");
		correct = false;
		String email = "";
		while (correct == false) {
			email = sc.nextLine();
			if (email.isBlank()) {
				email = "";
				correct = true;
			} else {
				if (check_email.matcher(email).matches()) {
					correct = true;
				} else {
					System.out.println("Неверный формат e-mail, повторите ввод.");
				}
			}
		}
		System.out.println("Введите фрагмент текста заметки (если параметр не важен, оставьте строку пустой).");
		String text_fragment = sc.nextLine();
		if (text_fragment.isBlank()) {
			text_fragment = "";
		}
		String[] g_content = this.content.split("`{2}");
		this.notebook = new String[g_content.length][4];
		for (int i = 0; i < g_content.length; i++) {
			String[] cont = g_content[i].split("`");
			this.notebook[i][0] = cont[0];
			this.notebook[i][1] = cont[1];
			this.notebook[i][2] = cont[2];
			this.notebook[i][3] = cont[3];
		}
		this.sort_notes();
		for (int i = 0; i < this.notebook.length; i++) {
			if ((this.notebook[i][0].contentEquals(topic) | topic.isEmpty())
					& (this.notebook[i][1].contentEquals(date) | date.isEmpty())
					& (this.notebook[i][2].contentEquals(email) | email.isEmpty())
					& (this.notebook[i][3].contains(text_fragment) | text_fragment.isEmpty())) {
				for (int j = 0; j < 4; j++) {
					System.out.println(this.notebook[i][j]);
				}
			}
		}
	}

	public void show_all_notes() {
		try {
			this.content = Files.readString(Paths.get(this.path + "Notes.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] g_content = this.content.split("`{2}");
		this.notebook = new String[g_content.length][4];
		for (int i = 0; i < g_content.length; i++) {
			String[] cont = g_content[i].split("`");
			this.notebook[i][0] = cont[0];
			this.notebook[i][1] = cont[1];
			this.notebook[i][2] = cont[2];
			this.notebook[i][3] = cont[3];
		}
		for (int i = 0; i < this.notebook.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(this.notebook[i][j]);
				if (j == 3) {
					System.out.println();
				}
			}
		}
	}

}
