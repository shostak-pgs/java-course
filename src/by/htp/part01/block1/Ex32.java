package by.htp.part01.block1;

/*32.  Текущее показание электронных часов: т ч (0 <= т <=23) п  мин  
 * (0 <=  п <= 59) к  с (0 <= к <= 59). Какое время будут показывать часы через р ч q мин r с?
 */
public class Ex32 {
	public static void main(String[] args) {
		int m = 12;
		int n = 24;
		int k = 36;
		int p = 37;
		int q = 36;
		int r = 25;
		int current;
		int h;
		int mi;
		int s;
		
		current = (m + p) * 3600 + (n + q) * 60 + (k + r);
		h = (current % 86400)/3600 ;
		mi=(current%3600)/60;
		s=(current%60);
		
		System.out.printf("Current time is %02d:%02d:%02d", h, mi, s);
	}
}
