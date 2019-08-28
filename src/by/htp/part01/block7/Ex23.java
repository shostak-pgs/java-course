package by.htp.part01.block7;

/*
 *23. Сформировать квадратную матрицу порядка N по правилу: A (I,J) = sin((I2 - J2) / N) и подсчитать
 * количество положительных элементов в ней. 
 */
public class Ex23 {
    public static int n = 4;
	
    public static void main(String[] args) {
    	int count = 0;
    	double[][] arr = new double[n][n];
	    for (int i = 0; i < n; i++) {
	    	for(int j = 0; j < n; j++) {
	    		arr[i][j] = getElement(i, j, n);
	    		if (arr[i][j] >=0.0) {
	    			count++;
	    		}    		
	    	}
	    }
	    for (double[] k: arr) {
			for(double s : k) {
				System.out.printf("%8.3f ", s);
			}
			System.out.println("");
		}	
	    System.out.println("Количество положительных элементов = " + count);
	}
    
	public static double getElement(int i, int j, int n) {
		double element = Math.sin(((i * i * 1.0) - (j * j * 1.0)) / n);
		return element;
	}
}
