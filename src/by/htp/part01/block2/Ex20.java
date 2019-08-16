package by.htp.part01.block2;

/*
 * 20. Определить, делителем каких чисел а, b, с является число k.
 */
public class Ex20 {

	public static void main(String[] args) {		
		int a = 8;
		int b = 9;
		int c = 12;
		int k = 4;

		if (a % k == 0) {
			System.out.println("к - делитель числа а");
		}

		if (b % k == 0) {
			System.out.println("к - делитель числа b");
		}
		
		if (c % k == 0) {
			System.out.println("к - делитель числа c");
		}
	}
}
