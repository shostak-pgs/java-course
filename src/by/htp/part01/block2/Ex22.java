package by.htp.part01.block2;

/*22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее
 *  из этих значений, а в y - меньшее.
 */
public class Ex22 {
	
	public static void main(String[] args) {
	    double x = 2.1;
	    double y = 2.2;
	    double c;
	
	    if (x < y) {
		    c = x;
		    x = y;
		    y = c;
	    }

	    System.out.printf("x = %f, y = %f", x, y);
	}
}
