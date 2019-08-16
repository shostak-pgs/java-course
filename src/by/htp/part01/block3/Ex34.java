package by.htp.part01.block3;

/*
 * 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15
 */
public class Ex34 {

	public static void main(String[] args) {	    
       
        for (int i = 1000; i <= 9999; i++) {
        	int current;
        	double ii = i;
        	int sum = 0;
        	while ((ii / 10) >= 0.1) {
            	current = (int) (ii % 10);   
            	ii = ii / 10;
            	sum = sum + current;      	
            }
        	if (sum == 15) {
        		System.out.println(i + " ");
        	} 
        }
	}
}
