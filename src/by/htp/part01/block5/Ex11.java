package by.htp.part01.block5;

/*
 * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, 
 * у которых остаток от деления на М равен L (0 < L < М-1).
 */
public class Ex11 {

	public static void main(String[] args) {
        int m = 6;
        int l = 3;
        int[] mass = {34, 78, 96, 42, 12, 98, 39, 91, 45};
        
        if ((l > 0) && (l < (m - 1))) {
        	System.out.println("Искомые числа: ");
        	for (int i = 0; i < mass.length; i++) {
        		if (((mass[i] % m)) == l) {
        			System.out.print(mass[i] + " ");
        		}
        	}
        }
        
	}
}
