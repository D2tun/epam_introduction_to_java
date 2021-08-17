package by.minsk.epam.jio.taskTwo;

public class Wheels {

	private boolean forwardRightWheelBroken = false;
	private boolean forwardLeftWheelBroken = false;
	private boolean backwardRightWheelBroken = false;
	private boolean backwardLeftWheelBroken = false;

	public Wheels() {
		
	}

	public boolean getForwardRightWheelState() {
		return this.forwardRightWheelBroken;
	}

	public void changeForwardRightWheelState(boolean tf) {
		this.forwardRightWheelBroken = tf;
	}

	public boolean getForwardLeftWheelState() {
		return this.forwardLeftWheelBroken;
	}

	public void changeForwardLeftWheelState(boolean tf) {
		this.forwardLeftWheelBroken = tf;
	}

	public boolean getBackwardRightWheelState() {
		return this.backwardRightWheelBroken;
	}

	public void changeBackwardRightWheelState(boolean tf) {
		this.backwardRightWheelBroken = tf;
	}

	public boolean getBackwardLeftWheelState() {
		return this.backwardLeftWheelBroken;
	}

	public void changeBackwardLeftWheelState(boolean tf) {
		this.backwardLeftWheelBroken = tf;
	}
}
