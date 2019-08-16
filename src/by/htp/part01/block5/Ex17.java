package by.htp.part01.block5;

/*
 * 17. Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min(a1, a2, ..., an.).
 */
public class Ex17 {

	public static void main(String[] args) {
		int [] rez;
		int size;
		
		int[] mass = {23, 25, 18, 98, 10, 54, 78, 10, 15, 89, 11};
        int min = findMin(mass);
        size = findSize(mass, min);        
        rez = minKiller(mass,size,min);
        print(rez);
        
	}
	
	public static int findMin(int[] mass) {
		int min = mass[0];
		for (int i = 1; i < mass.length; i++) {
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		System.out.println("Минимальное значение = " + min);
		return min;
	}
	
	public static int findSize(int[] mass, int min) {
		int negativeSize = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				negativeSize++;
			}
		}
		return mass.length - negativeSize;
	}
	
	public static int[] minKiller(int[] mass, int size, int min) {
		int[] rez = new int[size];
		int position = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] != min) {
				rez[position] = mass[i];
				position++;
			}
		}
		return rez;
	}
	
	public static void print(int[] mass) {
		for(int n : mass) {
			System.out.print(n + " ");
		}
	}
	
 }
