package by.htp.part01.block06;

import java.util.Random;

/*
 * 5. Сортировка вставками. Дана последовательность чисел a1, a2, an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2, ai - упорядоченная последовательность, т. е.
 * а1 < a2 < an. Берется следующее число ai+1и вставляется в последовательность так, чтобы новая последовательность 
 * была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны.
 *  Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
 *  Двоичный поиск оформить в виде отдельной функции.
 */
public class Ex05 {
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
		for (int curr = 0; curr < mass.length; curr++) {
			double help = mass[curr];
			int j;
			for (j = curr - 1; j >= 0; j--) {
				
				if (help < mass[j]) {
					mass[j] = mass[j + 1];
					counter++;
				} else {
					break;
				}
			}
			mass[j + 1] = help;
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

