package by.htp.part01.block5;

/*
 * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается
 *  раньше - положительное или отрицательное.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] numbers = {9, 34, 54, 12, 3455, -4};

		if (numbers[0] > 0) {
			System.out.println("Раньше положительное");
		} else {
			System.out.println("Раньше отрицательное");
		}
	}
}
