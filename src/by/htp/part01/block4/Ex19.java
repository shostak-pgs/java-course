package by.htp.part01.block4;

/*
 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить 
также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Ex19 {

	public static void main(String[] args) {
		int n = 4;
		long sumOdd = 0;
		int even = 0;
		if(n <= 9 && n >=2) {
			sumOdd = sumOdd(n);
			even = numOfEven(sumOdd);
	    } else {
	    	System.out.println("Некорректный ввод");
	    }	    
		
		print(sumOdd, even);		
	}
	
	public static void print(long num1, int num2) {
		System.out.printf("Сумма нечетных чисел = %d, в которой содержится %d четных цифр", num1, num2);
	}
	
	public static int numOfEven(long sumOdd) {
		int num = 0;
		while (((double) sumOdd / 10) >=0.1) {
			if (((((sumOdd % 10)) % 2) == 0) && ((sumOdd % 10) != 0)) {
				num++;
			}			
			sumOdd = (sumOdd / 10);
		}
		return num;
	}

	public static long sumOdd(int n) {
		int start = (int) Math.pow(10,(n - 1));
		int end = 0;
		long sum = 0l;
		
		for (int j = (n - 1); j >=0; j--) { 
			end = end + (int) Math.pow(10,j) * 9;
		}
		
		for (int i = start; i <= end; i++) {		   
		    int checked = i;
		    boolean isOdd = true;
			for (int j = (n - 1); j >=0; j--) { 								
		    	if(((checked % 10) % 2) != 0) {
		    		checked = checked / 10;
		    	} else {
		    		isOdd = false;
		    		break;
		    	}		    
		    } 
		    if (isOdd == true) {				
		    	sum = sum + i;
		    }
		
	    }
		return sum;		
    }  
}
