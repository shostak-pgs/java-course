package by.htp.part01.block2;

import java.io.*;
/*
 * 21.  Программа  —  льстец.  На  экране  высвечивается  вопрос
 *   «Кто  ты:  мальчик  или  девочка?  Введи  Д  или  М».  В 
 *  зависимости от ответа на экране должен появиться текст
 *   «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */
public class Ex21 {

	public static void main(String[] args) {
		
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		    String str;		   
		
		    System.out.println("Кто  ты:  мальчик  или  девочка?  Введи  Д  или  М");
		
		    str = br.readLine();
		   
		        if (str.contentEquals("Д")) { 
		            System.out.println("Мне нравятся мальчики!");
	            } else if (str.contentEquals("М")) { 
	        	    System.out.println("Мне нравятся мальчики!");
	            } else {
		        System.out.println("Я не знаю кто ты(");
	            }
        } 
	    catch (IOException e) {
	    	e.printStackTrace();
	    }
	   
    }
}