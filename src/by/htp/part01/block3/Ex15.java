package by.htp.part01.block3;

/*
 * 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени
 */
public class Ex15 {

	public static void main(String[] args) {		
        int rez = 0;
		
        for(int i = 0; i <= 10; i++) {
		    rez = rez + (int) Math.pow(2, i);	
		}
        System.out.println(rez);
	}
}
