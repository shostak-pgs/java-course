package by.htp.part01.block7;

import java.util.Random;

/*
 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7
 *  среди элементов массива.
 */
public class Ex08 {

	public static void main(String[] args) {
		Random ran = new Random();
		int n = 4;
		int m = 8;
		int[][] mass = new int[n][m];
		int count = 0;

		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = ran.nextInt(n * n) + 1;

				if (mass[i][j] == 7) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}
