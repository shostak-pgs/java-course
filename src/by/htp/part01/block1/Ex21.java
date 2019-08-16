package by.htp.part01.block1;

/*
 * 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */
public class Ex21 {

	public static void main(String[] args) {
		double i = 123.406;

		double s = (int) i / 1000.0 + (i - (int) i) * 1000;

		System.out.printf("%.3f", s);
	}
}
