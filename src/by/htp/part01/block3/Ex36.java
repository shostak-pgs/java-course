package by.htp.part01.block3;

/*
 * 36.  Два  двузначных  числа,  записанных  одно  за  другим  ,  образуют  четырёхзначное  число,  которое 
делится на их произведение. Найти эти числа.
 */
public class Ex36 {

	public static void main(String[] args) {
		int prod;
		int xy;
	    for (int x = 10; x < 100; x++) {  		
		    for (int y = 10; y < 100; y++) { 
		        prod = x * y; 		 
		        xy = 100 * x + y;		
		        if ((xy % prod) == 0) { 
		              System.out.printf("x = %d, y = %d\n", x, y); 
		        } 
		    } 
		} 
	}
}
