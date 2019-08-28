package by.htp.part01.block7;

/*
 * 38. Найдите сумму двух матриц
 */
public class Ex38 {

	public static void main(String[] args) {
		int[][] arr1 = {{4, 6, 5, 7, 8, 5, 8} , {2, -2, -10, 4, 8, 5, 7} , {3, 3, -2, 3, 2, 5, 7}, {4, 6, 9, 5, 1, 5, 8}};
		int[][] arr2 = {{4, 6, 5, 7, 8, 5, 8} , {2, -2, -10, 4, 8, 5, 7} , {3, 3, -2, 3, 2, 5, 7}, {4, 6, 9, 5, 1, 5, 8}};
	    
		print(sumMatrix(arr1, arr2));
	}
	
    public static int[][] sumMatrix(int[][] array1, int[][] array2) { 
    	boolean isTrue = true;
    
        if (array1.length == array2.length) {
	        for (int k = 0; k < array1.length; k++) {
	    	    if (array1[k].length != array2[k].length) {
	    	    	isTrue = false;
	    	    }
	        }
        }
        
        int[][]	sumArr = new int[array1.length][array1[0].length];
        
        if (isTrue == true) {		
		    for (int i = 0; i < array1.length; i++) {			
		        for (int j = 0; j < array1[i].length; j++) {		    
		    	    sumArr[i][j] = array1[i][j] + array2[i][j];		    	
		        }		    
		}			
	   
        } else {
        	System.out.println("Порядок матриц не совпадает!");
        }  
        return sumArr;
	}

    private static void print(int[][] arr) {
	    for (int[] k1 : arr) {
			for(int s : k1) {
				System.out.printf("%6d ", s);
			}				
			System.out.println("");				
	    }
    }
}
