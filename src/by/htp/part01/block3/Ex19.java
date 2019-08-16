package by.htp.part01.block3;

/*
 * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых 
 * больше или равен заданному е. Общий член ряда имеет вид:an = (1 / 2n) + (1 / 3n);
 */
public class Ex19 {

	public static void main(String[] args) {
		double sum = 0;
		double an;
		double e = 0.4;
		double mod;

		for (int n = 1; n <= 10 ; n++) {
			an = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));		
			mod = Math.abs(an);		
		
			while (mod >= e) {
				sum = sum + an;	
				break;
			}			
		}
		System.out.println("Сумма искомых членов ряда равна = " + sum);
	}
}
