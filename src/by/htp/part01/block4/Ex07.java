package by.htp.part01.block4;

/*
 *7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
 * между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 */
public class Ex07 {

	public static void main(String[] args) {		
		int[] ab = { 5, 12, 10, 13, 4, 11 };
		dis(ab);
	}

	public static void dis(int[] bc) {
		double disAb = 0;
		double disBc = 0;
		double disAc = 0;

		for (int i = 0; i < 1; i++) {
			double x = Math.sqrt(Math.pow(bc[i + 2] - bc[i], 2) + Math.pow(bc[i + 3] - bc[i + 1], 2));
			disAb = x;
		}
		for (int i = 2; i < 3; i++) {
			double y = Math.sqrt(Math.pow(bc[i + 2] - bc[i], 2) + Math.pow(bc[i + 3] - bc[i + 1], 2));
			disBc = y;
		}
		for (int i = 0; i < 1; i++) {
			double o = Math.sqrt(Math.pow(bc[i + 4] - bc[i], 2) + Math.pow(bc[i + 5] - bc[i + 1], 2));
			disAc = o;
		}
		if (disAb > disBc && disAb > disAc) {
			System.out.println("Расстояние между точками а и b больше");
		} else if ((disBc > disAb) && (disBc > disAc)) {
			System.out.println("Расстояние между точками b и с больше");
		} else {
			System.out.println(" Расстояние между точками а и с больше");
		}
	}
}
