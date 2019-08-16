package by.htp.part01.block3;

/*
 * 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше
 *  или равен заданному е. Общий член ряда имеет вид:
 */
public class Ex20 {

	public static void main(String[] args) {
		double sum = 0;
		double an;
		double e = 0.01;
		double mod;

		for (int n = 1; n <= 10 ; n++) {
			an = 1 / (((3 * (double) n) - 2) * ((3 * n) + 1));		
			mod = Math.abs(an);
			System.out.println(an);
		
			while (mod >= e) {
				sum = sum + an;	
				break;
			}			
		}
		System.out.println("Сумма искомых членов ряда равна = " + sum);
	}
}
