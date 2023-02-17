package com.dorukbiyikli;

import java.util.Arrays;

public class Soru2 {

	public static void ekranaYaz() {
		for (int i = 34; i <= 97; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int returnEt() { // int return edeceği için void değil int
		int sayac = 0; // initialize hatası vermesin diye ayrıca sayac ifle sınırlı scopeta olmasın
						// diye
		for (int i = 34; i <= 97; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		System.out.println();
		return sayac; // for döngüsünün dışında
	}

	public static int returnEt2() { // int return edeceği için void değil int
		int sayac = 0; // initialize hatası vermesin diye ayrıca sayac ifle sınırlı scopeta olmasın
						// diye
		for (int i = 34; i <= 97; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		System.out.println();
		return sayac; // for döngüsünün dışında
	}

	public static int[] returnEtDizi() { // birden fazla şey return etsin istersek bir dizi return edebiliriz.
		int sayac = 0;
		int toplam = 0;
		for (int i = 34; i <= 97; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// System.out.print(i + " ");
				toplam += i;
				sayac++;
			}
		}
		System.out.println();
		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi[0] = sayac;
		sonuclarDizisi[1] = toplam;
		return sonuclarDizisi;
	}

	public static int[] returnEtParametreli(int sayi1, int sayi2) { // parametrelerle sınırları belirleyeceğiz
		int sayac = 0;
		int toplam = 0;
		for (int i = sayi1; i <= sayi2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// System.out.print(i + " ");
				toplam += i;
				sayac++;
			}
		}
		System.out.println();
		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi[0] = sayac;
		sonuclarDizisi[1] = toplam;
		return sonuclarDizisi;
	}

	public static int[] returnEtDiziParametreli(int[] sayilar) { // parametrelerle sınırları belirleyeceğiz
		int sayac = 0;
		int toplam = 0;
		for (int i = sayilar[0]; i <= sayilar[1]; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// System.out.print(i + " ");
				toplam += i;
				sayac++;
			}
		}
		System.out.println();
		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi[0] = sayac;
		sonuclarDizisi[1] = toplam;
		return sonuclarDizisi;
	}

	public static void main(String[] args) {
		// Soru1:
		// 34 ile 97 arasında bunlar dahil 3'e veya 5'e tam bölünebilen tüm sayıları
		// ekrana yazdıran bir metod yazınız
		// ekranaYaz();
		// System.out.println();
		// soru2: metod bunları return etsin
		// returnEt();
		System.out.println();

		System.out.println(
				"34 ile 97 arasında bunlar dahil 3'e veya 5'e tam bölünebilen tüm sayıların adedi: " + returnEt());

		// Soru2 : 34 ile 97 arasında bunlar dahil 3'e ve 5'e tam bölünebilen tüm
		// sayıları
		// ekrana yazdıran bir metod yazınız return de etsin
		System.out.println(
				"34 ile 97 arasında bunlar dahil 3'e ve 5'e tam bölünebilen tüm sayıların adedi: " + returnEt2());

		System.out.println("[sayac, toplam ] şeklinde yazdıralım: " + Arrays.toString(returnEtDizi())); // böyle direkt
																										// diziyi print
																										// edebiliyoruz
		// ya da böyle indisleri yazdırabiliriz.
		int[] dizi;
		dizi = returnEtDizi();
		System.out.println("sayac: " + returnEtDizi()[0]);
		System.out.println("toplam: " + returnEtDizi()[1]);

		// ya da böyle for döngüsüyle array kullanabiliriz..

		
		for (int sayi : dizi) {
			System.out.println(sayi);
			}
		
		
			// Soru:
			int[] dizi2;
			int[] aralikDizisi = { 34, 97 };
			dizi2 = returnEtDiziParametreli(aralikDizisi);
			for(int sayi : dizi2) {
				System.out.println(sayi);
			}
		}

	}


