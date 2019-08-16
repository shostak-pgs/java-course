package by.htp.part01.block2;

/*
 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых
 *  неотрицательны, и в четвертую степень — отрицательные.
 */
public class Ex12 {

	public static void main(String[] args) {
		int a = 12;
		int b = -14;
		int c = 5;
		int pow = 4;

		if (a > 0) {
			System.out.println(a * a);			
		} else {
			System.out.println(Math.pow(a, pow));
		}
		
		if (c > 0) {
			System.out.println(c * c);
		} else {
			System.out.println(Math.pow(c, pow));
		}
		
		if (b > 0) {
			System.out.println(b * b);
		} else {
			System.out.println(Math.pow(b, pow));
		}
	}
}
