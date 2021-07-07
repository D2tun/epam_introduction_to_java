package task_two;

public class Wheels {

	private boolean forward_right_wheel_broken = false;
	private boolean forward_left_wheel_broken = false;
	private boolean backward_right_wheel_broken = false;
	private boolean backward_left_wheel_broken = false;


	public boolean forward_right_wheel_state() {
		return this.forward_right_wheel_broken;
	}

	public void change_forward_right_wheel_state(boolean tf) {
		this.forward_right_wheel_broken = tf;
	}

	public boolean forward_left_wheel_state() {
		return this.forward_left_wheel_broken;
	}

	public void change_forward_left_wheel_state(boolean tf) {
		this.forward_left_wheel_broken = tf;
	}

	public boolean backward_right_wheel_state() {
		return this.backward_right_wheel_broken;
	}

	public void change_backward_right_wheel_state(boolean tf) {
		this.backward_right_wheel_broken = tf;
	}

	public boolean backward_left_wheel_state() {
		return this.backward_left_wheel_broken;
	}

	public void change_backward_left_wheel_state(boolean tf) {
		this.backward_left_wheel_broken = tf;
	}
}
