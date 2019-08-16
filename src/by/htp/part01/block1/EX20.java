package by.htp.part01.block1;

/*
 * 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */
public class EX20 {

	public static void main(String[] args) {
		int l = 7;
		double pi = 3.14;

		double r = l / 2 * pi;

		double s = pi * Math.pow(r, 2);

		System.out.println("Порщадь круга = " + s);
	}
}
