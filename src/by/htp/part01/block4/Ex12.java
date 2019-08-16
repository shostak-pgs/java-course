package by.htp.part01.block4;

/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
public class Ex12 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 15;
		int t = 7;
		
		System.out.printf("S = %.3f", square(x, y, z, t));
	}
	
	static double square(int x, int y, int z, int t) {
		double square = ((((t * 1.0) + y) / 2) * x);
		return square;
	}
}
