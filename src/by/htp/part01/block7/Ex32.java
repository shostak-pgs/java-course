package by.htp.part01.block7;

import java.util.Random;

/*
 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Ex32 {

	public static void main(String[] args) {
		int[][] arr = {{11, 2, 36, 4, 5} , {2, -29, -10, -2, 4} , {3, 38, -2, 3, -4}};
        int[][] rez = sort(arr);
        print(rez);
        System.out.println("");
        System.out.println("");
        print(reverseSort(arr));
	}
	
	public static int[][] sort(int[][] array) {		
				
		for (int i = 0; i < array.length; i++) {
				array[i] = sortLine(array[i]); 								
			}		
		return array;
	}	
	
	public static int[] sortLine(int[] mass) {		
		    int position = 0;
		    
		for (int i = 0; i < mass.length; i++) {
			int max = mass[position];
			int curr = position;
			for (int j = position; j < mass.length; j++) {
				if (mass[j] > max) {
					max = mass[j];
					curr = j;
				}
			}
			int k = mass[i];
			mass[i] = max;
			mass[curr] = k;
			position++;
		}
		return mass;
	}
	
    public static int[][] reverseSort(int[][] array) {		
		
		for (int i = 0; i < array.length; i++) {
				array[i] = reverseSortLine(array[i]); 								
			}		
		return array;
	}

    public static int[] reverseSortLine(int[] mass) {		
        int position = 0;
    
        for (int i = 0; i < mass.length; i++) {
	        int min = mass[position];
	        int curr = position;
	        for (int j = position; j < mass.length; j++) {
		        if (mass[j] < min) {
			        min = mass[j];
			        curr = j;
		        }
	        }
	        int k = mass[i];
	        mass[i] = min;
	        mass[curr] = k;
	        position++;
        }
        return mass;
    }
	
	private static void print(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%4d ", s);
				}
				
				System.out.println("");				
		}
	}
}
