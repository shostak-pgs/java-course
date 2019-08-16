package by.htp.part01.block1;

/*
 * 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
 *  получить значение а8 за три операции и  а10 за четыре операции.
 */
public class Ex27 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c;
		
		a = a * a;
		a = a * a;
		a = a * a;
		
		c = b * b;
		b = c * c;
		b = b * b;
		b = b * c;
				
		System.out.printf("The answers are %d, %d", a, b);				
	}
}
