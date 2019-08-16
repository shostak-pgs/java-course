package by.htp.part01.block4;

/*
 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
 */
public class Ex10 {

	public static void main(String[] args) {
		int sumFactorial = 0;
		int factorial;

		for (int i = 1; i < 10; i = i + 2) {
			factorial = calcF(i);
			sumFactorial = sumFactorial + factorial;
		}
		System.out.println(sumFactorial);
	}

	public static int calcF(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;
	}
}