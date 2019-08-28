package by.htp.part01.block7;

/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Ex35 {

	public static void main(String[] args) {
		int[][] arr = {{4, 6, 5, 7, 14} , {2, -2, -10, -2, 4} , {3, 3, -2, 3, -4}, {4, 6, 9, 100}};
	    
		int max = findMax(arr);
		print(killOdd(max, arr));
	}
	
	public static int findMax(int[][] arr) {
		int max = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}		
		return max;		
	}
	
	public static int[][] killOdd(int k, int[][] arr) {
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = k;
				}
			}
		}		
		return arr;		
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
