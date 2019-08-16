package by.htp.part01.block3;

/*
 * 11. Составить программу нахождения разности кубов первых двухсот чисел
 */
public class Ex11 {

	public static void main(String[] args) {
		int i;
		double diff = 0;
		for (i = 1; i <= 200; i++) {
			double b = Math.pow(i, 3);
			diff = diff - b;
		}
		System.out.println(diff);
	}
}
