package by.htp.part01.block2;

/*
 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */
public class Ex08 {

	public static void main(String[] args) {
		int a = 34;
		int b = 23;

		if ((a * a) < (b * b)) {
			System.out.println("Наименьший квадрат из числа " + a);
		} else if ((b * b) < (a * a)) {
			System.out.println("Наименьший квадрат из числа " + b);
		}
	}
}
