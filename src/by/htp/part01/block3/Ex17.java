package by.htp.part01.block3;

/*
 * 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */
public class Ex17 {

	public static void main(String[] args) {
		int a = 2;
		int n = 4;
		int rez = 1;
		
		for (int i = 1; i <= n; i++) {
			rez = rez * (a + (i - 1));
		}
        System.out.println("Сумма ряда = " + rez);
	}
}
