package by.htp.part01.block7;

import java.util.Scanner;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца
 *  поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера
 *   столбцов вводит пользователь с клавиатуры.
 */
public class Ex27 {

	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		int count = 0;
		int[][] arr = {{2, 3, 5, 7, 967} , {2, 2, 2567, 2, 4} ,{3, 3, 2, 3, 4}};
		
		Scanner sc = new Scanner(System.in);
		while (count != 2) {			
			System.out.println("Введи номер первого столбца");
			first = Integer.parseInt(sc.next());
			System.out.println("Введи номер второго столбца");
			second = Integer.parseInt(sc.next());
			count = 2;			
		}
		change(first, second, arr);
		sout(arr);
		}
	
	public static int[][] change(int first, int second,int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
		    if (first > arr[i].length || second > arr[i].length) {
			System.out.println("Ошибка ввода");
			break;
		    }
		}
		int b = 0;
		for (int i = 0; i < arr.length; i++) {			
			b = arr[i][first - 1];
			arr[i][first - 1] = arr[i][second - 1];
			arr[i][second - 1] = b;
		}		
		return arr;
	}
	
	private static void sout(int[][] arr) {
		 for (int[] k1 : arr) {
				for(int s : k1) {
					System.out.printf("%6d ", s);
				}
				
				System.out.println("");
		}
	}
}

