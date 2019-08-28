package by.htp.part01.block7;

/*
 * 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Ex33 {

	public static void main(String[] args) {	
		int[][] arr = {{11, 2, 36, 4, 5} , {2, -29, -10, -2, 4} , {1, 2, 3, 4, 5} , {3, 38, -2, 3, -4}};
        int[][] rez = sort(arr);
        print(rez);
        System.out.println("");
        System.out.println("");
        print(reverseSort(arr));
	}
	
	public static int[][] sort(int[][] array) {			
		
		for (int j = 0; j < array[0].length; j++) {
			int[] helpArr = new int[array.length];
		    for (int i = 0; i < array.length; i++) {	
		    	helpArr[i] = array[i][j];		    	
		    }
				helpArr = sortLine(helpArr);
				for (int k = 0; k < helpArr.length; k++) {
					array[k][j] = helpArr[k];
				}
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
		
    	for (int j = 0; j < array[0].length; j++) {
			int[] helpArr = new int[array.length];
		    for (int i = 0; i < array.length; i++) {	
		    	helpArr[i] = array[i][j];		    	
		    }
				helpArr = reverseSortLine(helpArr);
				for (int k = 0; k < helpArr.length; k++) {
					array[k][j] = helpArr[k];
				}
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
