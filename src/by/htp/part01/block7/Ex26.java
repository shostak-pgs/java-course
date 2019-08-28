package by.htp.part01.block7;

/*
 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
 * а) вычислить сумму отрицательных элементов в каждой строке;
 * б) определить максимальный элемент в каждой строке;
 * в) переставить местами максимальный и минимальный элементы матрицы.
 */
public class Ex26 {

	public static void main(String[] args) {
		int[][] arr = {{3, 8, 9, 12, -3 , -4} , {2, 6, 8, -1, -2} , {9, 6, 36, 8, -10, -11}};
		
		int[] minus = minNumbersInRaw(arr);
		sout(minus);
		int[] max = maxNumbersInRaw(arr);
		sout(max);
		int[][] changed = changeMas(arr);
		sout(changed);
	}
	
	public static int[] minNumbersInRaw(int[][] arr) {
		int[] minMas = new int[arr.length];
		for (int i = 0; i < minMas.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0) {
					sum = sum +arr[i][j];
				}				
			}
			minMas[i] = sum;
		}
		return minMas;
	}
	
	public static int[] maxNumbersInRaw(int[][] arr) {
		int[] minMas = new int[arr.length];
		for (int i = 0; i < minMas.length; i++) {
			int max = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}				
			}
			minMas[i] = max;
		}
		return minMas;
	}
	
	public static int[][] changeMas(int[][] arr) {		
		int[][] index = new int[2][2];
		int max = arr[0][0];
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					index[0][0] = i;
					index[0][1] = j;				}
				if (arr[i][j] < min) {
					min = arr[i][j];
					index[1][0] = i;
					index[1][1] = j;	
				}
			}			
		}
		arr[index[0][0]][index[0][1]] = min;
		arr[index[1][0]][index[1][1]] = max;
		return arr;
	}
	
	private static void sout(int[] arr) {
		for (int k1 : arr) {				
					System.out.printf("%4d ", k1);
		}
		for (int k = 0; k < 2; k++) {
		    System.out.println("");
		}
	}
	
	private static void sout(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%4d ", s);
				}
				
				System.out.println("");
		}
	}	
}
