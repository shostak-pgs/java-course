package by.htp.part01.block3;

/*
 * 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
диапазоне от 1 до 99 включительно.
 */
public class Ex05 {

	public static void main(String[] args) {
		int i = 0;
		int sumResult = 0;

		while (i <= 49) {
			int n = 2 * i + 1;
			i++;
			sumResult = sumResult + n;
		}
		System.out.println(sumResult);
	}
}
