package by.htp.part01.block06;

import java.util.Random;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел a1 < a2 <...an и b1 < b2 <... bm.Требуется указать 
 * те места, на которые нужно вставлять элементы последовательности b1 - bm в первую последовательность так, чтобы 
 * новая последовательность оставалась возрастающей.
 */
public class Ex07 {

	public static void main(String[] args) {
		int n = 10;
		int m = 5;
		
		int[] arrA = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] arrB = {3, 6, 9, 12, 17};
		int[] rez = new int[m + n];
		int[] poz = new int[m];
		
		
		poz= compoundPosition(arrA, arrB, rez);
		System.out.println("Исходный массив:");
		print(arrA);
		System.out.println("Вставляемый массив:");
		print(arrB);
		System.out.println("Результатирующий массив:");
		print(rez);
		System.out.println("Позиции подстановки:");
		print(poz);

	}
	
	public static int[] compoundPosition(int[] mass1, int[] mass2, int[] rez) {
		System.arraycopy(mass1, 0, rez, 0, mass1.length);		
		int counter = 0;
		int[] poz = new int[mass2.length];
		
		for (int i = 0; i < mass2.length; i++) {
			int curr = mass2[i];
			for(int j = 0; j < rez.length - 1; j++) {
				if (rez[j + 1] >= mass2[i] && rez[j] < mass2[i]) {
					for ( int k = mass1.length + counter; k > j + 1; k--) {
						int tmp = rez[k];
						rez[k] = rez[k - 1];
						rez[k - 1] = tmp;
						poz[counter] = j + 1;
						
					}
					counter++;
					rez[j + 1] = mass2[i];
					break;
				}
			}
		}
		return poz;
	}
	
	public static int[] init(int[] mass) {
		Random ran = new Random();
		int i = 0;
		
		while (i < mass.length) {
			mass[i] = ran.nextInt(20);
			i++;
		}
		return mass;
	}
	
	public static void print(int[] arr) {		
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
