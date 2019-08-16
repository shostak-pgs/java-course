package by.htp.part01.block1;

/*
 * 24. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ СЂР°РІРЅРѕР±РµРґСЂРµРЅРЅРѕР№ С‚СЂР°РїРµС†РёРё СЃ РѕСЃРЅРѕРІР°РЅРёСЏРјРё Р° Рё  b  Рё СѓРіР»РѕРј О± РїСЂРё Р±РѕР»СЊС€РµРј РѕСЃРЅРѕРІР°РЅРёРё Р°.
 */
public class Ex24 {

	public static void main(String[] args) {
		int a = 12;
		int b = 14;
		double r = 45.0;

		double angle = Math.toRadians(r);

		double area = a * b / Math.asin(angle);

		System.out.printf("РџР»РѕС‰Р°РґСЊ С‚СЂР°РїРµС†РёРё = %.4f", area);
	}
}
