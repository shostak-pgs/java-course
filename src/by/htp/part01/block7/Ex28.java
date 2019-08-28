package by.htp.part01.block7;

/*
 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
 *  какой столбец содержит максимальную сумму
 */
public class Ex28 {
    private static int position = 0;
	
	public static void main(String[] args) {
		int[][] arr = {{28, 3, 5, 7, 14} , {2, 2, 10, 2, 4} , {3, 3, 2, 3, 4}};
        int[] rez = new int[arr.length];
        int max;
        
        rez = columnSum(arr);        
        max = maxInColumn(arr);
        
        sout(rez);
        System.out.printf("Максисальная сумма элементов в %d столбце = %d", position, max);
	}
	
	public static int maxInColumn(int[][] arr) {
		int max = 0;
		
		int[] mas = columnSum(arr);		
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] > max) {
				max= mas[j];			
			}
		}
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] == max) {
				position = j + 1;			
			}
		}
		return max;
	}
	
	public static int[] columnSum(int[][] arr) {
		int[] mas = new int[arr[0].length];
		
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				mas[j] = mas[j] + arr[i][j];
			}
		}
		return mas;
	}	
	
	private static void sout(int[] arr) {
		for(int s : arr) {
			System.out.printf("%6d ", s);				
		}
		System.out.println("");
	}
}
