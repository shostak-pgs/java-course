package by.htp.part01.block4;

/*
 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */
public class Ex01 {

	public static void main(String[] args) {

		double x1 = 1.0;
		double x2 = 6.9;
		double x3 = 4.5;
		double y1 = 1.0;
		double y2 = 3.4;
		double y3 = 6.8;
		area(x1, x2, x3, y1, y2, y3);
	}

	public static void area(double a1, double a2, double a3, double b1, double b2, double b3) {
		double area = Math.abs(1 / 2 * (a1 - a3) * (b2 - b3) - (a2 - a3) * (b1 - b3));
		System.out.printf("Площадь треугольника = %.3f", area);
	}
}
