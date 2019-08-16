package by.htp.part01.block2;

/*
 * 40. Вычислить значение функции:
 */
public class Ex40 {

	public static void main(String[] args) {
		double x = 14;
		double y;
			
		if (x <= 13) {
		    y = (9 - Math.pow(x, 3));
		    System.out.println("Значение функции равно " + y);
		} else if (x > 13) {
			y = -3 / (x + 1);
			System.out.println("Значение функции равно " + y);
		} 
	}
}