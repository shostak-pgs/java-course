package by.htp.part01.block1;


/*33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий 
 * и последующий символы.
 */
public class Ex33 {
	public static void main(String[] args) {
		char ch='z';
		
		System.out.printf("Index is %d, the next one is '%c', the previos one is '%c'", (int) ch, (char) (ch+1), (char) (ch-1));
	}
}
