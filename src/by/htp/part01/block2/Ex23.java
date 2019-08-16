package by.htp.part01.block2;

/*
 * 23. Определить правильность даты, введенной с клавиатуры (число  — от 1 до 31, месяц — от 1 до 12). Если введены 
некорректные данные, то сообщить об этом.
 */
public class Ex23 {
	
	public static void main(String[] args) {
	    int day = 31;
	    int month = 12;
        boolean isTrue;
    
	    isTrue =  ((day > 0 && day <32) && (month > 0 && month <13)) ? true : false;
	
	    if (isTrue) {
	        System.out.println("Дата корректна");
	    } else {
	    	System.out.println("Дата не корректна");
	    }
	}
}
