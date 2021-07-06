package task_four;

public class Calculate_distance_between {

	public static double dots(double x1, double y1, double x2, double y2) {

		double distance;
		double x_dif;
		double y_dif;

		if (x1 >= x2) {
			x_dif = x1 - x2;
		} else {
			x_dif = x2 - x1;
		}

		if (y1 >= y2) {
			y_dif = y1 - y2;
		} else {
			y_dif = y2 - y1;
		}

		distance = StrictMath.sqrt(StrictMath.pow(x_dif, 2) + StrictMath.pow(y_dif, 2));

		return distance;
	}
}
