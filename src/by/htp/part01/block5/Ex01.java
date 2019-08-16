package by.htp.part01.block5;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Ex01 {

	public static void main(String[] args) {
		int[] mass = { 24, 56, 26, 96, 124, 564 };
		int k = 12;
		int sum = 0;

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] % k == 0) {
				sum = mass[i] + sum;
			}
		}
		System.out.println(sum);
	}
}
