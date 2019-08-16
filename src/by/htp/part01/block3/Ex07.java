package by.htp.part01.block3;

/*
 * 7. Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Ex07 {

	public static void main(String[] args) {
		int a = -2;
		int b = 3;
		double h = 0.5;

		for (double x = a; x <= b; x = x + h) {
			if (x > 2) {
				double y = x;
				System.out.println("При х > 2 значение функции равно = " + y);
			} else if (x <= 2) {
				double y = -x;
				System.out.println("При х <= 2 значение функции равно = " + y);
			}
		}
	}
}
