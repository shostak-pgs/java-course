package by.htp.part01.block2;

/*
 * 32.  Написать программу, которая по заданным трем числам определяет, является ли 
 * сумма каких-либо двух из них положительной
 */
public class Ex32 {

	public static void main(String[] args) {
		int a = 32;
		int b = -93;
		int c = -32;
		boolean isTrue = false;
		
		if ((a + b) > 0) {
			System.out.println("Сумма a + b положительная");
		} else if ((a + c) > 0) {
			isTrue = true;
			System.out.println("Сумма a + c положительная");
		} else if ((b + c) > 0) {
			System.out.println("Сумма b + c положительная");
		} else {
			System.out.println("Сумма всех возможных комбинаций отрицательна");
		}       
	}
}
