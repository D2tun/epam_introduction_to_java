package by.minsk.epam.jio.taskThree;

public class EquilateralTriangleArea {

	public static double calculate (double side) {
		
		double area = (StrictMath.sqrt(3) * StrictMath.pow(side, 2)) / 4;
		return area;
	}
}
