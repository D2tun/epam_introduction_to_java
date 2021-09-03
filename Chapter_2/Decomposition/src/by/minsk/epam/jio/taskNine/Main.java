/* 
 * Даны числа X, Y, Z, T - длины сторон четырёхугольника. Написать метод(ы)
 * вычисления его площади, если угол между сторонами длиной X и Y - прямой. 
 */

package by.minsk.epam.jio.taskNine;

public class Main {

	public static void main(String[] args) {

		/*
		 * Так как задание четырёхугольника через длины сторон может выдать 
		 * некорректный результат, используем задание по точкам
		 */

		double[] pointX = new double[4];
		double[] pointY = new double[4];
		for (int i = 0; i < 4; i++) {
			pointX[i] = StrictMath.random() * 100 + 1;
			pointY[i] = StrictMath.random() * 100 + 1;
		}
		pointX[1] = pointX[0];
		pointY[3] = pointY[0];

		for (int i = 0; i < 4; i++) {
			System.out.println("x[" + (i + 1) + "]=" + pointX[i] + " " + "y[" 
							   + (i + 1) + "]=" + pointY[i]);
		}

		double X = StrictMath
				.sqrt(StrictMath.pow(pointX[1] - pointX[0], 2)
					  + StrictMath.pow(pointY[1] - pointY[0], 2));
		System.out.println("X=" + X);
		double Y = StrictMath
				.sqrt(StrictMath.pow(pointX[2] - pointX[1], 2)
					  + StrictMath.pow(pointY[2] - pointY[1], 2));
		System.out.println("Y=" + Y);
		double Z = StrictMath
				.sqrt(StrictMath.pow(pointX[3] - pointX[2], 2) 
					  + StrictMath.pow(pointY[3] - pointY[2], 2));
		System.out.println("Z=" + Z);
		double T = StrictMath
				.sqrt(StrictMath.pow(pointX[0] - pointX[3], 2) 
					  + StrictMath.pow(pointY[0] - pointY[3], 2));
		System.out.println("T=" + T);

		if ((pointX[2] > (pointX[3] / 2)) & (pointY[2] > pointY[1])) {
			System.out.println("Площадь четырёхугольника: "
						+ AreaOfQuadrangle.calculateAnyProtuberant(X, Y, Z, T));
		} else {
			System.out.println("Площадь четырёхугольника: "
						  + AreaOfQuadrangle.calculateConcavedDeltoid(X, Y, T));
		}
	}
}
