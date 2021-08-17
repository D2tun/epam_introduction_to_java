package by.minsk.epam.jio.taskFive;

public class Counter {

	private int numberOfRadix;
	private int initialValue;
	private int maxValue;
	private int currentValue;
	
	public Counter() {
		this.numberOfRadix = 1;
		this.maxValue = (int) StrictMath.round(StrictMath
				.pow(10, this.numberOfRadix)) - 1;
		if (initialValue > this.maxValue) {
			initialValue = this.maxValue;
		}
		if (initialValue < 0) {
			initialValue = 0;
		}
		this.initialValue = 0;
		this.currentValue = initialValue;
	}
	
	public Counter(int numberOfRadix, int initialValue) {
		this.numberOfRadix = numberOfRadix;
		this.maxValue = (int) StrictMath.round(StrictMath
				.pow(10, this.numberOfRadix)) - 1;
		if (initialValue > this.maxValue) {
			initialValue = this.maxValue;
		}
		if (initialValue < 0) {
			initialValue = 0;
		}
		this.initialValue = initialValue;
		this.currentValue = initialValue;
	}
	
	public void incrementing() {
		this.currentValue++;
		if (this.currentValue > this.maxValue) {
			this.currentValue = this.maxValue;
		}
	}
	
	public void decrementing() {
		this.currentValue--;
		if (this.currentValue < 0) {
			this.currentValue = 0;
		}
	}
	
	public String getCounterState() {
		return "Текущее значение счёта: " + this.currentValue;
	}
}
