package by.htp.part01.block1;

/*
 * 16. Найти произведение цифр заданного четырехзначного числа.
 */
public class Ex16 {

	public static void main(String[] args) {
		int i = 1234;

		int i1 = i % 10;

		int i2 = i % 100 / 10;

		int i3 = i % 1000 / 100;

		int i4 = i / 1000;

		int result = i1 * i2 * i3 * i4;

		System.out.println("Произведение цифр числа 1234 = " + result);
	}
}
