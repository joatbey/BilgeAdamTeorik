import java.util.Scanner;

public class Soru4 {

	public static final double PI = 3.14;

	public static void menuyuGoster() {

		System.out.println("***************************");
		System.out.println("*  Geometrik Hesaplayıcı  *");
		System.out.println("***************************");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama ");
		System.out.println("6. Daire çevre hesaplama");
		System.out.println("7. Çıkış");

	}

	public static void main(String[] args) {

		int secim = 0;
		do {
			menuyuGoster();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Lütfen seçiminizi giriniz (1-7) : ");
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				System.out.println("Kare alan hesaplama: ");
				System.out.println("Lütfen karenin kenarını giriniz: ");
				int kareKenarAlan = scanner.nextInt();
				System.out.println("Karenin alanı = " + (kareKenarAlan * kareKenarAlan));
				break;

			case 2:
				System.out.println("Kare çevre hesaplama: ");
				System.out.println("Lütfen karenin kenarını giriniz: ");
				int kareKenarCevre = scanner.nextInt();
				System.out.println("Karenin çevresi = " + (4 * kareKenarCevre));
				break;

			case 3:
				System.out.println("Dikdörtgen alan hesaplama: ");
				System.out.println("Dikdortgenin kısa kenarını giriniz: ");
				int dikdortgenKisaKenarAlan = scanner.nextInt();
				System.out.println("Dikdortgenin uzun kenarını giriniz: ");
				int dikdortgenUzunKenarAlan = scanner.nextInt();
				System.out.println("Dikdörtgenin Alanı = " + (dikdortgenKisaKenarAlan * dikdortgenUzunKenarAlan));
				break;

			case 4:
				System.out.println("Dikdörtgen çevre hesaplama: ");
				System.out.println("Dikdortgenin kısa kenarını giriniz: ");
				int dikdortgenKisaKenarCevre = scanner.nextInt();
				System.out.println("Dikdortgenin uzun kenarını giriniz: ");
				int dikdortgenUzunKenarCevre = scanner.nextInt();
				System.out.println("Dikdörtgenin Çevresi = " + 2 * (dikdortgenKisaKenarCevre + dikdortgenUzunKenarCevre));
				break;

			case 5:
				System.out.println("Daire alan hesaplama: ");
				System.out.println("Dairenin yarıçapını giriniz: ");
				int daireYaricapAlan = scanner.nextInt();
				System.out.println("Dairenin Alanı = " + (3.14) * (daireYaricapAlan * daireYaricapAlan));
				break;

			case 6:
				System.out.println("Daire Çevre hesaplama: ");
				System.out.println("Dairenin yarıçapını giriniz: ");
				int daireYaricapCevre = scanner.nextInt();
				System.out.println("Dairenin Çevresi = " + (3.14) * (daireYaricapCevre * 2));
				break;

			case 7:
				System.out.println("Hoşçakalın");
				break;

			default:
				System.out.println(" 1-7 arasında bir değer giriniz");
				break;
			}

		} while (secim != 7);
	}

}
