package by.htp.part01.block1;

/*
 * 1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
 */
public class Ex01 {

	public static void main(String[] args) {
		int x = 16;
		int y = 8;

		int sum = x + y;

		int diff = x - y;

		int prod = x * y;

		int quot = x / y;

		System.out.println("Сумма чисел = " + sum);
		System.out.println("Разность чисел = " + diff);
		System.out.println("Произведение чисел = " + prod);
		System.out.println("Частное чисел = " + quot);
	}
}
