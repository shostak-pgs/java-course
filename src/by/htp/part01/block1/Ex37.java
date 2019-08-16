package by.htp.part01.block1;

/*
 * 37. Составить линейную программу, печатающую значение  true,  если указанное высказывание является истинным, и 
 *  false — в противном случае:
 *  1.Целое число N является четным двузначным числом.
 *  2.Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
 *  3.Сумма цифр данного трехзначного числа N является четным числом.
 *  4.Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
 *  5.Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 *  6.Треугольник со сторонами а,b,с является равнобедренным.
 *  7.Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
 *  8.Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
 *  9.График функции у = ах2+ bх+ с проходит через заданную точку с координатами (m, п).
 */
public class Ex37 {

	public static void main(String[] args) {
		int n = 21;                               //1
		int nn = 3223;                            //2
		int nnn = 340;                            //3,5,7
		boolean isTrue;
		int nFirst;
		int nLast;
		int sum3x=0;
		int xa = 5;                               //4,9
		int ya = 8;                               //4,9
		int m = -1;                               //4 This is m
		int c = 3;                                //4,9 This is n
        int sideA = 3;                            //6
        int sideB = 3;                            //6
        int sideC = 3;                            //6
        int[] num = new int[3];                   //7
        int a = 3;                                //8,9
        int b = 6;                                //9
       
        
		/* Question #1 */
		isTrue = ((n % 2 == 0) && (n < 100)) ? true : false;		
		System.out.println("Question №1: " + isTrue);
		
		/* Question #2 */
		nLast = nn % 100;
		nFirst = nn / 100;
		isTrue = ((nFirst % 10) + nFirst / 10) == ((nLast % 10) + nLast / 10) ? true : false;		
		System.out.println("Question №2: " + isTrue);
		
		/* Question #3 */
		for (int i = 3; i > 0; i--) {
		    sum3x = sum3x + ((int) ((nnn / (Math.pow(10, i - 1))) % 10));			   
		}
		isTrue = (sum3x % 2 == 0) ? true : false;		
		System.out.println("Question №3: " + isTrue);
		
		/* Question #4 */
		isTrue = ((ya >= m) && (ya >= c)) ? true : false;
		System.out.println("Question №4: " + isTrue);
		
		/* Question #5 */
		isTrue = ((Math.pow(nnn, 2)) == (Math.pow(sum3x, 3))) ? true : false;
		System.out.println("Question №5: " + isTrue);
		
		/* Question #6 */
		isTrue = ((sideA == sideB) && (sideA == sideC) && (sideB == sideC)) ? true : false;
		System.out.println("Question №6: " + isTrue);
		
		/* Question #7 */
		for (int i = 3; i > 0; i--) {
		    num[3-i] =  ((int) ((nnn / (Math.pow(10, i - 1))) % 10));
		}
		isTrue = (((num[0] + num[1]) == num[2]) || ((num[1] + num[2]) == num[0]) || ((num[0] + num[2]) == num[1])) ? true : false;
		System.out.println("Question №7: " + isTrue);
		
		/* Question #8 */
		isTrue = (n % a ==1) ? true : false;
		System.out.println("Question №8: " + isTrue);
		
		/* Question #9 */
		isTrue = (ya == (xa * xa * a + xa * b + c)) ? true : false;
		System.out.println("Question №9: " + isTrue);
	}
}


