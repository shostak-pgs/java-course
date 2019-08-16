package by.htp.part01.block4;

/*
 * 16. Два простых числа называются «близнецами», если они отличаются друг от друга  на 2
 *  (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], 
 *  где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Ex16 {

	public static void main(String[] args) {		
        int n = 10;
        
        int[] mass = getDoubles(n);
        print(mass);
	}
        public static int[] getDoubles(int n) {
        	int[] mass = new int[(2 * n) - 2];
        	int counter = 0;
        	    for(int i = n; i <= ((2 * n) - 2); i++) {
        	    	mass[counter] = i;
        	    	mass[counter + 1] = (i + 2);
        	    	counter = counter+2;
        	    }   
        	    
        	return mass;
        } 
        
        public static void print(int[] mas) {
        	
			for (int i = 0; i <= mas.length - 2; i = i + 2) {
				System.out.printf("%d - %d%n", mas[i], mas[i + 1]);
			}
		}	 
}
