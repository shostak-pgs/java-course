package by.htp.part01.block7;

/*
 * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex16 {

	public static void main(String[] args) {
		int rang = 8;

		int[][] mass = new int[rang][rang];
		int n = 1;
		int result = 1;

		for (int i = 0; i < mass.length; i++) {
			n++;
			int o = n * result;
			result = n;

			for (int j = 0; j < mass[i].length; j++) {
				if (j == i) {
					mass[i][j] = o;
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
