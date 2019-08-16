package by.htp.part01.block2;

/*
 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
началу координат
 */
public class Ex13 {

	public static void main(String[] args) {
		int x1 = 2;
		int y1 = 5;

		double o1 = Math.sqrt(x1 * x1 + y1 * y1);

		int x2 = 1;
		int y2 = 8;

		double o2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (o1 > o2) {
			System.out.println("Точка В ближе к началу координат");
		} else {
			System.out.println("Точка A ближе к началу координат");
		}
	}
}
