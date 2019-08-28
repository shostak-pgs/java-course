package by.htp.part01.block7;

/*
 *21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */
public class Ex21 {

	public static void main(String[] args) {
		int n = 6;
		
		int[][] arr = new int[n][n];

		for(int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				arr[i][j] = n - j;				
			}
		}		
		for (int[] k:arr) {
			for(int s:k) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}				
	}
}
