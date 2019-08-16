package by.htp.part01.block3;

/*
 * 35. Найдите количество четных цифр данного натурального числа.
 */
public class Ex35 {

	public static void main(String[] args) {
		int number = 10460;
		int sum = 0;
        int current;	        	
	       
	    while (((double) number / 10) >= 0.1) {
	        current = (int) (number % 10);
	        System.out.println(current);
	        number = number / 10;	        
	        if (current != 0 ) {	        	
	            if (((double) current % 2) == 0) {
	                sum++;	                	
	            }        
	        }
	    }
	    System.out.printf("В числе %d четных цифр", sum);
    }
}