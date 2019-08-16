package by.htp.part01.block2;

/*
 * 36. Вычислить значение функции:
 */
public class Ex36 {

	public static void main(String[] args) {
		double x = 2;
		double y;
			
		if (x <= 3) {
		    y = ((x * x) - (3 * x) + 9);
		    System.out.println("Значение функции равно " + y);
		} else if (x > 3) {
			y = 1 / ((Math.pow(x, 3)) + 6);
			System.out.println("Значение функции равно " + y);
		} 
	}
}
