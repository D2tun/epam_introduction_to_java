package port;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Port {

		private int port_capacity;
		private volatile int containers_in_port;
		private Semaphore docks;
	
		public Port(int docks_number) {
			this.port_capacity = (int)StrictMath.round(StrictMath.random() * 5000) + 201;
			this.containers_in_port = (int)StrictMath.round(StrictMath.random() * 5000) + 201;
			if (this.containers_in_port > this.port_capacity) {
				this.containers_in_port = this.port_capacity;
			}
			this.docks = new Semaphore(docks_number, true);
		}
		
		public Port(int port_capacity, int containers_in_port, int docks_number) {
			this.port_capacity = port_capacity;
			this.containers_in_port = containers_in_port;
			if (this.containers_in_port > this.port_capacity) {
				this.containers_in_port = this.port_capacity;
			}
			this.docks = new Semaphore(docks_number, true);
		}
		
		public int get_port_capacity() {
			return this.port_capacity;
		}
		
		public int get_containers_in_port() {
			return this.containers_in_port;
		}
		
		public void set_containers_in_port(int containers_in_port) {
			if (containers_in_port > this.port_capacity) {
				containers_in_port = this.port_capacity;
			}
			this.containers_in_port = containers_in_port;
		}
		
		public Semaphore get_docks() {
			return this.docks;
		}
	
}
