package by.htp.part01.block06;

import java.util.Random;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 *  при этом не используя дополнительный массив.
 */
public class Ex01 {

	public static void main(String[] args) {
		int k = 4;
		
		double[] mass1 = new double[15];
		double[] mass2 = new double[8];
		double[] rez = new double[mass1.length + mass2.length];
		
		mass1 = init(mass1);
		mass2 = init(mass2);
		
		for(int i = 0; i < rez.length; i++) {
			if (i <= (k - 1)) {
				rez[i] = mass1[i];
			} else if ((i > (k - 1)) && (i < k + mass2.length)) {
			    rez[i] = mass2[i - k];
		    } else {
		    	rez[i] = mass1[i - mass2.length];
		    }
		}
		System.out.println("Массив 2:");
		print(mass1);
		System.out.println("Массив 2:");
		print(mass2);
		System.out.println("Расширенный массив:");
		print(rez);
	}
	
	public static double[] init(double[] mass) {
		double[] mat = new double[mass.length];
		
		Random ran = new Random();
		for (int i = 0; i < mass.length; i++) {
			
				mat[i] =  (ran.nextInt(10) * 1.0) + ((ran.nextInt(10) * 1.0) / 100);
			}		
	    return mat;
	}
	
	private static void print(double[] arr) {
			for (double s : arr) {
				System.out.printf("%4.1f ", s);
			}
			System.out.println("");		
	}
}
