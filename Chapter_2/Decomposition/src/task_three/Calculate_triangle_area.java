package task_three;

public class Calculate_triangle_area {

	public static double equilateral (double side) {
		
		double area = (StrictMath.sqrt(3) * StrictMath.pow(side, 2)) / 4;
		return area;
	}
}
