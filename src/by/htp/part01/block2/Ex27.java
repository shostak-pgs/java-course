package by.htp.part01.block2;

/*
 * 27. Найти max{min(a, b), min(c, d)}.
 */
public class Ex27 {

	public static void main(String[] args) {
		int a = 7;
		int b = 11;
		int c = 9;
		int d = 12;
		int min1;
		int min2;
		
		min1 = (a > b) ? b : a;	
		min2 = (c > d) ? d : c;
		
		System.out.printf("Максимальное число = %d", ((min1 > min2) ? min1 : min2));
	}
}
