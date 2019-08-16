package by.htp.part01.block3;

/*
 * 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
 *  Преобразовать его в другое число, цифры которого будут следовать в обратном порядке
 *   по сравнению с введенным числом.
 */
public class Ex24 {

	public static void main(String[] args) {
		int a = 21364;
		int copy = a;
        String str = "" + a;
        int sum = 0;
        int number;
        int mir = 0;
        
		for(int i = 0; i < str.length(); i++) {
			number = (copy % 10);
			copy = copy / 10;
		    if ((number % 2) == 0) {
		    	sum = sum + number;
		    }			
		}
		
		for (int i = 0; i < str.length(); i++) {
			number = (a % 10);
			a = a / 10;
			mir = mir + number * (int) (Math.pow(10, (str.length() - i - 1)));
		}
		
		System.out.printf("Сумма четных цифр = %d, число зеркальное данному = %d", sum, mir);
	}
}
