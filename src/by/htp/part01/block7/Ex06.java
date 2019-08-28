package by.htp.part01.block7;

/*
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Ex06 {

	public static void main(String[] args) {

		int[][] mass = { { 10, 20, 3 }, { 10, 5, 6 }, { 10, 1, 11 }, { 10, 1, 1 }, { 7, 4, 5 } };

		for (int i = 0; i < mass.length; i++) {

			for (int j = 1; j < mass[i].length; j = j + 2) {
				int max = mass[0][j];
				if (max > mass[mass.length - 1][j]) {
					System.out.print(mass[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
