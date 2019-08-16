package by.htp.part01.block4;

/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую\
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Ex18 {

	public static void main(String[] args) {
	    int n = 3;
        
	    if(n <= 9 && n >=2) {
	    	search(n - 1);	
	    } else {
	    	System.out.println("Некорректный ввод");
	    }	      
	}
	
	public static void search(int n) {
		int start = (int) Math.pow(10,(n - 1));
		
		for (int i = 1; i <= 9; i++) {			
		    int sum = 0;
			for (int j = n; j >=0; j--) { 
								
		    sum = sum + (int) Math.pow(10,j) * (i + n - j); 	
		    
		    }if ((sum % 10) == 9) {
			    i = 9;
		    }
		    
			System.out.println(sum);		
	    }
    }  
}
