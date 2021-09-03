/* 
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер 
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти 
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп 
 * студентов, имеющих оценки, равные только 9 или 10.
 */

package by.minsk.epam.jio.taskThree;

public class Main {

	public static void main(String[] args) {

		Student[] Students = new Student[10];
		Students[0] = new Student("Петров", "И.В.", 10475);
		Students[1] = new Student("Костелло", "В.В.", 10476);
		Students[2] = new Student("Александрова", "Т.К.", 10485);
		Students[3] = new Student("Савицкий", "И.Г.", 10486);
		Students[4] = new Student("Холод", "А.К.", 10475);
		Students[5] = new Student("Козлов", "И.Р.", 10485);
		Students[6] = new Student("Легуш", "П.П.", 10476);
		Students[7] = new Student("Свиридова", "А.П.", 10486);
		Students[8] = new Student("Кудасов", "И.И.", 10475);
		Students[9] = new Student("Васильев", "А.С.", 10486);

		System.out.println("Список студентовов:");
		for (int i = 0; i < 10; i++) {
			String marks = "";
			int[] m = Students[i].getAcademicPerformance();
			for (int j = 0; j < m.length; j++) {
				marks += m[j] + " ";
			}
			System.out.println(Students[i].getName() + " " 
					  + Students[i].getGroup() + " " + marks);
		}

		System.out.println("Список отличников:");
		for (int i = 0; i < 10; i++) {
			boolean check = true;
			String marks = "";
			int[] m = Students[i].getAcademicPerformance();
			for (int j = 0; j < m.length; j++) {
				if (m[j] < 9) {
					check = false;
					break;
				}
				marks += m[j] + " ";
			}
			if (check) {
				System.out.println(Students[i].getName() + " " 
						  + Students[i].getGroup() + " " + marks);
			}
		}
	}
}
