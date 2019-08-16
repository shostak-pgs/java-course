package by.htp.part01.block3;

import java.io.*;

/*
 * 282.  Написать программу, в которой вводятся два операнда Х и Y  и знак операции
 *  (+, –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть
 *   реакции на возможный неверный знак операции, а также  на  ввод  Y=0  при  делении.
 *   Организовать  возможность  многократных  вычислений  без перезагрузки программа
 *    (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
 */
public class Ex28 {

	public static void main(String[] args) {
		int x = 56;
		int y = 3;
		double z;
		boolean isTrue = true;
		String str;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(isTrue) {
		    try{
		    	System.out.println("Введите знак операции");
			    str = reader.readLine();
			    if (str.contentEquals("0")) {
				    isTrue = false;
				    break;
			    }			
			    switch (str) {
			        case ("+"):
			    	    z = (x + y);
			            System.out.println("Сумма равна " + z);
			            break;
			        case ("-"):
			    	    z = (x - y);
			            System.out.println("Разность равна " + z);
		                break;
			        case ("*"):
			    	    z = (x * y);
			        System.out.println("Произведение равно " + z);
	                    break;
			        case ("/"):
			    	    if (y == 0) {
			    		    System.out.println("Деление на ноль!");			    		
			    	    } else {
			    	 	    z = ((x * 1.0) / y);
			    		    System.out.printf("Частное равно %.2f%n", z);		                
			    	    }
			            break;
			        default:
			    	    System.out.println("Недопустимое действие!");
			    	    break;			    
			    }
		    } catch (Exception e) {
			    System.out.println("Ошибка выполнения");
		    }
	    }
		System.out.println("Программа завершена");
    }
}
