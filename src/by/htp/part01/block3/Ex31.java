package by.htp.part01.block3;

import java.util.Scanner;

/*
 * 31.  Компьютер  генерирует  пять  чисел  в  диапазоне  от  1  до  15  включительно.
 *  Человек  пытается  их угадать.  Программа  должна  выводить  угаданные  и
 *  неугаданные  числа  из  тех,  что  сгенерировала программа, а также ошибочные числа
 *  пользователя. 
 */
public class Ex31 {

	public static void main(String[] args) {	
        int[] numbers = new int[5];
        int[] answers = new int[5];
        int[] truee = new int[5];
        int flag1 = 0;   
        double min = 1;
        double max = 15;
        int curr;
        
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = (int) ((Math.random() * max) + min);  //Генерация случайных чисел
        	i++;
        }             
        
        Scanner scanner = new Scanner(System.in);              //Заполнение массива ответов
        for (int j = 0; j < 5; j++) {
        	System.out.println("Введите число");               
        	answers[j] = scanner.nextInt();        	
        }        
        scanner.close();
                
        for( int k = 0; k < 5; k++) {                          //Заполнение массива угаданых чисел
        	curr = answers[k];
        	for (int kk = 0; kk < 5; kk++) {
        		if (numbers[kk] == curr) {
        			truee[flag1] = curr;
        			flag1++;
        			break;
        		}
        	}  
        }
                
        System.out.print("Угаданные числа:");
        for (int n = 0; n < flag1; n++) {
        	System.out.print(" " + truee[n]);
        }
        
        System.out.println("");
        System.out.print("Неугаданные числа:");
        for (int k = 0; k < numbers.length; k++) {
        	int curr1 = numbers[k];
        	boolean isTrue = false;
        	for (int n = 0; n < flag1; n++) {
        		if (curr1 == truee[n]) {
        			isTrue = true;
        			break;
        		} 
        	}if (isTrue == false) {
        		System.out.print(" " + curr1);
        		}
        }
        
        System.out.println("");
        System.out.print("Неверные ответы:");
        for (int k = 0; k < answers.length; k++) {        	
        	int curr1 = answers[k]; 
        	boolean isTrue = false;
        	for (int n = 0; n < flag1; n++) {
         		if (curr1 == truee[n]) {
        			isTrue = true;
         			break;
         		}
            } if (isTrue == false) {
        		System.out.print(" " + curr1);        	
        	}
        }
	}	
}
