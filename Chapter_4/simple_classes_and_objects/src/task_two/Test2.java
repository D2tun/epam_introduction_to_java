package task_two;

/* Создайте класс Test2 двумя переменными. Добавьте конструктор с входными пераметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса. */

public class Test2 {

	private double num1;
	private double num2;

	public Test2() {

		num1 = 0;
		num2 = 0;
	}

	public Test2(double num1, double num2) {

		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void set_num1(double num1) {
		this.num1 = num1;
	}

	public void set_num2(double num2) {
		this.num2 = num2;
	}

	public double get_num1() {
		return this.num1;
	}

	public double get_num2() {
		return this.num2;
	}

}
