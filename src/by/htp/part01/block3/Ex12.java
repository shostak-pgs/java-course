package by.htp.part01.block3;

/*
 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте 
 * программу нахождения произведения первых 10 членов этой последовательности.
 */
public class Ex12 {

	public static void main(String[] args) {		
		int product = 1;
		int an = 1;

		for (int i = 2; i <= 10; i++) {
            an = 6 + an;			
			product = product + an;
		}
		System.out.println(product);
	}
}
