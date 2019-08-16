package by.htp.part01.block2;

/*
 * 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
прямоугольным.
 */
public class Ex14 {

	public static void main(String[] args) {
		double angle1 = 45.0;
		double angle2 = 45.0;

		if (angle1 + angle2 < 180.0) {
			System.out.println("Такой треугольник существует");
		}
		if (180 - angle1 - angle2 == 90.0) {
			System.out.println("Треугольник прямоугольный");
		}
	}
}
