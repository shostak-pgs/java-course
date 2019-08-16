package by.htp.part01.block1;

/*
 * 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */
public class Ex08 {

	public static void main(String[] args) {
		int a = 12;
		int b = 23;
		int c = 12;

		double z = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Значение выражения = " + z);
	}
}
