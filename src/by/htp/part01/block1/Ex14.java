package by.htp.part01.block1;

 /* 
 * 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
public class Ex14 {

	public static void main(String[] args) {
		int r = 10;
		double pi = 3.14;

		double s = pi * Math.pow(r, 2);

		double l = pi * 2 * r;

		System.out.println("Площадь круга = " + s);
		System.out.printf("Длина окружности = %.2f" ,l);
	}
}
