package by.htp.part01.block2;

/*
 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
 */
public class Ex26 {
	
	public static void main(String[] args) {
		int a = 56;
		int b = 45;
		int c = -1;
		int max;
		int min;
		
		max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}

		min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		
		System.out.println("Сумма максимального и минимального = " + (max + min));
	}
}
