package by.htp.part01.block3;

import java.io.*;

/*
 * 27.  Для каждого натурального числа в промежутке от m  до n  вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Ex27 {

	public static void main(String[] args) {	
      
		int m = 2;
		int n = 587;
		
		for (int i = m; i <= n; i++ ) {
			System.out.print("Число равно " + i +". Делители:");
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					System.out.print(" " + j + ";");
				}
			}
			System.out.println();
		} 			
	}
}
