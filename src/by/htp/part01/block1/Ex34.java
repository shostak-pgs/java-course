package by.htp.part01.block1;

/*
 * 34.  Дана величина  А,  выражающая объем информации в байтах.  Перевести  А
 *   в более крупные единицы  измерения информации.
 */
public class Ex34 {
	public static void main(String[] args) {
	    long a=936854775806L;
	    int b = 0;
	    int kilo = 0;
	    int mega = 0;
	    int giga = 0;
	    int tera = 0;
	    
	    if (a < 999999999999L) {
	       tera = (int) ((a % Math.pow(10, 12))/(Math.pow(10, 9)));
	       giga = (int) ((a % Math.pow(10, 9))/(Math.pow(10, 6)));
	       mega = (int) ((a % Math.pow(10, 6))/(Math.pow(10, 3)));
	       kilo = (int) ((a % Math.pow(10, 3)));
	       b = (int) (a % Math.pow(10, 3));
	    } else {
	    	System.out.println("Your number is out of range(");
	    }
	    
	    System.out.printf("This Data-file size is %d TB, %d GB, %d MB, %d KB, %d byte", tera, giga, mega, kilo, b);
	}
}
