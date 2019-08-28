package by.htp.part01.block7;

/*
 * 24. Дан линейный массив x1, x2,..., xn-1, xn. Получить действительную квадратную матрицу порядка n:
 */
public class Ex24 {

	public static void main(String[] args) {
	    int[] mas = {1, 3, 5, 7, 9, 11};
	    int[][] doubleMas = new int[mas.length][mas.length];
	
	    for (int i = 0; i < mas.length; i++) {
		    for  (int j = 0; j < mas.length; j++) {
			doubleMas[i][j] = (int) Math.pow(mas[j], i + 1);
		    }
	    }
	    for (int[] k: doubleMas) {
			for(int s : k) {
				System.out.printf("%6d ", s);
			}
			System.out.println("");
		}		    
	}
}
