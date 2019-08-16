package by.htp.part01.block1;

/*
 * 39. Дано действительное число  х. Не пользуясь  никакими другими арифметическими операциями, кроме умножения, 
сложения и вычитания, вычислите за минимальное число операций:- 2x4 - 3х3 + 4х2 - 5х + 6.
 */
public class Ex39 {
	public static void main(String[] args) {
		int x = 2;
		int rez;
		
		int x2 = x * x;
		rez = 2 * x2 *(x2 + 2) - x *((3 * x2) + 5) + 6; 
        
		System.out.printf("The answer is %d", rez);
	}
}
