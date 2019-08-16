package by.htp.part01.block2;

/*
 * 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
равносторонним.
 */
public class Ex09 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 11;

		if ((a == b) & (b == c)) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
	}
}
