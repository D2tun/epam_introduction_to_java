package task_seven;

/* Опишите класс, представляющий треугольник. Предусмотреть методы  для создания объектов, вычисления
площади, периметра и точки пересечения медиан. */

public class Main {

	public static void main(String[] args) {
		
		Triangle a = new Triangle(0, 0, 5, 2, 3, 3);
		System.out.println("Периметр треугольника: " + a.get_perimeter());
		System.out.println("Площадь треугольника: " + a.get_area());
		System.out.println("Координаты точки пересечения меридиaн: x = " + a.get_median_crossing()[0] + "; y = " + a.get_median_crossing()[1]);
	}

}
