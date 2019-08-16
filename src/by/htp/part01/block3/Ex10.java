package by.htp.part01.block3;

import java.math.BigInteger;

/*
 *10. Составить программу нахождения произведения квадратов первых двухсот чисел. 
 */
public class Ex10 {
    public static void main(String[] args) {    	
		long proizv = 1L;
		BigInteger rez = BigInteger.valueOf(proizv);
		
		for(long i = 1; i <= 200; i++) {
			BigInteger bigI = BigInteger.valueOf(i);
		    rez = rez.multiply(bigI).multiply(bigI);// * i;
		}
		
		System.out.println(rez);
	}
}
    
    	