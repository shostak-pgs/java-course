package by.htp.part01.block7;

/*
 * 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex15 {

	public static void main(String[] args) {
		int k = 6;

		int[][] mass = new int[k][k];
		int n = mass.length + 1;

		for (int i = 0; i < mass.length; i++) {
			n--;
			for (int j = 0; j < mass[i].length; j++) {
				if (j == i) {
					mass[i][j] = n;
				} else {
					mass[i][j] = 0;
				}
			}
		}
		print(mass);
	}
	
	private static void print(int[][] arr) {
		for (int[] k1 : arr) {

			for (int s : k1) {
				System.out.printf("%6d ", s);
			}
			System.out.println("");
		}
	}
}
