package by.htp.part01.block2;

/*
 * 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним
 *  и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
 */
public class Ex17 {

	public static void main(String[] args) {
		int m = 90;
		int n = 90;

		if (m != n && m > n) {
			n = m;
			System.out.println(n);
			System.out.println(m);
		} else if (m != n && n > m) {
			m = n;
			System.out.println(m);
			System.out.println(n);
		} else if (m == n) {
			System.out.println(m = 0);
			System.out.println(n = 0);
		}
	}
}
