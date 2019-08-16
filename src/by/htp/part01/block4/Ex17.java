package by.htp.part01.block4;

/*
 * 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до  k.
 *  Для решения задачи использовать декомпозицию.
 */
public class Ex17 {

	public static void main(String[] args) {
	    int limit = 20192592;
	    
	    int[] mass = getArmstrongs(limit);
        print(mass);
	}
        public static int[] getArmstrongs(int limit) {
        	int[] mass;
        	int counter = 0;
        	    for(int i = 0; i < limit; i++) {
        	    	if (Math.pow(sum(i), lengtH(i)) == i) {  
        	    	counter++;
        	        }
        	    }
        	    	mass = new int[counter];
        	    	counter = 0;
        	    	for(int j = 0; j < limit; j++) {
            	    	if (Math.pow(sum(j), lengtH(j)) == j) {        	    	        	    	
            	    	mass[counter] = j;
            	    	counter++;
            	        }     
        	        }               
        	    return mass;
        }
        
        public static int lengtH(int n) {
        	int length = 0;
    		int i = n;
    		
    	    while (( n * 1.0 / 10) >= 0.1) {
    	    	length++;
    	    	n = (n / 10);	    	
    	    } 
    	    return length;
        }
        
        public static int sum(int i) { 	
			    int sum = 0;				
			    while (( i * 1.0 / 10) >= 0.1) {
			    	sum = sum + (i % 10);
			    	i = (i / 10);	    	
			    }			    
			return sum;
		}	        
        
        public static void print(int[] mas) {
        	//System.out.println(mas.length);
			for (int i = 0; i < mas.length; i++) {
				System.out.println(mas[i]);
			}
		}	 
}
        
