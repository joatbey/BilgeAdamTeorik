package com.dorukbiyikli;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {

		// aslında ifdeki fordaki gibi syntax

		/*
		 * koşul içindeki kod bloğunda koşulun devam edip etmeme durumunu
		 * değiştirebilirsiniz. for'dan farkı bu. While'da koşul tek bişi koşul
		 * değiştirilecek kodun içinde
		 * 
		 * //
		 * 
		 * while (condition) { //kodlar }
		 * 
		 */

		int sayi = 1;
		while (sayi < 5) {
			System.out.println(sayi);
			sayi++;
		}

		// döngü kaç kere dönecek belliyse for kullanın
		// yok değişecekse while ya da do while kullanın

		/*
		 * boolean alarmDurumu = false; while (alarmDurumu==false) { //sensör durumunu
		 * kontrol et if(sensorSicaklik >=70) { alarmDurumu = true; } //1 sn bekle kodu
		 * bi daha execute ederken 70i geçecek . alarmDurumu true olacak sonra while
		 * döngüsünden çıkacak alttaki satırda alarm verme kodu çalışacak.
		 * 
		 * } // ALARM VER!
		 */
		System.out.println("************************");
		//

		int rakam = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen 1 sayı giriniz :");
		while (rakam != 0) {

			System.out.println(rakam + " 'n karesi: " + rakam * rakam); // rakam bu satırda initialize ettiğim 1 için
																		// yazıyor. bunu bi aşağıda çözeceğiz.
			rakam = input.nextInt();

		}
		System.err.println("ÇIKIŞ");

		int rakam1 = 0;
		// Scanner input = new Scanner(System.in); // bu profesyonel bi çözüm. while
		// conditionu içinde parantez içinde olmak kaydıyla (parantez içinde integer
		// olacak)
		System.out.println("Lütfen 1 sayı giriniz :");
		while ((rakam1 = input.nextInt()) != 0) {
			System.out.println(rakam1 + " 'n karesi: " + rakam1 * rakam1);
			System.out.println("Lütfen bir sayı giriniz :");
		}
		System.err.println("ÇIKIŞ");

		System.out.println("************************");

		// do while dongüsü
		// do while döngüsü içindeki kısım en az 1 kez mutlaka çalışır. Daha sonra
		// koşula göre çalışır.
		//
		/*
		 * 
		 * do {
		 * 
		 * 
		 * } while (condition);
		 * 
		 */

		int sayac = 0;

		do { // kod bloğu conditiona bakmaksızın 1 kez çalışır. ondan sonra normal while loop
				// gibi çalışıyor. yani koşul true oldukça çalışıyor dönüyor.
			System.out.println(sayac);
			sayac++; // sayac en son 5 e ulaştı ve dongüye tekrar girmedi.

		} while (sayac < 5);

		System.out.println("************************");

		// Soru: do while ile çöz kullanıcı 0'a basana kadar kullanıcınun girdiği
		// sayının karesini ekrana yazdır. 0 ile döngüden çık.
		int num = 0;

		do {
			System.out.println("Bir sayı giriniz: ");
			num = input.nextInt();
			if (num==0)
				break;						// break sayesinde döngüyü kırıp çıkarım 0da 
			System.out.println(num * num);

		} while (num != 0);
		System.err.println("ÇIKIŞ DO WHILE");
		
		System.out.println("************************");
		
		
		
	}

}
