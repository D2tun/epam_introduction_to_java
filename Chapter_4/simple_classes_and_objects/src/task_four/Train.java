package task_four;


public class Train {

	private String destination = "";
	private int train_number = 0;
	private String start_time = "";

	public Train(String destination, int train_number, String start_time) {
		super();
		this.destination = destination;
		this.train_number = train_number;
		this.start_time = start_time;
	}

	public static String get_train_info(Train[] trains, int train_number) {
		String res = "";
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].get_number() == train_number) {
				res = "Поезд №" + train_number + ", место назначения: " + trains[i].get_destination()
						+ ",  время отправления: " + trains[i].get_start_time() + ".";
				break;
			} 			
		}
		if (res.isEmpty()) {
			res = "Поезда с таким номером нет.";
		}
		return res;
	}

	public int get_number() {
		return this.train_number;
	}

	public String get_destination() {
		return this.destination;
	}

	public String get_start_time() {
		return this.start_time;
	}

	public static Train[] sort_by_number(Train[] trains) {

		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trains.length; i++) {
				if (trains[i].get_number() < trains[i - 1].get_number()) {
					Train temp = trains[i - 1];
					trains[i - 1] = trains[i];
					trains[i] = temp;
					iteration = true;
				}
			}
		}
		return trains;
	}

	public static Train[] sort_by_destination(Train[] trains) {

		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trains.length; i++) {
				String n1 = trains[i - 1].get_destination();
				String n2 = trains[i].get_destination();
				if (n1.compareTo(n2) > 0) {
					Train temp = trains[i - 1];
					trains[i - 1] = trains[i];
					trains[i] = temp;
					iteration = true;
				} else {
					String nn1 = trains[i - 1].get_start_time();
					String nn2 = trains[i].get_start_time();
					if (n1.compareTo(n2) == 0 & nn1.compareTo(nn2) > 0 ) {
						Train temp = trains[i - 1];
						trains[i - 1] = trains[i];
						trains[i] = temp;
						iteration = true;
					}
				}
			}
		}
		return trains;
	}
	
	
}
