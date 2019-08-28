package by.htp.part01.block7;

import java.util.Random;

/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class Ex30 {

	public static void main(String[] args) {
		byte [] numberOfLine;
		
	    byte[][] matrix = init();
	    numberOfLine = countLines(matrix);
	    
	    sout(matrix);
	    sout(numberOfLine);

	}
	
	public static byte[][] init() {
		byte[][] mat = new byte[10][20];
		
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				mat[i][j] = (byte) ran.nextInt(16);
			}
		}
	    return mat;
	}
	
	public static byte[] countLines(byte[][] array) {
		byte[] mat;
		int amount = 0;
				
		for (int i = 0; i < 10; i++) {
			int number = 0;
			for (int j = 0; j < 20; j++) {
				if (array[i][j] == 5) {
					number++;
				}				
			}
			if (number >= 3) {
				amount++;
			}
		}
		
		mat = new byte[amount];		
		int currAmount = 0;
		
		for (int i = 0; i < 10; i++) {
			int number = 0;
			for (int j = 0; j < 20; j++) {
				if (array[i][j] == 5) {
					number++;
				}				
			}
			if (number >= 3) {
				mat[currAmount] = (byte) i;
				currAmount++;
		    }
		}		
	    return mat;
	}
 	
	private static void sout(byte[][] arr) {
		 for (byte[] k1 : arr) {
				for(byte s : k1) {
					System.out.printf("%4d ", s);
				}
				
				System.out.println("");
				System.out.println("");
		}
	}
	
	private static void sout(byte[] arr) {
		if (arr.length == 0) {
			System.out.printf("Число 5 не встречается 3 и более раз");
		} else if (arr.length == 1) {
			System.out.printf("Число 5 встречается 3 и более раз в строкe %4d ", arr[0]);			
		} else if (arr.length > 1) {
		System.out.printf("Число 5 встречается 3 и более раз в строках ");
		for(byte s : arr) {
					System.out.printf("%4d ", s + 1);
				}				
				System.out.println("");
		}
	}
}

