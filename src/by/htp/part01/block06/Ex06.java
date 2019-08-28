package by.htp.part01.block06;

import java.util.Random;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается
 * это следующим образом: сравниваются два соседних элемента ai  и ai +1 . Если ai < ai+1 то продвигаются на один
 * элемент вперед. Если ai < ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить
 * алгоритм этой сортировки.
 */
public class Ex06 {

	public static void main(String[] args) {
	int[] arr = new int[15];
	arr = sort(init(arr));
	print(arr);
	}
	
	public static int[] sort(int[] arr){
        int incr;
        
        for (incr = arr.length / 2; incr >= 1; incr = incr / 2) {
        	
        	for (int i = 0; i < incr; i++) {
        		
        		int help;
        		
        		for (int j = i; j < arr.length - 1; j = j + incr) {
        			int k;
        			if ((j + incr) < (arr.length - 1)) {
        				k = j + incr;
        			} else {
        				k = arr.length-1;
        			}
        			
        			for (; k - incr >= 0; k = k-incr) {
        				 
        				if (arr[k - incr] > arr[k])
        	                {
        	                    help = arr[k];
        	                    arr[k] = arr[k-incr];
        	                    arr[k-incr] = help;
        	                }
        	                else break;
        			}
        		}
        	}
        }
		   return arr;
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
	}
}
