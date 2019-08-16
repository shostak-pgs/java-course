package by.htp.part01.block4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * 11. Задан массив D. Определить следующие суммы:
 *  D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы)
 *  для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */
public class Ex11 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Введите k");
		int k = Integer.parseInt(reader.readLine());
		System.out.println("Введите m");
		int m = Integer.parseInt(reader.readLine());
		reader.close();
		
		int[] mas = init(k, m);
		System.out.printf("Сумма заданных элементов массива = %d", sum(mas, k, m));
		
	}
	
	static int sum(int[] mas, int k, int m) {
		int sum = 0;
		for (int i = k; i < m; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}
	
	static int[] init(int k, int m) {
		Random rnd = new Random();
		int[] mas = new int[k + m];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(k + m);		
	    }
		return mas;
    }
}
