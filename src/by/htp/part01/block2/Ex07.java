package by.htp.part01.block2;

/*
 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */
public class Ex07 {

	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		int c = -12;
		int x = 23;

		int z = Math.abs((a * x * x) + (b * x) + c);

		System.out.println("Модуль выражения a * x * x + b * x + c = " + z);

	}
}
