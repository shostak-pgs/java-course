package by.htp.part01.block5;

/*
 * 16. Даны действительные числа a1, a2, ... , an. Найти max(a1+a2n, a2+a2n-1, ..., an+an+1).
 */
public class Ex16 {

	public static void main(String[] args) {
		int[] mass = {23, 25, 18, 98, 10, 54, 78, 155, 4};
        int max = findMax(mass);
        
        System.out.println(max);
	}	
		
	public static int findMax(int[] mass) {
		int max = 0;
		int av = 0;
		
		if ((mass.length % 2) != 0) {
			av= mass[mass.length / 2];			
		}
		
		for (int i = 0; i < (mass.length / 2); i++) {
		int curr = mass[i] + (mass[mass.length - 1 - i]);		
		    if (curr > max) {
		    	max = curr;
		    }
	    }
		if (max < av) {
		max = av;
		}
		return max;
    }
	
}


