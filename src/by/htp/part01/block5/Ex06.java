package by.htp.part01.block5;

/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа
 */
public class Ex06 {

	public static void main(String[] args) {
		int[] mass = { 23, 5, 76, 23, 89, 6, 8, 33, 7, 45, 76, 1 };
		int min = mass[0];
		int max = mass[0];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		System.out.println("Наименьшая длина оси = " + (max - min));
	}
}
