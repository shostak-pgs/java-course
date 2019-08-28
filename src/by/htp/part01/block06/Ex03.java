package by.htp.part01.block06;

/*
 * Дана последовательность чисел a1 <= a2 ... <= an .Требуется переставить элементы так,чтобы они были 
 * расположены по убыванию.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 75 };

		for (int i = 0; i < a.length; i++) {
			int max = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[max]) {
					max = j;
				}
			}
			int tmp = a[i];
			a[i] = a[max];
			a[max] = tmp;
		}

		for (int k : a) {
			System.out.print(k + "\t");
		}
	}
}
