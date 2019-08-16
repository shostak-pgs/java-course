package by.htp.part01.block2;

/*
 * 28. Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d —c).
 */
public class Ex28 {

	public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 0;;
        int d = 7;
        int max;
        
        if((a != d) && (b != d) && (c != d)) {
            max = (d - a);
            if ((d - b) > max) {
        	    max = d - b;
            } else if ((d - c) > max) {
            	max = d - c;
            }
        System.out.printf("Максимальное значение выражения = %d", max);
        }
        else if (a == d) {
        	System.out.println("a = d");
        } else if (b == d) {
        	System.out.println("b = d");
        } else if (c == d) {
        	System.out.println("c = d");
        }
	}

}
