package by.htp.part01.block5;

/*
 * 18. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */
public class Ex18 {

	public static void main(String[] args) {
		int[] array = init();		
		boolean isTrue = true;
		int cube1= 4;
		int cube2 = 1;
		int[] arr = new int[10];
		
		array[7] = cube1;
		array[6] = cube2;
		
		for (int i = 2; i < 10; i++) {
			
			 if (array[i] == 0 && array[i - 1] == 0 && array[i - 2] == 0) {				
				 System.arraycopy(array, 0, arr, 0, 5);
				 arr[i] = 3;
				 arr[i - 1] = 3;
				 arr[i -2] = 4;					 
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
             } else if (array[i] != 0 && array[i - 1] == 0 && array[i - 2] == 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);				 
				 arr[i - 1] = (10 - arr[i]) / 2;				
				 arr[i - 2] = (10 - arr[i] - arr[i - 1]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
			 } else if (array[i] == 0 && array[i - 1] != 0 && array[i - 2] == 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);	
				 arr[i] = (10 - array[i - 1]) / 2;
				 arr[i -2] = (10 - arr[i] - arr[i - 1]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
				 
			 } else if (array[i] != 0 && array[i - 1] != 0 && array[i - 2] == 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);	
				 if (arr[i] + arr[i - 1] > 9 || arr[i] + arr[i - 1] < 5) {
					 System.out.println("Решений нет");
				 }else {
				 arr[i -2] = (10 - arr[i] - arr[i - 1]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
				 }			
			 } else if (array[i] == 0 && array[i - 1] == 0 && array[i - 2] != 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);					 
				 arr[i - 1] = ((10 - arr[i - 2]) / 2);				 
				 arr[i] = (10 - arr[i - 1] - arr[i - 2]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
				 
			 } else if (array[i] == 0 && array[i - 1] != 0 && array[i - 2] != 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);	
				 if ((arr[i] + arr[i - 2]) > 9 || arr[i] + arr[i - 1] < 5) {
					 System.out.println("Решений нет");
				 }else {
				 arr[i] = (10 - arr[i - 1] - arr[i - 2]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
				 }
			} else if(array[i] != 0 && array[i - 1] == 0 && array[i - 2] != 0) {	
				 System.arraycopy(array, 0, arr, 0, 10);
				 if (arr[i] + arr[i - 2] > 9 || arr[i] + arr[i - 1] < 5) {
					 System.out.println("Решений нет");
				 }else {
				 arr[i] = (10 - arr[i] - arr[i - 2]);
				 System.out.printf("Код - %d %d %d в ячейках %d %d %d%n", arr[i - 2], arr[i - 1], arr[i], i -2, i - 1, i);
			     }
			 }
	    }	
	}
	
		public static int[] init() {
			int[] array = new int[10];
			for (int i = 0; i < 10; i++) {
				array[i] = 0;
			}
			return array;
		}	
}