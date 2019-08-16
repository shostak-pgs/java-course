package by.htp.part01.block3;

/*
 * 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
 * суммирует все числа от 1 до введенного пользователем числа.
 */
public class Ex06 {

	public static void main(String[] args) {
		int enterNumber = 5;
		int i;
		int sum = 0;

		for (i = 1; i <= enterNumber; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
