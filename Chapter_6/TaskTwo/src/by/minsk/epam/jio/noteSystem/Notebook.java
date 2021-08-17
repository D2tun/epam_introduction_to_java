package by.minsk.epam.jio.noteSystem;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;

import by.minsk.epam.jio.bean.Note;

public class Notebook {

	private String content = "";
	private String[][] notebook = new String[this.content
	                                         		.split("`{2}").length][4];
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
				this.content = Files.readString(Paths.get(this.path
														  + "Notes.txt"));
			} else {
				this.content = Files.readString(Paths.get(this.path 
														  + "Notes.txt"));
			}
		} catch (IOException e) {
			try {
				Files.createDirectories(Paths.get(this.path));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static Notebook createNotebook() {
		
		Pattern p = Pattern.compile("([A-Za-z]:){1}(\\\\{1}[^|?/:\"<>*]*\\\\?)*");
		boolean check_path = false;
		System.out.println("Введите путь к заметкам.");
		String path = "";
		Notebook newNotebook = null;
		
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
			newNotebook = new Notebook(path);
		}
		return newNotebook;
	}

	public void addNote() {
		
		System.out.println("Введите тему заметки.");
		String topic = sc.nextLine();
		System.out.println("Введите e-mail.");
		Pattern email = Pattern.compile("\\w+@{1}\\w+\\.{1}\\w+");
		String eMail = "";
		
		while (true) {
			eMail = sc.nextLine();
			if (email.matcher(eMail).matches()) {
				break;
			} else {
				System.out.println("Неверная электронная почта, повторите "
								   + "ввод.");
			}
		}
		
		System.out.println("Введите текст заметки.");
		String content = sc.nextLine();
		Note note = new Note(topic, eMail, content);
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

	private void sortNotes() {
		
		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < this.notebook.length; i++) {
				if (this.notebook[i][0].compareTo(this.notebook[i - 1][0])
						< 0) {
					for (int j = 0; j < 4; j++) {
						String temp = this.notebook[i][j];
						this.notebook[i][j] = this.notebook[i - 1][j];
						this.notebook[i - 1][j] = temp;
					}
					iteration = true;
				} else {
					if ((this.notebook[i][1].compareTo(this.notebook[i - 1][1]) 
							< 0) & (this.notebook[i][0]
									.compareTo(this.notebook[i - 1][0]) == 0)) {
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

	public void findNotesByParameters() {
		
		System.out.println("Введите тему (если параметр не важен, оставьте "
						   + "строку пустой).");
		String topic = sc.nextLine();
		if (topic.isBlank()) {
			topic = "";
		}
		
		System.out.println("Введите дату в формате дд.мм.гггг (если параметр "
						   + "не важен, оставьте строку пустой).");
		Pattern check_date = Pattern.compile("(0[1-9]|[10-31])\\."
											+ "(0[1-9]|1[012])\\.{1}(\\d{4})");
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
				if ((c[1].contentEquals("01") | c[1].contentEquals("03") 
						| c[1].contentEquals("05") | c[1].contentEquals("07") 
						| c[1].contentEquals("08") | c[1].contentEquals("10")
						| c[1].contentEquals("12")) & c[0].compareTo("31") > 0) {
					correct = false;
				}
				if (c[1].contentEquals("02") & c[0].compareTo("29") > 0) {
					correct = false;
				}
				if ((c[1].contentEquals("04") | c[1].contentEquals("06") 
						| c[1].contentEquals("09") | c[1].contentEquals("11")) 
						& c[0].compareTo("30") > 0) {
					correct = false;
				}
			}
			if (correct == false) {
				System.out.println("Неверные данные, повторте ввод.");
			}
		}
		
		System.out.println("Введите e-mail (если параметр не важен, оставьте "
						   + "строку пустой).");
		Pattern checkEmail = Pattern.compile("\\w+@{1}\\w+\\.{1}\\w+");
		correct = false;
		String email = "";
		while (correct == false) {
			email = sc.nextLine();
			if (email.isBlank()) {
				email = "";
				correct = true;
			} else {
				if (checkEmail.matcher(email).matches()) {
					correct = true;
				} else {
					System.out.println("Неверный формат e-mail, повторите "
									   + "ввод.");
				}
			}
		}
		
		System.out.println("Введите фрагмент текста заметки (если параметр не "
						   + "важен, оставьте строку пустой).");
		String textFragment = sc.nextLine();
		if (textFragment.isBlank()) {
			textFragment = "";
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
		
		this.sortNotes();
		
		for (int i = 0; i < this.notebook.length; i++) {
			if ((this.notebook[i][0].contentEquals(topic) | topic.isEmpty())
					& (this.notebook[i][1].contentEquals(date) | date
																	.isEmpty())
					& (this.notebook[i][2].contentEquals(email) | email
																	.isEmpty())
					& (this.notebook[i][3].contains(textFragment) 
							| textFragment.isEmpty())) {
				for (int j = 0; j < 4; j++) {
					System.out.println(this.notebook[i][j]);
				}
			}
		}
	}

	public void showAllNotes() {
		try {
			this.content = Files.readString(Paths.get(this.path 
													  + "Notes.txt"));
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
