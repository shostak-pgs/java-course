package by.htp.part01.block4;

/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше  цифр
 */
public class Ex14 {

	public static void main(String[] args) {		
        int m = 3943833;
        int n = 495538;
        
        if (init(m) > init(n)) {
        	System.out.println("Первое число больше");
        } else if (init(m) < init(n))  {
        	System.out.println("Первое число меньше");
        } else {
        	System.out.println("Числа равны");
        }
	}
	
	public static int init(int n) {		
		int k = 0;
		
	    while (( n * 1.0 / 10) >= 0.1) {
	    	k++;
	    	n = (n / 10);	    	
	    }
	    return k;
	}
}
