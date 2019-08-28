package by.htp.part01.block7;

/*
 *12. Получить квадратную матрицу порядка n:
 */
public class Ex12 {
             
	public static void main(String[] args) {
		int n = 7;
		
		int[][] mass = new int[n][n];
		
		for (int i = 0 ; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == j) {
					mass[i][j] = j;
				} else {
					mass[i][j] = 0;
				}
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
