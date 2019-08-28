package by.htp.part01.block7;

/*
 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
 *  налево, вторая строка слева направо, третья строка справа налево и так далее.
 */
public class Ex11 {

	public static void main(String[] args) {

		int[][] mass = { {3, 4, 5}, {6, 7, 8}, {1, 2, 3}, {3, 2, 1} };

		for (int i = 0; i < mass.length; i++) {

			if ((i + 1) % 2 == 0) {
				for (int j = mass[i].length - 1; j >= 0; j--) {
					System.out.print(mass[i][j] + "\t");
				}
			} else if ((i + 1) % 2 != 0) {
				for (int j = 0; j < mass[i].length; j++) {
					System.out.print(mass[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
