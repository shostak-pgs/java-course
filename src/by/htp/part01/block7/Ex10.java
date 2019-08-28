package by.htp.part01.block7;

/*
 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Ex10 {

	public static void main(String[] args) {
		int[][] mass = { {3, 4, 5, 8}, {6, 7, 8, 9}, {1, 2, 3, 1}, {2, 4, 5, 6} };
		int k = 4;
		int p = 1;

		System.out.println("Строка:");
		for (int i = 0; i < mass.length; i++) {
			int j = i;
			for (j = 0; j < mass[i].length; j++) {

				if (i == (k - 1)) {
					System.out.print(mass[i][j] + "\t");
				}
			}
		}
		System.out.println();
		System.out.print("Столбец:");
		System.out.println("");
		for (int i = 0; i < mass.length; i++) {
			int j = i;
			for (j = 0; j < mass[i].length; j++) {
				if (j == (p - 1)) {					
					System.out.println(mass[i][j]);
				}
			}
		}

	}
}
