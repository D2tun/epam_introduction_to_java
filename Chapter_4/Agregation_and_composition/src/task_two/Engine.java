package task_two;

public class Engine {
	
	private boolean engine_broken = false;
	
	public void change_engine_state(boolean tf) {
		this.engine_broken = tf;
	}
	
	public boolean engine_state() {
		return this.engine_broken;
	}

}
