package by.htp.part01.block4;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего 
 * кратного двух натуральных чисел:
 */
public class Ex02 {

	public static void main(String[] args) {
		int a = 22;
		int b = 8;
		nodNok(a, b);
	}

	public static void nodNok(int x, int y) {
		int nod = 0;
		for (int i = 1; i < (x * y); i++) {

			if ((x % i == 0) && (y % i == 0)) {

				if (nod < i) {
					nod = i;
				}
			}
		}
		System.out.println("НОД = " + nod);
		System.out.println("НОК = " + x * y / nod);
	}
}
