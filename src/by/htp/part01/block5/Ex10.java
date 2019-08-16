package by.htp.part01.block5;

/*
 * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Ex10 {

	public static void main(String[] args) {
		int[] mass = { 3, 45, 7, 87, 9, 123, 4 };
		int i = 50;

		for (int a = 0; a < mass.length; a++) {
			if (mass[a] > i) {
				System.out.println(mass[a]);
			}
		}
	}
}
