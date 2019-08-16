package by.htp.part01.block5;

/*
 * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 *  порядковые номера которых являются простыми числами.
 */
public class Ex12 {

	public static void main(String[] args) {
		float sum = 0f;
		float[] mass = {23.9f, 34.7f, 69.2f, 87.2f, 56.2f, 98.2f, 78.4f};
		
		for (int i = 0; i < mass.length; i++) {
			if (i == 0) {
				continue;
			}
			if (isSimple(i) == true) {
				sum = sum + mass[i];
			}
		}
		
		System.out.printf("Сумма чисел = %.2f", sum);        
	}
	
	public static boolean isSimple(int num) {
		boolean isSimple = true;
		
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				isSimple = false;
			} 
		}
		return isSimple;
	}	
	
}
