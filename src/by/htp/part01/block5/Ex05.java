package by.htp.part01.block5;

/*
 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел
 *  этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class Ex05 {

	public static void main(String[] args) {
		int[] mass = {2, 5, 6, 78, 8, 4, 23, 4, 5, 1};
		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Четных чисел в последовательноси нет");
		}

		int[] evenNumbers = new int[count];
		int j = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				evenNumbers[j] = mass[i];
				j++;
			}
		}
		for (int q : evenNumbers) {
			System.out.println(q);
		}
	}
}
