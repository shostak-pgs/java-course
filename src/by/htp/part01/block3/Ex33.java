package by.htp.part01.block3;

/*
 * 33. Найдите наибольшую цифру данного натурального числа.
 */
public class Ex33 {

	public static void main(String[] args) {	
        int number =  562754;
        int current;
        int max = 0;;
        
        while ((number / 10) > 1) {
        	current = (number % 10);
        	number = number / 10;
        	if (current > max) {
        		max = current;
        	}
        }
        System.out.println("Максимальное цифра = " + max);
	}
}
