package by.htp.part01.block7;

/*
 * 4. Дана матрица. Вывести на экран первую и последнюю строки.
 */
public class Ex04 {

	public static void main(String[] args) {
		int[][] twoDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12,}, {8, 6, 5} };

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < twoDimArray[i].length; j++) {
				System.out.print(twoDimArray[0][j] + "\t");
			}
			System.out.println();
		}
		for (int i =   twoDimArray.length - 1; i <  twoDimArray.length; i++) {
			for (int j = 0; j <  twoDimArray[i].length; j++) {
				System.out.print(twoDimArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}