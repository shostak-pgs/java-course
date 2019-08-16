package by.htp.part01.block3;

/*
 * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше
 *  или равен заданному е. Общий член ряда имеет вид:
 */
public class Ex18 {

	public static void main(String[] args) {
		double sum = 0;
		double an;
		double e = 0.4;
		double mod;

		for (int n = 1; n <= 10 ; n++) {
			an = Math.pow(-1, n - 1) / n;		
			mod = Math.abs(an);		
		
			while (mod >= e) {
				sum = sum + an;	
				break;
			}			
		}
		System.out.println(sum);
	}
}
