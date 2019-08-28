package by.htp.part01.block7;

/*
 * 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex14 {

	public static void main(String[] args) {
		int g = 8;
		int h = -1;
		
		int[][] mass = new int[g][g];			

		for (int i = 0; i < mass.length; i++) {		
			h++;
			for (int j = 7; j > -1; j--) {
				if (j == h) {
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
