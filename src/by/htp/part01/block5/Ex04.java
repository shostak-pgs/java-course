package by.htp.part01.block5;

/*
 * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она 
 * возрастающей.
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] numbers = {4, 6, 8, 10, 12, 14};
		int flag = 0;
		int dif = numbers[1] - numbers[0];

		for (int i = 0; i < numbers.length - 1; i++) {					
			if ((numbers[i + 1] - numbers[i]) > 1) {
				int dif1 = numbers[i + 1] - numbers[i];
				if (dif1 != dif) {
				    System.out.println("Последовательность не возрастающая");
				    flag = 1;
				    break;
			    } 
		    } else {
		    	System.out.println("Последовательность не возрастающая");
		    	flag = 1;
			    break;
		    }
	    }
		if (flag == 0) {
			System.out.println("Последовательность возрастающая");
		}
	}
}
