package by.minsk.epam.jio.taskThree;

public class Student {

	private String surname = "";
	private String initials = "";
	private int numberOfGroup = 0;
	private int[] marks = new int[5];
	{
		for (int i = 0; i < 5; i++) {
			marks[i] = (int) StrictMath.round(StrictMath.random() * 10) + 1;
		}
	}

	public Student(String surname, String initials, int numberOfGroup) {
		this.initials = initials;
		this.surname = surname;
		this.numberOfGroup = numberOfGroup;
	}

	public String getName() {
		return this.surname + " " + this.initials;
	}

	public int getGroup() {
		return this.numberOfGroup;
	}

	public int[] getAcademicPerformance() {
		return this.marks;
	}
}
