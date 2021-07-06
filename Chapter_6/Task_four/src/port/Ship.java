package port;

public class Ship implements Runnable {

	private int cargo_limit;
	private int current_cargo;
	private int containers_to_leave;
	private int containers_to_take;
	private int docking_time;
	private Port port;
	
	public Ship(Port port) {
		this.port = port;
		this.cargo_limit = (int) StrictMath.round(StrictMath.random() * 200) + 11;
		int current_cargo = (int) StrictMath.round(StrictMath.random() * 200) + 11;
		if (current_cargo > this.cargo_limit) {
			this.current_cargo = this.cargo_limit;
		} else {
			this.current_cargo = current_cargo;
		}
		int containers_to_leave = (int) StrictMath.round(StrictMath.random() * 200) + 11;
		if (containers_to_leave > this.current_cargo) {
			containers_to_leave = this.current_cargo;
		} else {
			if (containers_to_leave < 0) {
				this.containers_to_leave = 0;
			} else {
				this.containers_to_leave = containers_to_leave;
			}
		}
		int containers_to_take = (int) StrictMath.round(StrictMath.random() * 200) + 11;
		if (this.current_cargo + containers_to_take > this.cargo_limit) {
			this.containers_to_take = this.cargo_limit - this.current_cargo + this.containers_to_leave ;
		} else {
			if (this.containers_to_take < 0) {
				this.containers_to_take = 0;
			} else {
				this.containers_to_take = containers_to_take;
			}
		}
		if (this.containers_to_leave > this.containers_to_take) {
			this.docking_time = this.containers_to_leave * 50;
		} else {
			this.docking_time = this.containers_to_take * 50;
		}
	}
	
	@Override
	public String toString() {
		return "корабль грузоподъёмностью " + this.cargo_limit + ", текущий груз " + this.current_cargo + " контейнеров, контейнеров к изъятию " + this.containers_to_take + ", контейнеров к выдаче " + this.containers_to_leave; 
	}
	
	@Override
	public void run() {
		Ship ship = new Ship(this.port);
		try {
			port.get_docks().acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Прибыл " + ship.toString());
		if (port.get_containers_in_port() < 0) {
			System.out.println("Недостаточно контйнеров для загрузки, отбыл " + ship.toString());
			port.get_docks().release();
		} else {
			try {
				Thread.sleep(this.docking_time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			port.set_containers_in_port(port.get_containers_in_port() - ship.containers_to_take + ship.containers_to_leave);
			System.out.println("Отбыл " + ship.toString());
			port.get_docks().release();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargo_limit;
		result = prime * result + containers_to_leave;
		result = prime * result + containers_to_take;
		result = prime * result + current_cargo;
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
		if (cargo_limit != other.cargo_limit)
			return false;
		if (containers_to_leave != other.containers_to_leave)
			return false;
		if (containers_to_take != other.containers_to_take)
			return false;
		if (current_cargo != other.current_cargo)
			return false;
		return true;
	}

	
}
