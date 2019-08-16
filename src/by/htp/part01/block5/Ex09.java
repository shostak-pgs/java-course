package by.htp.part01.block5;

/*
 * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
public class Ex09 {

	public static void main(String[] args) {
		int[] mass = {23, 5, 4, 7, 89, 1, 345};
		int max = mass[0];
		int min = mass[0];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				mass[i] = max;
			} else if (mass[i] == max) {
				mass[i] = min;
			}
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
	}
}
