package by.htp.part01.block1;

/*
 * 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */
public class Ex18 {

	public static void main(String[] args) {		
		int r = 5;
		int i = 2;
		int i2 = 3;
		
		double s = Math.pow(r, i);
		
		double s1 = Math.pow(r, i2);
		
		double v = 6 * Math.pow(r, i);
		
		System.out.println("Площадь грани куба = "+ s);
		System.out.println("Обьем куба = "+ s1);
		System.out.println("лощадь поверхности куба = "+ v);
	}
}
