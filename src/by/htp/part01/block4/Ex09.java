package by.htp.part01.block4;

/*
 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Ex09 {

	public static void main(String[] args) {
		int a = 11;
		int b = 13;
		int c = 6;
		noDivider(a, b, c);
	}

	public static void noDivider(int x, int y, int z) {
		int divider = 0;
		
		int pr = x * y * z;
		for (int i = 1; i <= pr; i++) {
			if ((x % i == 0) && (y % i == 0) && (z % i == 0)) {
				divider = i;
			}
		}
		if (divider == 1) {
			System.out.println("данные три числа взаимно простыe");
		} else {
			System.out.println("данные три числа не являются взаимно простыми");
		}
	}
}
