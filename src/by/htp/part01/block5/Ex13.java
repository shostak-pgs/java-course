package by.htp.part01.block5;

/*
 * 13. Определить количество элементов последовательности натуральных чисел, 
 * кратных числу М и заключенных в промежутке от L до N.
 */
public class Ex13 {

	public static void main(String[] args) {
	    int m  = 7;
	    int l = 6;
	    int n = 22;
	    int count = 0;
        
	    for (int i = l; i <= n; i++ ) {
	    	if (isMultiple(i, m) == true) {
	    		count++;
	    	}
	    }
	    
	    System.out.println(count);	    
	}
	
	public static boolean isMultiple(int num, int num1) {
		boolean isMultiple = true;
		
		if ((num % num1) != 0) {
			isMultiple = false;
		}
		
		return isMultiple;
	}

}
