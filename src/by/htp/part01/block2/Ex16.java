package by.htp.part01.block2;

/*
 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена
 *  (на какой оси или в каком координатном угле).
 */
public class Ex16 {

	public static void main(String[] args) {
		int x = - 3;
		int y = - 2;

		if ((x == 0) && (y == 0)) {
			System.out.println("Точка в начале координат");
		} else if (x == 0) {
			System.out.println("Точка на оси y");
		} else if (y == 0) {
			System.out.println("Точка на оси x");
		} else if (x > 0 && y > 0) {
			System.out.println("Точка в 1 координатном угле");
		} else if (x > 0 && y < 0) {
			System.out.println("Точка в 4 координатном угле");
		} else if (x < 0 && y > 0) {
			System.out.println("Точка в 2 координатном угле");
		} else if (x < 0 && y < 0) {
			System.out.println("Точка в 3 координатном угле");
		}
	}
}
