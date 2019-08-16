package by.htp.part01.block3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 32.  Проверить  введенную  пользователем  строку  на  наличие  недопустимых  символов. 
 *  В  качестве первого  символа  допустимы  только  буквы  и  знак  подчеркивания. 
 *  Остальные  символы  могут  быть буквами, цифрами и знаком подчеркивания.
 */
public class Ex32 {

	public static void main(String[] args) throws Exception {		
		String str;
		boolean isTrue;
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
		str = br.readLine();
        br.close();
        
        
        Pattern p = Pattern.compile("^[A-Za-z_]\\w+");
		Matcher m = p.matcher(str);
		
        if (m.find()) {
        	System.out.println("Введенная строка корректна");
        } else {  
            System.out.println("Обнаружены недопустимые символы");        
	    }
	}
}
