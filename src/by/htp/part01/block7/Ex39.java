package by.htp.part01.block7;

/*
 * 39. Найдите произведение двух матриц.
 */
public class Ex39 {

	public static void main(String[] args) {
		int[][] arr1 = { { 4, 6, 5 }, { 1, 1, 1 }, { 3, 3, 7 } };
		int[][] arr2 = { { 4, 6, 5 }, { 2, 5, 7 }, { 5, 1, 8 } };

		print(multiply(arr1, arr2));
	}

	public static int[][] multiply(int[][] array1, int[][] array2) {
		boolean isTrue = true;

		if (array1.length != array2[0].length) {
			isTrue = false;
		}

		int[][] multArr = new int[array1.length][array1[0].length];

		if (isTrue == true) {

			for (int j = 0; j < array1[0].length; j++) {
				int[] helpArray = new int[array2.length];

				for (int i = 0; i < array2[0].length; i++) {

					for (int k = 0; k < array2.length; k++) {
						helpArray[k] = array2[k][i];
					}
					multArr[j][i] = multiplyElement(array1[j], helpArray);
				}
			}
		} else {
			System.out.println("Порядок матриц не совпадает!");
		}
		return multArr;
	}

	public static int multiplyElement(int[] line1, int[] line2) {
		int element = 0;

		for (int i = 0; i < line1.length; i++) {
			element = element + line1[i] * line2[i];
		}
		return element;
	}

	private static void print(int[][] arr) {
		for (int[] k1 : arr) {

			for (int s : k1) {
				System.out.printf("%6d ", s);
			}
			System.out.println("");
		}
	}
}
