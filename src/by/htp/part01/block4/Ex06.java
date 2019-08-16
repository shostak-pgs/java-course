package by.htp.part01.block4;

/*
 * 6. Вычислить площадь правильного шестиугольника со стороной а, 
 * используя метод вычисления площади треугольника
 */
public class Ex06 {

	public static void main(String[] args) {
		int a = 4;
		area(a);
	}

	public static void area(int x) {
        double area = 6 * x * x * Math.sqrt(3) / 4;
	    System.out.printf("Площадь правильного шестиугольника = %.3f", area);
	}
}