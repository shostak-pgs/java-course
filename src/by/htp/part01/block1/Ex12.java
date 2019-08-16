package by.htp.part01.block1;

/*
 * Вычислить расстояние между двумя точками с данными 
 * координатами (х1, у1)и (x2, у2).
 */
public class Ex12 {
	public static void main(String[] args) {
		double x1 = 1;
		double x2 = 2;
		double y1 = 1;
		double y2 = 2;
		double distance;

		distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

		System.out.println("Distance = " + distance);
	}
}
