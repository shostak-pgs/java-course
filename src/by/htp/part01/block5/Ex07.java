package by.htp.part01.block5;

/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.
 */
public class Ex07 {

	public static void main(String[] args) {
		int[] mass = { 2, 5, 8, 53, 89, 76, 23, 7 };
		int z = 40;
		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > z) {
				mass[i] = z;
				count++;
			}
		}
		System.out.println("Количество замен = "+ count);
	}
}
