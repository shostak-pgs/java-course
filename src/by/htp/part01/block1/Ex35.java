package by.htp.part01.block1;

/*
 * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части
 *  и младшую цифру целой части числа M/N.
 */

public class Ex35 {
	public static void main(String[] args) {
		double m = 1237;
		double n = 41;
        int highter;
        int lower;
        
        lower = (int) (m / n) % 10;
        highter = (((int)((m*10)/n))%10);
		
        System.out.printf("M / N = %f %n", (m / n));
        System.out.printf("The highter number is %d, the lower is %d", highter, lower);
	}
}
