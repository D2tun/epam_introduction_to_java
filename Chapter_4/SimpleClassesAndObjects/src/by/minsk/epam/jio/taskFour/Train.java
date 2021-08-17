package by.minsk.epam.jio.taskFour;

public class Train {

	private String destination = "";
	private int trainNumber = 0;
	private String startTime = "";

	public Train(String destination, int trainNumber, String startTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.startTime = startTime;
	}

	public static String getTrainInfo(Train[] trains, int trainNumber) {
		String res = "";
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumber() == trainNumber) {
				res = "Поезд № " + trainNumber + ", место назначения: " 
					  + trains[i].getDestination() + ", время отправления: "
					  + trains[i].getStartTime() + ".";
				break;
			} 			
		}
		if (res.isEmpty()) {
			res = "Поезда с таким номером нет.";
		}
		return res;
	}

	public int getNumber() {
		return this.trainNumber;
	}

	public String getDestination() {
		return this.destination;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public static Train[] sortByNumber(Train[] trains) {

		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trains.length; i++) {
				if (trains[i].getNumber() < trains[i - 1].getNumber()) {
					Train temp = trains[i - 1];
					trains[i - 1] = trains[i];
					trains[i] = temp;
					iteration = true;
				}
			}
		}
		return trains;
	}

	public static Train[] sortByDestination(Train[] trains) {

		boolean iteration = true;
		while (iteration) {
			iteration = false;
			for (int i = 1; i < trains.length; i++) {
				String n1 = trains[i - 1].getDestination();
				String n2 = trains[i].getDestination();
				if (n1.compareTo(n2) > 0) {
					Train temp = trains[i - 1];
					trains[i - 1] = trains[i];
					trains[i] = temp;
					iteration = true;
				} else {
					String nn1 = trains[i - 1].getStartTime();
					String nn2 = trains[i].getStartTime();
					if ((n1.compareTo(n2) == 0) & (nn1.compareTo(nn2) > 0)) {
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
