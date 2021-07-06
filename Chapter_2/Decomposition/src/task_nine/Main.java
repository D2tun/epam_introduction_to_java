package task_nine;

/* Даны числа X, Y, Z, T - длины сторон четырёхугольника. Написать метод(ы) вычисления его площади,
если угол между сторонами длиной X и Y - прямой. */

public class Main {

	public static void main(String[] args) {

		/*
		 * Так как задание четырёхугольника через длины сторон может выдать некорректный
		 * результат, используем задание по точкам
		 */

		double[] point_x = new double[4];
		double[] point_y = new double[4];
		for (int i = 0; i < 4; i++) {
			point_x[i] = StrictMath.random() * 100 + 1;
			point_y[i] = StrictMath.random() * 100 + 1;
		}
		point_x[1] = point_x[0];
		point_y[3] = point_y[0];

		for (int i = 0; i < 4; i++) {
			System.out.println("x[" + (i + 1) + "]=" + point_x[i] + " " + "y[" + (i + 1) + "]=" + point_y[i]);
		}

		double X = StrictMath
				.sqrt(StrictMath.pow(point_x[1] - point_x[0], 2) + StrictMath.pow(point_y[1] - point_y[0], 2));
		System.out.println("X=" + X);
		double Y = StrictMath
				.sqrt(StrictMath.pow(point_x[2] - point_x[1], 2) + StrictMath.pow(point_y[2] - point_y[1], 2));
		System.out.println("Y=" + Y);
		double Z = StrictMath
				.sqrt(StrictMath.pow(point_x[3] - point_x[2], 2) + StrictMath.pow(point_y[3] - point_y[2], 2));
		System.out.println("Z=" + Z);
		double T = StrictMath
				.sqrt(StrictMath.pow(point_x[0] - point_x[3], 2) + StrictMath.pow(point_y[0] - point_y[3], 2));
		System.out.println("T=" + T);

		if (point_x[2] > (point_x[3] / 2) & point_y[2] > point_y[1]) {
			System.out.println("Площадь четырёхугольника: " + Calculate_area_of_quadrangle.any_protuberant(X, Y, Z, T));
		} else {
			System.out.println("Площадь четырёхугольника: " + Calculate_area_of_quadrangle.concaved_deltoid(X, Y, T));
		}
	}

}
