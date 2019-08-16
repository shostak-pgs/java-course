package by.htp.part01.block1;

/*
 * 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */
public class Ex36 {
	public static void main(String[] args) {
		int a = 3458;
        int even = 1;
        int odd = 1;
        double rez = 0;
        
        for (int i = 4; i > 0; i--) {
        	int j;
        	
        	j = (int) ((a / (Math.pow(10, i - 1))) % 10);
        	   	if (j % 2 != 0) {
        		odd = odd * j;
        	} else {
        		even = even * j;
        	}
        }      
        if (odd != 0) {
        	if (even != 1) {
        		rez = (even / (odd * 1.0f));
        	} 
        }
        
        System.out.println("The answer is " + rez);
	}
}
