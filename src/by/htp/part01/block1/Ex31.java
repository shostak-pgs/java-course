package by.htp.part01.block1;

/*
 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость
 * в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения
 *  по озеру t1 ч, а против течения реки — t2 ч.
 */
public class Ex31 {
	public static void main(String[] args) {
        int v = 5;
        int v1 = 1;
        int t1 = 2;
        int t2 = 4;
        float p;
        
        p = Math.abs((float) ((v * t1) + ((v - v1) * t2)));
        
        System.out.printf("Path = %.2f", p);
	}

}
