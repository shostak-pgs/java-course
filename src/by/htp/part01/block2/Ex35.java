package by.htp.part01.block2;

/*
 * 35. Вычислить число и месяц в невисокосном году по номеру дня.
 */
public class Ex35 {

	public static void main(String[] args) {	
        int day = 365;
            
        if ((day <= 0) || (day > 365)) {
        	System.out.println("Ошибка ввода");
        } else {
            if (day > 0 && day <= 31 ) {
        	    System.out.printf("%d января", day);
            } else if( day > 31 && day <= 59) {
        	    day = day - 31;
        	    System.out.printf("%d февраля", day);
            } else if( day > 59 && day <= 90) {
        	    day = day - 59;
        	    System.out.printf("%d марта", day);
            }else if( day > 90 && day <= 120) {
        	    day = day - 90;
        	    System.out.printf("%d апреля", day);
            }else if( day > 120 && day <= 151) {
        	    day = day - 120;
        	    System.out.printf("%d мая", day);
            }else if( day > 151 && day <= 181) {
        	    day = day - 151;
        	    System.out.printf("%d июня", day);
            }else if( day > 181 && day <= 212) {
        	    day = day - 181;
        	    System.out.printf("%d июля", day);
            }else if( day > 212 && day <= 243) {
        	    day = day - 212;
        	    System.out.printf("%d августа", day);
            }else if( day > 243 && day <= 273) {
        	    day = day - 243;
        	    System.out.printf("%d сентября", day);
            }else if( day > 273 && day <= 304) {
        	    day = day - 273;
        	    System.out.printf("%d октября", day);
            }else if( day > 304 && day <= 334) {
        	    day = day - 304;
        	    System.out.printf("%d ноября", day);
            }else if( day > 334 && day <= 365) {
        	    day = day - 334;
        	    System.out.printf("%d декабря", day);
            }
        }   
	}

}
