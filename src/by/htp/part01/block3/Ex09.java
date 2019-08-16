package by.htp.part01.block3;

/*
 * 9. Найти сумму квадратов первых ста чисел.
 */
public class Ex09 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		for (i = 1; i <= 100; i++) {
			int n = i * i;
			sum = sum + n;
		}
		System.out.println(sum);
	}
}
