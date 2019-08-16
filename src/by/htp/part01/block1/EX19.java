package by.htp.part01.block1;

/*
 * 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
и описанной окружностей.
 */
public class EX19 {

	public static void main(String[] args) {
		int l = 8;

		double s = Math.pow(l, 2) * Math.sqrt(l) / 4;

		double r = l * Math.sqrt(3) / 6;

		double rBig = l * Math.sqrt(3) / 3;

		double h = l * Math.sqrt(3) / 2;

		System.out.printf("Площадь равностороннего треугольника = %.4f%n", s);
		System.out.printf("Радиус вписанной окружности = %.4f%n", r);
		System.out.printf("Радиус описанной окружности = %.4f%n", rBig);
		System.out.printf("Высота равностороннего треугольника = %.4f%n", h);
	}
}
