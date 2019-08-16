package by.htp.part01.block3;

/*
 * 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка
 * на все свои цифры.
 */
public class Ex40 {

	public static void main(String[] args) {
		int n = 152;
		int i = n;
		String str = "" + i;
		int current;
		int flag = 0;
		int[] mas = new int[str.length()];
		boolean isTrue = true;
				
		while (((double) i / 10) >= 0.1) {
	        current = (int) (i % 10);
	        mas[flag] = current;
	        flag++;
	        System.out.println(current);
	        i = i / 10; 
	        }
		for (int j = 0; j < mas.length; j++) {
			if ((mas[j]) != 0) {
			    if (!(((n % mas[j])) == 0)) {
				    isTrue = false;
				    break;
			    }
			} else {
				System.out.println("Деление на ноль");
				isTrue = false;
				break;
			}
		}
		
		if (isTrue) {
			System.out.println("Делится без остатка");
		} else {
			System.out.println("Не делится без остатка");
		}
	}
}
