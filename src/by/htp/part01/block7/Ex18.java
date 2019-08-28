package by.htp.part01.block7;

/*
 * 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex18 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mass = new int[n][n];		
		int h = -1;

		for (int i = 0; i < mass.length; i++) {		
			h++;
			for (int j = (mass[i].length - 1); j > -1; j--) {
				if (j == h || j > h) {
					mass[i][j] = i + 1;
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
