package by.htp.part01.block3;

import java.math.*;

/*
 * 23. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат 
представить в виде таблицы, первый столбец которой – значения   аргумента, второй - соответствующие 
значения функции: F(x) = ctg(x / 3) + (sin(x) / 2);
 */
public class Ex23 {

	public static void main(String[] args) {				
	    int a = -10;
		int b = 10;
		int h = 3;
		double y;
			
		for (int x = a; x <= b; x = x + h) {
			y = (1 / Math.tan(x / 3)) + ((Math.sin(x) / 2));
			System.out.printf("x = %16d %7s F(x) = %16.2f%n", x, " ", y);
		}
	}
}