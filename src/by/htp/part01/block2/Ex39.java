package by.htp.part01.block2;

/*
 * Вычислить значение функции:
 */
public class Ex39 {

	public static void main(String[] args) {
		double x = 3.0;
	    double y = 0;
	    double notAllowed;

	    notAllowed = Math.cbrt(Math.cbrt(6));
	    if (x >= 8 ) {
	    	 y = (x - 9 - (x * x));	
	    	 System.out.println("Значение функции равно " + y);
	    } else if ((x < 8) && (x != notAllowed)) {
	    	y = 1 / ((Math.pow(x, 4)) - 6);
	    	System.out.println("Значение функции равно " + y);
	    } else {
	    	System.out.println("корней нет");
	    }	   
	}
}
