package by.htp.part01.block5;

/*
 * 15. Дана последовательность действительных чисел n a1 ,a2 ,... ,an.
 *  Указать те ее элементы, которые принадлежат отрезку [с, d].
 */
public class Ex15 {

	public static void main(String[] args) {
		int c = 15;
		int d = 100;
		int count = 0;
		
		int[] mass = init(30);
		System.out.println("Элементы массива принадлежащие отрезку: ");
		for (int i = 0; i < mass.length; i++) {
			for (int j = c; j <= d; j++) {
				if (mass[i] == j) {
					System.out.print(i + " ");
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("Нет совпадений");
		}
	}
	
	public static int[] init(int size) {
		int[] mass = new int[size];
		
		for(int i = 0; i < size; i++) {
			mass[i] = (int) (Math.random() * 1000);			
		}
		return mass;
	}
}
