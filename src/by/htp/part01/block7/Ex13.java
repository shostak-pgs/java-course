package by.htp.part01.block7;

/*
 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Ex13 {

	public static void main(String[] args) {
	    int b = 8;
    
		int[][] mass = new int[b][b];
    
        for (int i = 0; i < mass.length; i++) {
    	    for (int j = 0; j < mass[i].length; j++) {
    		    if ((i + 1) % 2 == 0) {    			    
    				    mass[i][j] = mass[i].length - j;
    		     } else if ((i + 1) % 2 != 0) {    				  
    					   mass[i][j] = j + 1;     				   
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
