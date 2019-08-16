package by.htp.part01.block3;

/*
 * 13. Составить таблицу значений функции y = 5 - x2 /2 на отрезке [-5; 5] с шагом 0.5.
 */
public class Ex13 {

	public static void main(String[] args) {
		double x;

		for (x = -5.0; x <= 5.0; x = x + 0.5) {
			double y = 5 - Math.pow(x, 2) / 2;
			System.out.println("x = " + x + ", " + "y = " + y);
		}
	}
}
