package by.htp.part01.block4;

/*
 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */
public class Ex05 {

	public static void main(String[] args) {
		int a = 12;
		int b = 56;
		int c = 98;
		sum(a, b, c);
	}

	public static void sum(int x, int y, int o) {		
		int max = 0;
		int min = 0;
		
		if (x > y && x > o) {
			max = x;
		}
		if (y > x && y > o) {
			max = y;
		}
		if (o > x && o > y) {
			max = o;
		}
		if (x < y && x < o) {
			min = x;
		} else if (y < x && y < o) {
			min = y;
		} else {
			min = o;
		}
		System.out.println(max + min + " - Сумма наименьшего и наибольшего");
	}
}