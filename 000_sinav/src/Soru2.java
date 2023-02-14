

public class Soru2 {

	public static int Sayici(int[] dizi) {
		int sayac = 0;
		int sayi = -1;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {

				if ((i != j) && (dizi[i] == dizi[j])) {
					sayi = dizi[i];
					sayac++;

				}
			}
			if (i==1) {i=dizi.length;};
		}
		if (sayi != -1) {
			System.out.println("ilk tekrarlayan sayi: " + sayi + " ve bu sayıdan " + (sayac+1) + " tane var...");
		}
		return 0;
	}

	public static void main(String[] args) {
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 23, 18, 2, 0, 7,7 };
		int sayiDizisi1[] = { 9, 7, 5, 3, 7,7,7,7,7, 7, 23, 18, 2, 0, 7,7 };
		int sayiDizisi2[] = { 9, 7, 5, 3, 7, 7, 23,7,7,7,7,7,7,7,7,7,7, 18, 2, 0, 7,7 };
		Sayici(sayiDizisi);
		Sayici(sayiDizisi1);
		Sayici(sayiDizisi2);
	
	}

}
