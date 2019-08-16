package by.htp.part01.block3;

/*
 * 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
включительно.
 */
public class Ex04 {

	public static void main(String[] args) {		
		int i = 0;

		while (i <= 49) {
			i++;
			int n = i * 2;
			System.out.println(n);
		}
	}
}
