package task_five;

public class Counter {

	private int number_of_radix;
	private int initial_value;
	private int max_value;
	private int current_value;
	
	public Counter() {
		super();
		this.number_of_radix = 1;
		this.max_value = (int) StrictMath.round(StrictMath.pow(10, this.number_of_radix)) - 1;
		if (initial_value > this.max_value) {
			initial_value = this.max_value;
		}
		if (initial_value < 0) {
			initial_value = 0;
		}
		this.initial_value = 0;
		this.current_value = initial_value;
	}
	
	public Counter(int number_of_radix, int initial_value) {
		super();
		this.number_of_radix = number_of_radix;
		this.max_value = (int) StrictMath.round(StrictMath.pow(10, this.number_of_radix)) - 1;
		if (initial_value > this.max_value) {
			initial_value = this.max_value;
		}
		if (initial_value < 0) {
			initial_value = 0;
		}
		this.initial_value = initial_value;
		this.current_value = initial_value;
	}
	
	public void increment() {
		this.current_value++;
		if (this.current_value > this.max_value) {
			this.current_value = this.max_value;
		}
	}
	
	public void decrement() {
		this.current_value--;
		if (this.current_value < 0) {
			this.current_value = 0;
		}
	}
	
	public String get_counter_state() {
		return "Текущее значение счёта: " + this.current_value;
	}

}
