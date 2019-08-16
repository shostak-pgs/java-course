package by.htp.part01.block1;

/*
 * 26. Найти площадь треугольника, две стороны которого равны а и b,
 *  а угол между этими сторонами у
 */
public class Ex26 {
	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int angle = 45;
		double area;
		
		area = 0.5 * a * b * Math.sin((angle*Math.PI) / 180);
		System.out.printf("Area is %.2f", area);
				
	}
}
