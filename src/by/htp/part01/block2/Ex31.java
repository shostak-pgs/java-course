package by.htp.part01.block2;

/*
 * 31. Заданы размеры  А, В прямоугольного отверстия и размеры  х,  у,  z  кирпича.
 *  Определить, пройдет ли кирпич через отверстие.
 */
public class Ex31 {

	public static void main(String[] args) {
        int a = 251;
        int b = 64;
        int x = 250;
        int y = 125;
        int z = 65;
        boolean isTrue;
        
        if (((x <= a) && (y <= b)) || ((y <= a) && (x <= b))) {
        	isTrue = true;
        } else if (((z <= a) && (y <= b)) || ((y <= a) && (z <= b))) {
        	isTrue = true;
        } else if (((z <= a) && (x <= b)) || ((x <= a) && (z <= b))) {
        	isTrue = true;
        } else {
        	isTrue = false;
        }
     
        if (isTrue) {
            System.out.println("Кирпич пролез!");
        } else {
        	System.out.println("Кирпич не пролез");	
        }
	}

}
