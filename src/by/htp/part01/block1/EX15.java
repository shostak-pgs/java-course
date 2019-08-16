package by.htp.part01.block1;

/*
 * 15. РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ РІС‹РІРѕРґРёС‚ РЅР° СЌРєСЂР°РЅ РїРµСЂРІС‹Рµ С‡РµС‚С‹СЂРµ СЃС‚РµРїРµРЅРё С‡РёСЃР»Р° ПЂ.
 */
public class EX15 {

	public static void main(String[] args) {
		double pi = 3.14;

		for (int i = 1; i < 5; i++) {

			double z = Math.pow(pi, i);

			System.out.printf("Рџ РІ СЃС‚РµРїРµРЅРё %d = %.4f%n", i, z);
		}
	}
}
