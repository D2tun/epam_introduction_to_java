package by.minsk.epam.jio.taskSeven;

public class Triangle {

	private double point1x;
	private double point1y;
	private double point2x;
	private double point2y;
	private double point3x;
	private double point3y;
	private double side1;
	private double side2;
	private double side3;
	private double angle_ch1;
	private double angle_ch2;
	private double angle_cc;
	private double perimeter;

	public Triangle(double point1x, double point1y, double point2x, 
					double point2y, double point3x, double point3y) {

		if (((point1x == point2x) & (point1y == point2y)) 
				| ((point2x == point3x) & (point2y == point3y)) 
				| ((point3x == point1x) & (point3y == point1y))) {
			System.out.println("Это не треугольник.");
		} else {
			this.point1x = point1x;
			this.point1y = point1y;
			this.point2x = point2x;
			this.point2y = point2y;
			this.point3x = point3x;
			this.point3y = point3y;
			this.side1 = StrictMath.sqrt(StrictMath.pow((point2x - point1x), 2)
														+ (StrictMath.pow((point2y 
																- point1y), 2)));
			this.side2 = StrictMath.sqrt(StrictMath.pow((point3x - point2x), 2)
														+ (StrictMath.pow((point3y
																- point2y), 2)));
			this.side3 = StrictMath.sqrt(StrictMath.pow((point1x - point3x), 2) 
														+ (StrictMath.pow((point1y
																- point3y), 2)));
			if ((side1 > side2) & (side1 > side3)) {
				this.angle_ch1 = StrictMath.toDegrees(StrictMath.acos(side2 
																	 / side1));
				this.angle_ch2 = StrictMath.toDegrees(StrictMath.acos(side3 
																	 / side1));
				this.angle_cc = 180 - this.angle_ch1 - this.angle_ch2;
			}
			if ((side2 > side1) & (side2 > side3)) {
				this.angle_ch1 = StrictMath.toDegrees(StrictMath.acos(side1 
																	 / side2));
				this.angle_ch2 = StrictMath.toDegrees(StrictMath.acos(side3 
																	 / side2));
				this.angle_cc = 180 - this.angle_ch1 - this.angle_ch2;
			}
			if ((side3 > side2) & (side3 > side1)) {
				this.angle_ch1 = StrictMath.toDegrees(StrictMath.acos(side1 
																	 / side3));
				this.angle_ch2 = StrictMath.toDegrees(StrictMath.acos(side2 
																	 / side3));
				this.angle_cc = 180 - this.angle_ch1 - this.angle_ch2;
			}
		}
	}

	public double getPerimeter() {
		double perimeter = this.side1 + this.side2 + this.side3;
		this.perimeter = perimeter;
		return this.perimeter;
	}

	public double getArea() {
		double area = StrictMath.sqrt((this.perimeter / 2) 
									 * ((this.perimeter / 2) - this.side1) 
									 * ((this.perimeter / 2) - this.side2) 
									 * ((this.perimeter / 2) - this.side3));
		return area;
	}

	public double[] getMedianCrossing() {
		double[] medianXY = new double[2];
		medianXY[0] = (this.point1x + this.point2x + this.point3x) / 3;
		medianXY[1] = (this.point1y + this.point2y + this.point3y) / 3;
		return medianXY;
	}
}
