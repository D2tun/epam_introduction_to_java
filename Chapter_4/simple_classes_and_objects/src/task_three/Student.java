package task_three;

public class Student {

	private String Surname = "";
	private String Initials = "";
	private int number_of_group = 0;
	private int[] marks = new int[5];
	{
		for (int i = 0; i < 5; i++) {
			marks[i] = (int) StrictMath.round(StrictMath.random() * 10) + 1;
		}
	}

	public Student(String Surname, String Initials, int number_of_group) {
		super();
		this.Initials = Initials;
		this.Surname = Surname;
		this.number_of_group = number_of_group;
	}

	public String get_name() {
		return this.Surname + " " + this.Initials;
	}

	public int get_group() {
		return this.number_of_group;
	}

	public int[] get_academic_performance() {
		return this.marks;
	}
}
