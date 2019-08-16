package by.htp.part01.block2;

/*
 * 18. Подсчитать количество отрицательных среди чисел а, b, с
 */
public class Ex18 {

	public static void main(String[] args) {
		int a = 3;
		int b = - 40;
		int c = 34;

		if (a < 0) {
			a = 1;
		} else {
			a = 0;
		}
		if (b < 0) {
			b = 1;
		} else {
			b = 0;
		}
		if (c < 0) {
			c = 1;
		} else {
			c = 0;
		}
		System.out.println(a + b + c);
	}
}
