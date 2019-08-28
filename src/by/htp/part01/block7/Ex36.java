package by.htp.part01.block7;

/*
 * 36. Операция сглаживания матрицы дает новую матрицу того же размера,
 *  каждый элемент которой получается как среднее арифметическое соседей 
 *  соответствующего элемента исходной матрицы. Построить результат сглаживания
 *   заданной матрицы
 */
public class Ex36 {

	public static void main(String[] args) {
		double[][] arr = {{4, 6, 5, 7, 8, 5, 8} , {2, -2, -10, 4, 8, 5, 7} , {3, 3, -2, 3, 2, 5, 7}, {4, 6, 9, 5, 1, 5, 8}};
        
		print(smoothMatrix(arr));
	}
	
	public static double[][] smoothMatrix(double[][] array) {
		double[][] smArray = new double[array.length][array[0].length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {				
					smArray[i][j] = findElement(array, i, j);				
			}		
		}		
		return smArray;
	}
	
    public static double findElement(double[][] array, int i, int j) {
		double element = 0;
		
		if (i == 0 && j == 0) {
			element = (array[i][j + 1] + array[i + 1][j]) *1.0 / 2;
		
		} else if (i == (array.length - 1) && j == 0) {
			element = (array[i][j + 1] + array[i - 1][j]) * 1.0 / 2;
		
		} else if (i == (array.length - 1) && j == (array[0].length - 1)) {
			element = (array[i][j - 1] + array[i - 1][j]) / 2;;
		
		} else if (i == 0 && j == (array[0].length - 1)) {
			element = (array[i + 1][j] + array[i][j - 1]) / 2;
		
		} else if (i == 0 && j != 0) {
			element = (array[i][j + 1] + array[i][j - 1] + array[i + 1][j]) * 1.0 / 2;
		
		} else if (i == (array.length - 1) && j != 0) {
			element = (array[i][j - 1] + array[i][j + 1] + array[i - 1][j]) * 1.0 / 2;	
		
		} else if (i != 0 && j == 0) {
			element = (array[i][j + 1] + array[i + 1][j] + array[i - 1][j]) * 1.0 / 2;		
		
		} else if (i != 0 && j == (array[0].length - 1)) {
			element = (array[i - 1][j] + array[i + 1][j] + array[i][j - 1]) * 1.0 / 2;		
		
		} else if (i != 0 && j != 0 && i != (array.length - 1) && j != (array[0].length - 1)) {
			element = (array[i][j - 1] + array[i][j + 1] + array[i + 1][j] + array[i - 1][j]) * 1.0 / 2;		
		}
		
		return element;	    
    }
	
	private static void print(double[][] arr) {
		 for (double[] k1 : arr) {
				for(double s : k1) {
					System.out.printf("%6.2f ", s);
				}
				
				System.out.println("");				
		}
	}
}
