package by.htp.part01.block3;

/*
 * 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Ex29 {

	public static void main(String[] args) {
		int a = 36278088;
		int b = 5639088;
		int copyA = a;
		int copyB = b;
		int cut;
		String strA = "" + a;
		String strB = "" + b;
		int[] num = new int[10];
		int position = 0;
				
		System.out.print("Общие цифры:");
		
		for (int i = 0; i < strA.length(); i++) {           //Внешний цикл
			int numberA = (copyA % 10);			
			copyA = copyA / 10;			
			copyB = b;
			
			for( int j = 0; j < strB.length(); j++) {      //Внутренний цикл
				int numberB = (copyB % 10);
				copyB = copyB / 10;
				if (numberA == numberB) {
			        
					for (int f = 0; f <= position; f++) {	//Проверяем на наличие совпадений		        	
			        	if (num[f] == numberA) {
			        		break;
			        	}  if (f == position) {
			        		num[position] = numberA;
			        		position++;
			        		break;
			        	} 
			        }	 		        
				}
			}
		}
		for (int i = 0; i < position; i++) {
			System.out.print(" " + num[i]);
		}
	}
}
