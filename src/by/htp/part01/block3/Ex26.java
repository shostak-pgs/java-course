package by.htp.part01.block3;

/*
 * 26.  Вывести  на  экран  соответствий  между  символами  и  их  численными
 *   обозначениями  в  памяти компьютера (Таблицу ASCII).
 */
public class Ex26 {

	public static void main(String[] args) {
		
		System.out.printf("Код символа %5s значение%n", " ");
		for (int i = 32; i <= 255; i++) {
			System.out.printf("%5d%5s%4s%n", i, " ", (char) i);			
		}		
	}
}
