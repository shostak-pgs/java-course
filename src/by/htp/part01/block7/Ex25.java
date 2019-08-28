package by.htp.part01.block7;

/*
 * 25. Получить квадратную матрицу порядка n:
 */
public class Ex25 {

	public static void main(String[] args) {
	int n = 6;
	int k = 1;
	int[][] arr = new int[n][n];
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <n; j++) {
			arr[i][j] = k;
			k++;
		}
	}
	
	 for (int[] k1 : arr) {
			for(int s : k1) {
				System.out.printf("%6d ", s);
			}
			System.out.println("");
		}
	}
}
