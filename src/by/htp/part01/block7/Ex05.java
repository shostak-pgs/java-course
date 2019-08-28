package by.htp.part01.block7;

/*
 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 */
public class Ex05 {

	public static void main(String[] args) {
		int[][] mass = { {1, 2, 3}, {9, 11, 12}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {4, 5, 6} };

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(mass[i][j] + "\t");
				}		
			}
			System.out.println();
		}
	}
}
