package by.htp.part01.block3;

import java.math.*;

/*
 * 22. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат 
представить в виде таблицы, первый столбец которой – значения   аргумента, второй - соответствующие 
значения функции: F(x) = sin2(x);
 */
public class Ex22 {

	public static void main(String[] args) {					
		int a = -4;
		int b = 4;
		int h = 2;
		double y;
			
		for (int x = a; x <= b; x = x + h) {
			y = (double) (Math.sin(x) * Math.sin(x));
			System.out.printf("x = %16d %7s F(x) = %16.2f%n", x, " ", y);
		}
	}
}
