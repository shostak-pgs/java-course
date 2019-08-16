package by.htp.part01.block1;

/*
 * 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 */
public class Ex30 {
	public static void main(String[] args) {
		float r1 = 7.0f;
		float r2 = 3.0f;
		float r3 = 4.0f;

		float reverse;

		reverse = ((1 / r1) + (1 / r2) + (1 / r3));

		System.out.printf("Resistance = %.1f", (1 / reverse));

	}
}
