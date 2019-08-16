package by.htp.part01.block3;

/*
 * 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */
public class Ex16 {

	public static void main(String[] args) {		
		int a = 1;
		long b = 1;
		for (int i = 2; i < 11; i++) {
			a = a + i;			
			b = b * a;			
		}
		System.out.println(b);
	}
}
