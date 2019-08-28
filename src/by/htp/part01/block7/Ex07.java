package by.htp.part01.block7;

/*
 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов
 */
public class Ex07 {

	public static void main(String[] args) {

		int n = 5;
		int[][] mass = new int[n][n];
		int sum = 0;
		
		for (int i = 0; i < mass.length; i++) {
			
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (i - 2) * (j + 1);
				
				if (mass[i][j] < 0 && mass[i][j] % 2 != 0) {
					sum = Math.abs(mass[i][j]) + sum;
				}
			}
		}
		System.out.println("Сумма модулей отрицательных нечетных элементов = " + sum);
	}
}
