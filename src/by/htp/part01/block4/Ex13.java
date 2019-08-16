package by.htp.part01.block4;

import java.awt.*;
import java.applet.*;
/*
<applet code = "MyApplet" width = 200 height = 60>
</applet>
*/
/*
 * 13. Дано натуральное число N. Написать метод(методы) для формирования массива,
 *  элементами которого являются цифры числа N.
 */
public class Ex13 {

	public static void main(String[] args) {
		int n = 1059478;
		int[] mass = init(n);
		
		print(mass);
	}
	
	public static void print(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
	}
	
	public static int[] init(int n) {		
		int k = 0;
		int i = n;
		int[] mas;
		
	    while (( n * 1.0 / 10) >= 0.1) {
	    	k++;
	    	n = (n / 10);	    	
	    } 
	    
	    mas = new int[k];
	    
	    for (int p = 0; p < k; p++) {	    	
	    	mas[p] = (i % 10);
	    	i = (i / 10);
	    } 
	    
	    return mas;
	}
}
