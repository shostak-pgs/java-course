package by.htp.part01.block06;

/*
 * 2. Даны две последовательности a1 <= a2 ... <= an и b1 <= b2 ... <= bm. Образовать из них новую 
 * последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный 
 * массив не использовать.
 */
public class Ex02 {

	public static void main(String[] args) {		
		int[] a = { 1, 8, 3, 16 };
		int[] b = { 5, 6, 7, 8, 9 };				
		
		int[] rez = new int[a.length + b.length];

		for (int i = 0; i < rez.length; i++) {
			if (i < a.length) {
				rez[i] = a[i];				
			} else {
				rez[i] = b[i - a.length];
			}		
	    }
		rez = sort(rez);
		print(rez);
    }
	public static int[] sort(int[] mass) {
	    for (int i = 0; i < mass.length; i++) {
		    int min = i;

		    for (int j = i + 1; j < mass.length; j++) {
			    if (mass[j] < mass[min]) {
				    min = j;
			    }
		    }
		    int tmp = mass[i];
		    mass[i] = mass[min];
		    mass[min] = tmp;
	    }
	    return mass;
	}
	

	
	private static void print(int[] arr) {		
    	for (int s : arr) {
			System.out.printf("%6d ", s);
		}			
	}
	
}

