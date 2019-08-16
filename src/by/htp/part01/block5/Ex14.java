package by.htp.part01.block5;

/*
 * 14. Дан одномерный массив A[N]. Найти:
 * max(a2, a4,...,a2k) + min(a1, a3,...,a2k+1); 
 */
public class Ex14 {

	public static void main(String[] args) {
		
	    int[] mass = init(30);
	    int rez = getMax(mass) + getMin(mass);
	    
	    System.out.println("Сумма max четного и min нечетного элементов равна " + rez);
	}
	
	public static int[] init(int size) {
		int[] mass = new int[size];
		
		for(int i = 0; i < size; i++) {
			mass[i] = (int) (Math.random() * 100);			
		}
		return mass;
	}
	
	public static int getMax(int[] mass) {
		int max = mass[2];
		for (int i = 2; i < mass.length; i = i + 2) {
			if (mass[i] > max) {
				max = mass[i];
			}
		}	
		System.out.println("Максимальное четное = " + max);
		return max;
	}
	
	public static int getMin(int[] mass) {
		int min = mass[1];
		for (int i = 1; i < mass.length; i = i + 2) {
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		System.out.println("Минимальное нечетное = " + min);
		return min;
	}

}
