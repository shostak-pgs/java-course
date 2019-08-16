package by.htp.part01.block4;

/*
 * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Ex03 {

	public static void main(String[] args) {
		int a = 60;
		int b = 120;
		int c = 15;
		int d = 15;

		nod(a, b, c, d);
	}

	public static void nod(int x, int y, int o, int z) {
		int nod = 0;
		for (int i = 1; i < x * y * z * o; i++) {

			if ((x % i == 0) && (y % i == 0) && (o % i == 0) && (z % i == 0)) {

				if (i > nod) {
					nod = i;
				}
			}
		}
		System.out.println(nod);
	}
}
