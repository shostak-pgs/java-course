package by.htp.part01.block5;

/*
 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов
 */
public class Ex08 {

	public static void main(String[] args) {
		int[] mass = { 0, 78, 56, -3, 7, -3, 98, 0 };
		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				countZero++;
			} else if (mass[i] > 0) {
				countPositive++;
			} else if (mass[i] < 0) {
				countNegative++;
			}
		}
		System.out.println("Количество нулевых элементов = " + countZero);
		System.out.println("Количество отрицательных элементов = " + countNegative);
		System.out.println("Количество положительных элементов = " + countPositive);
	}
}
