package by.minsk.epam.jio.taskTwo;

public class Engine {
	
	private boolean engine_broken = false;
	
	public Engine() {
		
	}
	
	public void changeEngineState(boolean tf) {
		this.engine_broken = tf;
	}
	
	public boolean getEngineState() {
		return this.engine_broken;
	}
}
