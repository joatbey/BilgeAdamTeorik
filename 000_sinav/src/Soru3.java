
public class Soru3 {

	public static int karakterSayici(String metin, char karakter) {

		int tane = 0;

		for (int i = 0; i < metin.length(); i++) {
			if (karakter == metin.charAt(i)) {
				tane++;
			}
		}
		if (tane != 0) {
			System.out.println(karakter + " yazı içinde  " + tane + " tanedir");
		}
		else {
			System.out.println(karakter + " yazı içinde  " + 0 + " tanedir");
		}
		return tane;
	}

	public static void main(String[] args) {
		karakterSayici("Bugün güzel bir gün", 'g');

		karakterSayici("Bugün güzel bir gün", 'x');

	}

}
