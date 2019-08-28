package by.htp.part01.block06;

import java.util.Random;

/*
 * 4. Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить числа в порядке
 * возрастания. Для этого сравниваются два соседних числаai и ai+1. Если ai > ai+1, то делается перестановка. Так
 * продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм
 * сортировки, подсчитывая при этом количества перестановок.
 */
public class Ex04 {
	static int counter = 0; 
	
	public static void main(String[] args) {
		int n = 15;
		
		double[] arr = new double[n];
		
		print(sort(init(arr)));	
		System.out.println("Количество операций " + counter);
	}
	
	public static double[] init(double[] mass) {
		double[] mat = new double[mass.length];
		
		Random ran = new Random();
		for (int i = 0; i < mass.length; i++) {
			
				mat[i] =  (ran.nextInt(10) * 1.0) + ((ran.nextInt(10) * 1.0) / 100);
			}		
	    return mat;
	}
	
	public static double[] sort(double[] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j <mass.length - 1; j++) {
				if (mass[j] > mass[j + 1]) {
					double k = mass[j];
					mass[j] = mass[j + 1];
					mass[j + 1] = k;
					counter++;
				}
			}
		}
		return mass;
	}
	
	private static void print(double[] arr) {
		for (double s : arr) {
			System.out.printf("%4.1f ", s);
		}
		System.out.println("");		
    }
}
