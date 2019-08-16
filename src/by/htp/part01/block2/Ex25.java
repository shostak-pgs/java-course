package by.htp.part01.block2;

/*
 * 25.  Написать  программу  —  модель  анализа  пожарного  датчика  в  помещении,
 *  которая  выводит  сообщение «Пожароопасная ситуация », если температура в комнате
 *   превысила 60° С.
 */
public class Ex25 {
	
	public static void main(String[] args) {
	    float temperature=59.7f;	

	    while(true) {                             //Пока температура не упадет будет сигналить
	        if (temperature > 60) {
	    	    System.out.println("Пожароопасная ситуация ");
	        }	    
	    }
	}
}
