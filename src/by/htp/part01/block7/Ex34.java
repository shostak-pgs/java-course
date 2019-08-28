package by.htp.part01.block7;

import java.util.Random;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
 *  в каждом столбце число единиц равно номеру столбца.
 */
public class Ex34 {

	public static void main(String[] args) {
	    int m = 12;
	    int n = 9;
	    
	    int[][] binaryArr = new int[m][n];
	    binaryArr = init(binaryArr, m);
	    print(binaryArr);
	}
	
	public static int[][] init(int[][] array, int n) {			
		
		for (int j = 0; j < array[0].length; j++) {
			int[] helpArr = new int[array.length];
		    for (int i = 0; i < array.length; i++) {		    
		    	helpArr[i] = array[i][j];		    	
		    }
		    if (j < n) {
				helpArr = initLine(helpArr, j);
		    } else if (j >= n) {
		    	helpArr = initLine(helpArr, n - 1);
		    }
				for (int k = 0; k < helpArr.length; k++) {
					array[k][j] = helpArr[k];
				}
			}						
	    return array;
	}
	
	public static int[] initLine(int[] mas, int size) {
		boolean isTrue = true;
		Random ran = new Random();
		
		while (isTrue) {
		    for (int i = 0; i < mas.length || i < size; i++) {
		        mas[i] = ran.nextInt(2);
		        int sum = 0;
		
		        for(int j = 0; j < mas.length; j++) {
		    	    sum = sum + mas[j];
		        }
		        if (sum == (size + 1)) {
		        isTrue = false;	
		    	break;
		        }
		    }
		}
		return mas;
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
