package by.htp.part01.block1;

/*
 * 13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3).
 * Найти его периметр и площадь.
 */
public class Ex13 {
	public static void main(String[] args) {
		double xa = 3;
		double xb = 5;
		double xc = 9;
		double ya = 3;
		double yb = 5;
		double yc = 9;
		double a;
		double b;
		double c;

		double sqa;
		double per;

		a = Math.sqrt(Math.pow((xc - xb), 2) + Math.pow((yc - yb), 2));
		b = Math.sqrt(Math.pow((xc - xa), 2) + Math.pow((yc - ya), 2));
		c = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
		per = a + b + c;
		sqa = Math.sqrt(per * (per - a) * (per - b) * (per - c));

		System.out.printf("Square = %.2f, Perimeter = %.2f", sqa, per);
	}
}
