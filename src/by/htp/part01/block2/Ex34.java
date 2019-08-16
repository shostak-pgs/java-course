package by.htp.part01.block2;

/*
 * 34.  Составить  программу,  реализующую  эпизод  применения  компьютера  в  книжном  магазине.  Компьютер 
запрашивает  стоимость  книг,  сумму  денег,  внесенную  покупателем;  если  сдачи  не  требуется,  печатает  на  экране 
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если 
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */
public class Ex34 {

	public static void main(String[] args) {
		float cost = 33.02f;
		float amountDeposited = 33.02F;
		float cashBack;
		float shortage;
		
		if (amountDeposited > cost) {
			cashBack = amountDeposited - cost;
			System.out.printf("Возьмите сдачу %.2f", cashBack);
		} else if (amountDeposited < cost) {
			shortage = cost - amountDeposited;
			System.out.printf("Недостающая сумма %.2f", shortage);
		} else {
			System.out.printf("Спасибо что без сдачи)");
		}
	}

}
