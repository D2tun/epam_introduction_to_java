package task_two;

public class Car {

	private Wheels w = new Wheels();
	private Engine e = new Engine();
	private String brand;
	private boolean fueled = true;
	private int crashed_car_part = 0;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public void drive() {
		int crash_chance;
		if (!this.w.forward_left_wheel_state() & !this.w.forward_right_wheel_state()
				& !this.w.backward_left_wheel_state() & !this.w.backward_right_wheel_state() & !this.e.engine_state()
				& this.fueled) {
			crash_chance = (int) StrictMath.round(StrictMath.random() * 100) + 1;
			if (crash_chance == 15) {
				this.crashed_car_part = (int) StrictMath.round(StrictMath.random() * 5) + 1;
				switch (this.crashed_car_part) {
				case 1: {
					this.w.change_forward_left_wheel_state(true);
					System.out.println("������� ��������� ������ ������.");
					break;
				}
				case 2: {
					this.w.change_forward_right_wheel_state(true);
					System.out.println("������� ��������� ������� ������.");
					break;
				}
				case 3: {
					this.w.change_backward_right_wheel_state(true);
					System.out.println("������� ������� ������� ������.");
					break;
				}
				case 4: {
					this.w.change_backward_left_wheel_state(true);
					System.out.println("������� ������� ������ ������.");
					break;
				}
				case 5: {
					this.e.change_engine_state(true);
					System.out.println("������� ���������.");
					break;
				}
				}
			} else {
				System.out.println("������� �������� �������.");
			}
			this.fueled = false;
		} else {
			if (this.fueled = false) {
				System.out.println("��������� ��������.");
			} else {
				System.out.println("��������� ��������� �������.");
			}
		}
	}

	public void fuel_the_car() {
		if (this.fueled = false) {
			this.fueled = true;
			System.out.println("������ ����������.");
		} else {
			System.out.println("������ �� �������� � ��������.");
		}
	}

	public void fix_the_car() {
		switch (this.crashed_car_part) {
		case 1: {
			this.w.change_forward_left_wheel_state(false);
			System.out.println("�������� ����� ������ ��������.");
			break;
		}
		case 2: {
			this.w.change_forward_right_wheel_state(false);
			System.out.println("�������� ������ ������ ��������.");
			break;
		}
		case 3: {
			this.w.change_backward_right_wheel_state(false);
			System.out.println("������ ������ ������ ��������.");
			break;
		}
		case 4: {
			this.w.change_backward_left_wheel_state(false);
			System.out.println("������ ����� ������ ��������.");
			break;
		}
		case 5: {
			this.e.change_engine_state(false);
			System.out.println("��������� ������.");
			break;
		}
		default: {
			System.out.println("������ �� ��������� � �������");
			break;
		}
		}
	}
	
	public void show_car_brand() {
		System.out.println("������ ����� " + this.brand);
	}
}
