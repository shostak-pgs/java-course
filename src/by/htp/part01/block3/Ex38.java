package by.htp.part01.block3;

/*
 * 38. Для  заданного  натурального  числа  определить,  образуют  ли  его  цифры
 * арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
 */
public class Ex38 {

	public static void main(String[] args) {
		int i = 998;
		String str = "" + i;
		int current;
		int flag = 0;
		int[] mas = new int[str.length()];
		boolean isTrue = true;
		
		while (((double) i / 10) >= 0.1) {
	        current = (int) (i % 10);
	        mas[flag] = current;
	        flag++;
	        i = i / 10; 
	        }
		for(int j = 0; j < (mas.length - 2); j++) {
			if (!((mas[j] - mas[j + 1]) == (mas[j + 1] - mas[j + 2]))) {
				isTrue = false;
			}
		}
		if (isTrue == true) {
			System.out.println("Цифры образуют последовательность");
		} else {
			System.out.println("Цифры не образуют последовательность");
		}
	}
}

