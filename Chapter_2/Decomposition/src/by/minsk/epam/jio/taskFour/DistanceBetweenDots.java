package by.minsk.epam.jio.taskFour;

public class DistanceBetweenDots {

	public static double calculate(double x1, double y1, double x2, double y2) {

		double distance;
		double xDif;
		double yDif;

		if (x1 >= x2) {
			xDif = x1 - x2;
		} else {
			xDif = x2 - x1;
		}

		if (y1 >= y2) {
			yDif = y1 - y2;
		} else {
			yDif = y2 - y1;
		}

		distance = StrictMath.sqrt(StrictMath.pow(xDif, 2) 
				   + StrictMath.pow(yDif, 2));

		return distance;
	}
}
