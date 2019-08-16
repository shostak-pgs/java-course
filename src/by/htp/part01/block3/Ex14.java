package by.htp.part01.block3;

/*
 * 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
public class Ex14 {

	public static void main(String[] args) {
		double i;
		double sum = 1;

		for (i = 2; i < 12; i++) {
			double n = 1 / i;
			sum = sum + n;
		}
		System.out.println(sum);
	}
}
