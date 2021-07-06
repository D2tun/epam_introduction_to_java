package task_nine;

public class Calculate_area_of_quadrangle {

	public static double any_protuberant (double length1, double length2, double length3, double length4) {
		
		double half_perimeter = (length1 + length2 + length3 + length4) / 2;
		double angle1 = StrictMath.toRadians(90);
		double angle2_1 = StrictMath.atan(length4/length3);
		double angle2_2 = StrictMath.atan(length1/length2);
		double angle2 = angle2_1 + angle2_2;
		double teta = (angle1 + angle2) / 2;
		double area;
		area = StrictMath.sqrt((half_perimeter - length1) * (half_perimeter - length2) * (half_perimeter - length3) * (half_perimeter - length4) - length1 * length2 * length3 * length4 * ((1 + StrictMath.cos(2 * teta)) / 2));
		return area;

	}
	
	public static double concaved_deltoid (double length1, double length2, double length4) {
		
		double area = length1 * length2 * StrictMath.sin(StrictMath.atan(length2/length4));
		return area;
		
	}
}
