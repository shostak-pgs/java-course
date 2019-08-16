package by.htp.part01.block3;

import java.math.BigInteger;
/*
 * 25. Требуется определить факториал числа, которое ввел пользователь. 
 * 
 */
public class Ex25 {

	public static void main(String[] args) {
		int n = 34;
		long factorial = 1L;
		BigInteger rez = BigInteger.valueOf(factorial);
		
		for(long i = 1; i <= n; i++) {
			BigInteger bigI = BigInteger.valueOf(i);
		    rez = rez.multiply(bigI);// * i;
		}
		
		System.out.println(rez);
	}
}
