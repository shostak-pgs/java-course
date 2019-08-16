package by.htp.part01.block1;

/*
 * 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */
public class Ex10 {

	public static void main(String[] args) {		
		double d1 = 30.0;
		double x = Math.toRadians(d1);
		double d2 = 45.0;
		double y = Math.toRadians(d2);
		
		double z = ((Math.sin(x) + Math.acos(y)) / (Math.acos(x) - Math.sin(y))) * Math.tan(x * y);
		
		System.out.println(z);
	}
}
