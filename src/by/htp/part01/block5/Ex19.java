package by.htp.part01.block5;

/*
 * 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */
public class Ex19 {
    
	
	public static void main(String[] args) {
		int times;
	    int n = 15;
	    int min;
	   
	    int[] arr1 = {5, 6, 1, 1, 5, 0, 0, 0};
	    times = getTimes(arr1);
	    int[] repeated = getRepeated(arr1, times);
	    min = repeated[0];
	    
	    for (int k = 0; k < repeated.length; k++) {	    	    	
	    	if ((repeated[k] < min) && (repeated[k] != 0)) {
	    		min = repeated[k];	    	    
	    	}
	    }
	    
	    System.out.println(min);

	}
	
	public static int getTimes(int[] arr1) {
		int times = 0;
		int currentTimes = 0;
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr1[i]) {
					currentTimes++;
				}
			}			
			if (currentTimes > times) {
				times = currentTimes;				
			}			
			currentTimes = 0;
		}
		return times;
	}
	
	public static int[] getRepeated(int[] arr1, int times) {		
		int currentTimes = 0;
		int counter = 0;
		int[] reps = new int[arr1.length];	
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr1[i]) {
					currentTimes++;					
				}
			}	
			//System.out.println(reps.length);
			if (currentTimes == times) {
				reps[counter] = arr1[i];
				counter++;
			}			
			currentTimes = 0;
		}
		return reps;
	}
	
	
}
