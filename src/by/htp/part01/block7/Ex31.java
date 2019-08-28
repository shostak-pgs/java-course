package by.htp.part01.block7;

import java.util.Random;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
 */
public class Ex31 {

	public static void main(String[] args) {
		int xSize = 6;
		int ySize = 7;
		
		int[][] array = init(xSize, ySize);
        
		print(array);
		System.out.println("Количество двузначных чисел = " + countNumbers(array));	
	}
	
	public static int[][] init(int x, int y) {
		int[][] mat = new int[x][y];
		
		Random ran = new Random();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				mat[i][j] = ran.nextInt(1000);
			}
		}
	    return mat;
	}
	
	public static int countNumbers(int[][] array) {
		int quantity = 0;		
				
		for (int i = 0; i < array.length; i++) {			
			for (int j = 0; j < array[i].length; j++) {
				if (isDouble(array[i][j])) {
					quantity++;
				}				
			}			
		}
		return quantity;
	}
	
	public static boolean isDouble(int k) {
		boolean isTrue = true;
		k = k / 100;
		if (k > 0) {
			isTrue = false;
		}		
		return isTrue;
	}
	
	private static void print(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%4d ", s);
				}
				
				System.out.println("");				
		}
	}
}
