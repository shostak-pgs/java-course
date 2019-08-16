package by.htp.part01.block3;

/*
 * 30. Написать программу, переводящую римские цифры в арабские.
 */
public class Ex30 {

	public static void main(String[] args) {
		int arabic = 0;
		String str = "LXXIII";
		char[] rome = new char[str.length()];
        
		for (int i = 0; i < rome.length; i++) {
        	rome[i] = str.charAt(i);
        }
		
        for (int i = 0; i < rome.length; i++) { 
            
        	if (rome.length == 1) {
        		arabic = arabic + getArabic(rome[i] + "");
        	
        	} else if ((i + 1) < (rome.length) && getArabic(rome[i] + "") > getArabic(rome[i + 1] + "")) {
        		
            	arabic = arabic + getArabic(rome[i] + "");            	
            } else if ((i + 1) < (rome.length) && getArabic(rome[i] + "") < getArabic(rome[i + 1] + "")) {
            	String str2 = rome[i] + "" + rome[i + 1];            	
            	arabic = arabic + getArabic(str2 + "");
            	i++;     	
        	
            } else {            	
        		arabic = arabic + getArabic(rome[i] + "");
            }  	    
	    }
        System.out.println(arabic);
	}
	
	public static int getArabic(String str) {
		int ret = 0;
		
		    switch (str) {
		        case ("I") :
		    	    ret = 1;
		            break;
		        case ("IV") :
		    	    ret = 4;
		            break;
		        case ("V") :
		    	    ret = 5;
		            break;
		        case ("IX") :
		    	    ret = 9;
		            break;
		        case ("X") :
		    	    ret = 10;
		            break; 
		        case ("XL") :
		    	    ret = 40;
		            break;
		        case ("L") :
		    	    ret = 50;
		            break;
		        case ("XC") :
		    	    ret = 90;
		            break;
		        case ("C") :
		    	    ret = 100;
		            break;
		        case ("CD") :
		    	    ret = 400;
		            break;
		        case ("D") :
		    	    ret = 500;
		            break;
		        case ("CM") :
		    	    ret = 900;
		            break;
		        case ("M") :
		    	    ret = 1000;
		            break;
		    }
		return ret;
	}    
}
