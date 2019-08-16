package by.htp.part01.block2;

/*
 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел
 *  заменить половиной их суммы, а большее — их удвоенным произведением.
 */
public class Ex15 {

	public static void main(String[] args) {
		int x = 7;
		int y = 98;

		if (x < y) {
			System.out.println("х - меньшее из двух чисел");
			System.out.println(x = (x + y) / 2);
			System.out.println(y = 2 * x * y);
		} else {
			System.out.println(" у - меньшее из двух чисел");
			System.out.println(y = (x + y) / 2);
			System.out.println(x = 2 * x * y);
		}
	}
}
