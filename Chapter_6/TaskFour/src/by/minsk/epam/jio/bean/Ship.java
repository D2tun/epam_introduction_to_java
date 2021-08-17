package by.minsk.epam.jio.bean;

public class Ship implements Runnable {

	private int cargoLimit;
	private int currentCargo;
	private int containersToLeave;
	private int containersToTake;
	private int dockingTime;
	private Port port;
	
	public Ship(Port port) {
		this.port = port;
		this.cargoLimit = (int) StrictMath.round(StrictMath.random() * 200) 
						  + 11;
		int currentCargo = (int) StrictMath.round(StrictMath.random() * 200) 
						  + 11;
		if (currentCargo > this.cargoLimit) {
			this.currentCargo = this.cargoLimit;
		} else {
			this.currentCargo = currentCargo;
		}
		int containersToLeave = (int) StrictMath.round(StrictMath.random() 
													   * 200) + 11;
		if (containersToLeave > this.currentCargo) {
			containersToLeave = this.currentCargo;
		} else {
			if (containersToLeave < 0) {
				this.containersToLeave = 0;
			} else {
				this.containersToLeave = containersToLeave;
			}
		}
		int containersToTake = (int) StrictMath.round(StrictMath.random() 
													 * 200) + 11;
		if (this.currentCargo + containersToTake > this.cargoLimit) {
			this.containersToTake = this.cargoLimit - this.currentCargo 
									+ this.containersToLeave ;
		} else {
			if (this.containersToTake < 0) {
				this.containersToTake = 0;
			} else {
				this.containersToTake = containersToTake;
			}
		}
		if (this.containersToLeave > this.containersToTake) {
			this.dockingTime = this.containersToLeave * 50;
		} else {
			this.dockingTime = this.containersToTake * 50;
		}
	}
	
	@Override
	public String toString() {
		return "корабль грузоподъёмностью " + this.cargoLimit 
				+ ", текущий груз " + this.currentCargo
				+ " контейнеров, контейнеров к изъятию " 
				+ this.containersToTake + ", контейнеров к выдаче " 
				+ this.containersToLeave; 
	}
	
	@Override
	public void run() {
		Ship ship = new Ship(this.port);
		try {
			port.getDocks().acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Прибыл " + ship.toString());
		if (port.getContainersInPort() < 0) {
			System.out.println("Недостаточно контйнеров для загрузки, отбыл " 
							   + ship.toString());
			port.getDocks().release();
		} else {
			try {
				Thread.sleep(this.dockingTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			port.setContainersInPort(port.getContainersInPort() 
										- ship.containersToTake 
										+ ship.containersToLeave);
			System.out.println("Отбыл " + ship.toString());
			port.getDocks().release();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargoLimit;
		result = prime * result + containersToLeave;
		result = prime * result + containersToTake;
		result = prime * result + currentCargo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ship other = (Ship) obj;
		if (cargoLimit != other.cargoLimit)
			return false;
		if (containersToLeave != other.containersToLeave)
			return false;
		if (containersToTake != other.containersToTake)
			return false;
		if (currentCargo != other.currentCargo)
			return false;
		return true;
	}
}
