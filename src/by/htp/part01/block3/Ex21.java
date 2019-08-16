package by.htp.part01.block3;

/*
 * 21. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат 
представить в виде таблицы, первый столбец которой – значения   аргумента, второй - соответствующие 
значения функции: F(x) = x - sin(x);
 */
public class Ex21 {

	public static void main(String[] args) {		
		int a = -20;
		int b = 10;
		int h = 2;
		double y;
		
		for (int x = a; x <= b; x = x + h) {
			y = x - (double) Math.sin(x);
			System.out.printf("x = %16d %7s F(x) = %16.2f%n", x, " ", y);
		}
	}
}
