package by.htp.part01.block7;

import java.util.Random;

/*
 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */
public class Ex02 {

	public static void main(String[] args) {
		Random ran = new Random();

		int[][] twoDimArray = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				twoDimArray[i][j] =  ran.nextInt(10);
				System.out.print(twoDimArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
