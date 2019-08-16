package by.htp.part01.block1;

/*
 * 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */
public class Ex29 {
	public static void main(String[] args) {
	double a = 3;
	double b = 4;
	double c = 5;
	int gradab;
	int gradbc;
	int gradca;
	double radab;
	double radbc;
	double radca;
	
	radab = Math.acos(((a * a *1.0) + (b * b) - (c * c * 1.0)) / (2 * a * b));
    gradab = (int) ((radab * 180) / Math.PI);
    
    radbc = Math.acos(((c * c) + (b * b) - (a * a)) / (2 * c * b));
    gradbc = (int) ((radbc * 180) / Math.PI);
       
    radca = Math.acos(((c * c) + (a * a) - (b * b)) / (2 * c * a));
    gradca = (int) ((radca * 180) / Math.PI);
    
    System.out.printf("Angles in degrees of the triangle are %d, %d, %d %n", gradab, gradbc, gradca);
    System.out.printf("Angles in radians are %.2f, %.2f, %.2f", radab, radbc, radca);
	}
}
