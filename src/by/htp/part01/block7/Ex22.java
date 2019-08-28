package by.htp.part01.block7;

/*
 * 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex22 {

	public static void main(String[] args) {
        int n = 10;
        int count = 0;
		
		int[][] arr = new int[n][n];

		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				arr[i][j] = j + 1 + count;			
			}
			count++;
		}
		
		for (int[] k:arr) {
			for(int s:k) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}				
	}
}

