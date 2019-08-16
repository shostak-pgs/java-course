package by.htp.part01.block3;

/*
 *  Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Ex08 {

	public static void main(String[] args) {
		int a = 10;
		int b = 16;
		int h = 2;
		int c = 12;

		for (int x = a; x < b; x = x + h) {
			if (x != 15) {
				int y = (x - c) + 6;
				System.out.println("При х не равном 15, значение у = " + y);
			} else {
				int y = x - c + 6;
				System.out.println("При х = 15, значение у = " + y);
			}
		}
	}
}
