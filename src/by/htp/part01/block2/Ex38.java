package by.htp.part01.block2;

/*
 *38. Вычислить значение функции:
 */
public class Ex38 {

	public static void main(String[] args) {
	    double x = 5;
		double y = 0;

		if ((x >= 0) && (x <= 3)) {
	        y = (x * x);
		    System.out.println("Значение функции равно " + y);
		} else if ((x > 3) || (x < 0)) {
		    y = 4.0;
		    System.out.println("Значение функции равно " + y);
		}
	}
}