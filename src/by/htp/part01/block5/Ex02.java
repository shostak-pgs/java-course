package by.htp.part01.block5;

/*
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] mass = {12, 45, 0, 40, 1, 0, 5, 0, 0};
		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				count++;
			}
		}

		int[] zeroMass = new int[count];
		int j = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				zeroMass[j] = i;
				j++;
			}
		}
		for (int s : zeroMass) {
			System.out.println(s);
		}
	}

}
