package by.htp.part01.block1;

/*
 * 40. Дано значение х. Получить значения  -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4x3 . 
 * Позаботьтесь об экономии операций.
 */
public class Ex40 {
	public static void main(String[] args) {
		int x =3;
		int x2 = x * x;
		int znach1;
		int znach2;
		
		
		znach1 = x * ((3 * x) - (4 * x2) - 2);
        znach2 = (x * (2 + 4 * x2)) + (1 + 3 * x2);
        
        System.out.printf("The first answer is %d, the second is %d", znach1, znach2);
	}
}
