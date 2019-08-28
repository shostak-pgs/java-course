package by.htp.part01.block7;

/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Ex09 {

	public static void main(String[] args) {
		int[][] mass = { { 3, 4, 5 }, { 6, 7, 8 }, { 1, 2, 3 } };

		for (int i = 0; i < mass.length; i++) {
			int j = i;

			for (j = 0; j < mass[i].length; j++) {
				if (i == j) {
					System.out.print(mass[i][j] + "\t");
				}
			}
		}
	}
}
