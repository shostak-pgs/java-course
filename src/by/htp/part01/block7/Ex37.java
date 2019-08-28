package by.htp.part01.block7;

import java.util.Random;

/*
 * 37. Переставить строки матрицы случайным образом.
 */
public class Ex37 {

	public static void main(String[] args) {
        int[][] arr = {{4, 6, 5, 7, 8, 5, 8} , {2, -2, -10, 4, 8, 5, 7} , {3, 3, -2, 3, 2, 5, 7}, {4, 6, 9, 5, 1, 5, 8}};
        
		print(randomLine(arr));
	}
	
	public static int[][] randomLine(int[][] arr) {
        Random ran = new Random();		
		
		    for (int i = 0; i < arr.length; i++) {
		    	int first = ran.nextInt(arr.length);
		    	int second = ran.nextInt(arr.length);
		    	arr[first] = arr[second];
		    }
		return arr;
	}
	
	private static void print(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%6d ", s);
				}				
				System.out.println("");				
		}
	}
}
