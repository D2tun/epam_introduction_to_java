package by.minsk.epam.jio.taskSeven;

/* 
 * Опишите класс, представляющий треугольник. Предусмотреть методы для 
 * создания объектов, вычисления площади, периметра и точки пересечения 
 * медиан. 
 */

public class Main {

	public static void main(String[] args) {
		
		Triangle a = new Triangle(0, 0, 5, 2, 3, 3);
		System.out.println("Периметр треугольника: " + a.getPerimeter());
		System.out.println("Площадь треугольника: " + a.getArea());
		System.out.println("Координаты точки пересечения меридиaн: x = " 
						   + a.getMedianCrossing()[0] + "; y = " 
						   + a.getMedianCrossing()[1]);
	}
}
