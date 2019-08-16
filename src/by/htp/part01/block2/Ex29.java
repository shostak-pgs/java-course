package by.htp.part01.block2;

/*
 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */
public class Ex29 {

	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 1;
		int x2 = 2;
		int y2 = 2;
		int x3 = 3;
		int y3 = 3;
	    int a;
	    int b;
	    int c;
	    	    
	    a = (y1 - y2);
	    b = (x2 - x1);
	    c = ((x1 * y2) - (x2 * y1));
	    
	    if (((a * x3) + (b * y3) + c) == 0) {
	    	System.out.println("Точки лежат на прямой");
	    } else {
	    	System.out.println("Точки не лежат на прямой");
	    }
	    
	}

}
