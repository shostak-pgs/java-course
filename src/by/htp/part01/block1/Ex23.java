package by.htp.part01.block1;

/*
 * 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
 */
public class Ex23 {

	public static void main(String[] args) {
		int r = 8;
		int rBig = 23;

		double s = 3.14 * rBig * rBig - 3.14 * r * r;

		System.out.println(s);
	}
}
