package by.htp.part01.block7;

/*
 * 3. Дана матрица. Вывести на экран первый и последний столбцы.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[][] twoDimArray = { { 2, 3, 4, 8}, {3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 7, 8} };

		for (int i = 0; i < twoDimArray.length; i++) {			
			for (int j = 0; j < twoDimArray[i].length; j = j + twoDimArray[i].length - 1) {				
					System.out.print(twoDimArray[i][j] + "       ");
			}
			System.out.println();
		}
	}	
}
