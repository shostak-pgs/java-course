package by.htp.part01.block7;

/*
 * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex17 {

	public static void main(String[] args) {
		int rang = 6;

		int[][] mass = new int[rang][rang];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == 0 || i == mass.length - 1 || j == mass[i].length - 1 || j == 0) {
					mass[i][j] = 1;
					System.out.print(mass[i][j] + "\t");
				} else {
					mass[i][j] = 0;
					System.out.print(mass[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
