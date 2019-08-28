package by.htp.part01.block7;

/*
 * 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex20 {

	public static void main(String[] args) {	
	    int n= 10;
	    int mas[][]= new int[n][n];
	
	    for(int i = 0; i  <n; i++) {
		    for (int j = 0; j < n; j++) {
		       
		    	if(i >= j && i < (n  /2)) {
			       mas[i][j] = 1;
			       mas[i][mas[i].length - j - 1] = 1;
			   } else if( i >= (n / 2) && i <= j) {
				   mas[i][j] = 1;
			       mas[i][mas[i].length - j - 1] = 1;	
		       }
		    	
		    }		
	    }
	    print(mas);	
	}
	
	private static void print(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%2d ", s);
				}
				
				System.out.println("");				
		}
	}
}
