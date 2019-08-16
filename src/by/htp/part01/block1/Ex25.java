package by.htp.part01.block1;

/*
 * 25. Р’С‹С‡РёСЃР»РёС‚СЊ РєРѕСЂРЅРё РєРІР°РґСЂР°С‚РЅРѕРіРѕ СѓСЂР°РІРЅРµРЅРёСЏ Р°С…2 + bС… + СЃ =  0  СЃ Р·Р°РґР°РЅРЅС‹РјРё РєРѕСЌС„С„РёС†РёРµРЅС‚Р°РјРё  a,  b
 *   Рё СЃ  (РїСЂРµРґРїРѕР»Р°РіР°РµС‚СЃСЏ, С‡С‚Рѕ Р°в‰ 0 Рё С‡С‚Рѕ РґРёСЃРєСЂРёРјРёРЅР°РЅС‚ СѓСЂР°РІРЅРµРЅРёСЏ РЅРµРѕС‚СЂРёС†Р°С‚РµР»РµРЅ). 
 */
public class Ex25 {

	public static void main(String[] args) {		
		int a = 2;
		int b = 5;
		int c = 1;
		
		int discriminant = b * b - 4 * a * c;
		
		double x1 =  (- b + Math.sqrt(discriminant)) / 2 * a;
		
		double x2 = (- b - Math.sqrt(discriminant)) / 2 * a;
		
		System.out.printf("РџРµСЂРІС‹Р№ РєРѕСЂРµРЅСЊ = %.4f%n", x1);
		System.out.printf("Р’С‚РѕСЂРѕР№ РєРѕСЂРµРЅСЊ = %.4f%n", x2);
	}
}
