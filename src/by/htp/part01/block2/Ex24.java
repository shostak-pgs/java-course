package by.htp.part01.block2;

/*
 * 24.  Составить  программу,  определяющую  результат  гадания  на
 *   ромашке  —  «любит—не  любит»,  взяв  за  исходное данное количество лепестков п.
 */
public class Ex24 {
	
	public static void main(String[] args) {
	    boolean love;
        int n=3;
    
        love = ((n % 2) == 0) ? true : false;
    
        if (love) {
    	    System.out.println("Не любит");
        } else {
    	    System.out.println("Любит");
        }
	}
}
