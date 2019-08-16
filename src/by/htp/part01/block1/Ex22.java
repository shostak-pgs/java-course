package by.htp.part01.block1;

/*
 * 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Ex22 {

	public static void main(String[] args) {
		int sec = 134463;

		int hour = sec / 3600;
		System.out.println("Длительность в часах = " + hour);

		int minute = (sec - hour * 3600) / 60;
		System.out.println("Длительность в минутах = " + minute);

		int sec2 = sec - minute * 60 - hour * 3600;
		System.out.println("Длительность в минутах = " + sec2);
	}
}
