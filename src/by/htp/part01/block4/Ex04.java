package by.htp.part01.block4;

/*
 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */
public class Ex04 {

	public static void main(String[] args) {
		int a = 23;
		int b = 25;
		int c = 12;
		nok(a, b, c);
	}

	public static void nok(int x, int y, int o) {
		int nod = 0;
		for (int i = 1; i < (x * y * o); i++) {

			if ((x % i == 0) && (y % i == 0) && (o % i == 0)) {

				if (i > nod) {
					nod = i;
				}
			}
		}
		System.out.println("HOK = " + (x * y * o) / nod);
	}
}
