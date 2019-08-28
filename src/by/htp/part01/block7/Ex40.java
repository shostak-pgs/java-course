package by.htp.part01.block7;

import java.util.Random;

/*
 * 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
 *  1, 2, 3, ...,n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
 *   равны между собой.Построить такой квадрат.
 */
public class Ex40 {
	static Random ran = new Random();
	static int isTrue = 0;
	static int n = 4;
    static int magInt = (n * ((n * n) + 1)) / 2;
	
	public static void main(String[] args) {	    
	    int[][] magicCube = new int[n][n];
	    
	    while (isTrue == 0) {
	    	magicCube = init(n);
	    	if (isMagic(magicCube) == true) {
	    		isTrue = 1;
	    	}
	    }
	    print(magicCube);
	}
	
	public static int[][] init(int n) {
		int full = 0;
		int[][] mass = new int[n][n];		
		
		while (full <= n ) {
					
			for (int i = 0; i < n; i++)
			    
				for (int j = 0; j < n; j++) {			    	
					int elem = ran.nextInt(n * n) + 1;
			       
					if (notContains(elem, mass) == true) {
			            mass[i][j] = elem;
			            full++;
			        } else j = j - 1;
		        }
	        }
		return mass;
	}
	
	public static boolean notContains(int num, int[][] mass) {
		boolean isTrue = true;
	
		for (int i = 0; i < mass.length; i++) {
		    
			for (int j = 0; j < mass.length; j++) {
		       
				if (mass[i][j] == num) {
		        	isTrue = false;
		        	break;
		        }
		    }
	    }
		return isTrue;
	}
	
	public static boolean isMagic(int[][] mas) {
		boolean isTrue = false;
		
		if (sumInDiag(mas) == true && sumInLine(mas) == true && sumInColumn(mas) == true) {
			 isTrue = true;
		}		
		return isTrue;
	}
	
	public static boolean sumInLine(int[][] mas) {
		boolean isTrue = true;
		int[] helpArr = new int[mas.length];
		
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < mas[i].length; j++) {
				sum = sum + mas[i][j];
			}
			helpArr[i] = sum;
		}
		
		for (int j = 0; j < helpArr.length - 1; j++) {
			
			if (helpArr[j] != helpArr[j + 1]) {
				isTrue = false;
			}
		}		
		return isTrue;
	}
	
	public static boolean sumInColumn(int[][] mas) {
		boolean isTrue = true;
		int[] helpArr = new int[mas.length];
		
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < mas[i].length; j++) {
				sum = sum + mas[j][i];
			}
			helpArr[i] = sum;
		}
		
		for (int j = 0; j < helpArr.length - 1; j++) {
			
			if (helpArr[j] != helpArr[j + 1]) {
				isTrue = false;
			}
		}		
		return isTrue;
	}
	
	public static boolean sumInDiag(int[][] mas) {
		boolean isTrue = true;
		int[] helpArr = new int[2];		
		int sum = 0;
		
		 for (int i = 0; i < mas.length; i++) {			  
				  sum = sum + mas[i][i];
		 }
		 
		 helpArr[0] = sum;			
		 int sum1 = 0;
		 
		 for (int j = 0; j < mas.length; j++) {			  
				  sum1 = sum1 + mas[j][mas.length - j - 1];
		 }
		 helpArr[1] = sum1;		
	
		 if (helpArr[0] != helpArr[1] || helpArr[0] != magInt) {
			isTrue = false;
		}				
		return isTrue;
	}
	
	private static void print(int[][] arr) {
		for (int[] k1 : arr) {

			for (int s : k1) {
				System.out.printf("%4d ", s);
			}
			System.out.println("");
		}
	}
}
