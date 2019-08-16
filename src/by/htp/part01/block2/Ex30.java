package by.htp.part01.block2;

import java.math.*;

/*30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить
 *  их абсолютными значениями, если это не так.
 * 
 */
public class Ex30 {

	public static void main(String[] args) {
        int a = -636;
        int b = 421;
        int c = -2;
        
        if ((a > b) && (b > c)) {
        	System.out.printf("Числа были удвоены. Новые значения a = %d, b = %d, c = %d", (a * 2), (b * 2), (c * 2));
        } else {
        	System.out.printf("Абсолютные значения чисел: a = %d, b = %d, c = %d", Math.abs(a), Math.abs(b), Math.abs(c));
        }
		
	}

}
