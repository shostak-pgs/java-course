package by.htp.part01.block7;

/*
 * 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex19 {

	public static void main(String[] args) {
		int n = 8;		
		int mas [][] = new int [n][n];
	
		for (int i = 0; i < (n / 2); i++) {			
			for(int j  = i; j < ( n / 2); j++) {				
					mas[i][j] = 1;
					mas[n - 1 - i][n - 1 - j] = 1;
					mas[n - 1 - i][j] = 1;
					mas[i][n - 1 - j] = 1;				
		    }
		}
		
		for (int[] k:mas) {
			for(int s:k) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}				
	}
}
