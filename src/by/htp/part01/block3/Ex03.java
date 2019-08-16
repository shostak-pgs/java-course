package by.htp.part01.block3;

/*
 * 3. Необходимо вывести на экран таблицу умножения на 3
 */
public class Ex03 {

	public static void main(String[] args) {
		int i;

		for (i = 1; i < 11; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		for (i = 1; i < 11; i++) {
			System.out.printf("%4d", (i * 3));
		}
	}
}
