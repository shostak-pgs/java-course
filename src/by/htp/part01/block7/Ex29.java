package by.htp.part01.block7;

/*
 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Ex29 {

	public static void main(String[] args) {
		int[][] arr = {{28,  -3, 5, 7, 14} , {2, -2, -10, -2, 4} , {3, 3, -2, 3, -4}};
        int[] rez = new int[arr.length];
        int[] positive;
        
        rez = mainDiagonalElement(arr);        
        positive = findPositive(rez);
        
        print(positive);
	}
	
	public static int[] mainDiagonalElement(int[][] arr) {
		int[] mas = new int[arr.length];
		
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (i == j) {
				mas[j] = arr[i][j];
				}
			}
		}
		return mas;
	}	
	
	public static int[] findPositive(int[] arr) {
		int[] mas;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		
		mas = new int[count];	
		count = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {
				mas[count]= arr[j];
				count++;
			}
		}		
		return mas;
	}
	
	private static void print(int[] arr) {
		for(int s : arr) {
			System.out.printf("%6d ", s);				
		}
		System.out.println("");
	}
	
}
