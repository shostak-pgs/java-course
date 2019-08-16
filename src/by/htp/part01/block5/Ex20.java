package by.htp.part01.block5;

/*
 * 20. Дан целочисленный массив с количеством элементов п. Сжать массив,
 *  выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 *  Примечание. Дополнительный массив не использовать.
 */
public class Ex20 {

	public static void main(String[] args) {		
		int[] arr1 = {5, 6, 1, 1, 5, 0};
		
		for (int i = 0; i < arr1.length; i = i + 2) {
			arr1[i] = 0;
		}
		System.out.println("Результативный массив:");
		for (int n :arr1) {
			System.out.print(n + " ");
		}
	}
}
