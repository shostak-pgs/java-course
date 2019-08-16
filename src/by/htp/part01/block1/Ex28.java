package by.htp.part01.block1;

/*
 * 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */
public class Ex28 {
	public static void main(String[] args) {
		double angleInRad = 2;
		double quo;
		int grad;
		int min;
		int sec;
		
		quo = (angleInRad * 180) / Math.PI;
		grad = (int)quo;
		min = (int) ((quo - grad) * 3600) / 60;
		sec = (int) (((quo - grad) * 3600) - (min * 60));
       
       System.out.printf("%d grad, %d min, %d sec", grad, min, sec);
    }
}
