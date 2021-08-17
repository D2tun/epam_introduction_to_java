package by.minsk.epam.jio.bean;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Port {

		private int portCapacity;
		private volatile int containersInPort;
		private Semaphore docks;
	
		public Port(int docksNumber) {
			this.portCapacity = (int)StrictMath.round(StrictMath.random() 
													  * 5000) + 201;
			this.containersInPort = (int)StrictMath.round(StrictMath.random() 
														  * 5000) + 201;
			if (this.containersInPort > this.portCapacity) {
				this.containersInPort = this.portCapacity;
			}
			this.docks = new Semaphore(docksNumber, true);
		}
		
		public Port(int portCapacity, int containersInPort, 
				int docksNumber) {
			
			this.portCapacity = portCapacity;
			this.containersInPort = containersInPort;
			if (this.containersInPort > this.portCapacity) {
				this.containersInPort = this.portCapacity;
			}
			this.docks = new Semaphore(docksNumber, true);
		}
		
		public int getPortCapacity() {
			return this.portCapacity;
		}
		
		public int getContainersInPort() {
			return this.containersInPort;
		}
		
		public void setContainersInPort(int containersInPort) {
			if (containersInPort > this.portCapacity) {
				containersInPort = this.portCapacity;
			}
			this.containersInPort = containersInPort;
		}
		
		public Semaphore getDocks() {
			return this.docks;
		}
}
