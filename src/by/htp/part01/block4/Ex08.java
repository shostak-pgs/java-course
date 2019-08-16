package by.htp.part01.block4;

/*
 * 8. Составить программу, которая в массиве A[N] находит второе по величине число
 *  (вывести на печать число,которое меньше максимального элемента массива, но больше всех других 
 *  элементов).
 */
public class Ex08 {

	public static void main(String[] args) {
		int[] a = { 3, 123, 657, 98, 534, 98 };
		System.out.println("Второе по величине число равно " + secMax(a));
	}

	public static int secMax(int[] mas) {
		int max = 0;
		int secMax = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}

			if ((mas[i] < max) && (mas[i] > secMax)) {
				secMax = mas[i];
			}
		}
		return secMax;
	}
}
