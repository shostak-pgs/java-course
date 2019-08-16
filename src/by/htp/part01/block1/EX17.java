package by.htp.part01.block1;

/*
 * 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */
public class EX17 {

	public static void main(String[] args) {		
		int i = 2;
		int s = - 5;
		int st = 3;
		
		double z = ((Math.pow(i, st) + Math.pow(s, st)) / 2);
		
		double m = Math.sqrt(Math.abs( i * s ) );
		
		System.out.println("Среднее арифметическое кубов данных чисел = " + z);		
		System.out.printf("Среднее геометрическое модулей данных чисел = %.4f%n", m);
	}
}
