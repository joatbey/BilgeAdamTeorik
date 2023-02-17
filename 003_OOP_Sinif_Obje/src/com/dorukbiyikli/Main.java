package com.dorukbiyikli;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ilk anahtar nesnemizi oluşturuyoruz:

		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "Mavi";
		anahtar1.no = 10;
		anahtar1.ad = "Benim Anahtarım";

//		System.out.println("ad: " + anahtar1.ad + "\nrenk: " + anahtar1.renk + "\nno: " + anahtar1.no + " uzunluk :"
//				+ anahtar1.uzunluk + "\n");
//		
		System.out.println("ad: " + anahtar1.ad + "\nrenk: " + anahtar1.renk + "\nno: " + anahtar1.no + " uzunluk :"
				+ Anahtar.uzunluk + "\n");// uzunluk hepsi için 10 çünkü statik int olarak tanımladık böyle
											// nesne.özellik şeklinde değil de Class.uzunluk diye yapabiliriz...

		// 2. bir anahtar nesnesi oluşturuyorm

		Anahtar anahtar2 = new Anahtar(); // nesne adları da unique aynı değişken gibi
		anahtar2.renk = "Kırmızı";
		anahtar2.no = 12;
		anahtar2.ad = "Kardeşimin Anahtarı";

		anahtar2.renk = "Sarı";

//		System.out.println("ad: " + anahtar2.ad + "\nrenk: " + anahtar2.renk + "\nno: " + anahtar2.no + " uzunluk :"
//				+ anahtar2.uzunluk + "\n");
		System.out.println("ad: " + anahtar2.ad + "\nrenk: " + anahtar2.renk + "\nno: " + anahtar2.no + " uzunluk :"
				+ Anahtar.uzunluk + "\n");

		// 3. anahtar nesnesi
		Anahtar anahtar3 = new Anahtar(); // nesne adları da unique aynı değişken gibi
		anahtar3.renk = "Yeşil";
		anahtar3.no = 15;
		anahtar3.ad = "Deponun Anahtarı";

//		System.out.println("ad: " + anahtar3.ad + "\nrenk: " + anahtar3.renk + "\nno: " + anahtar3.no + " uzunluk :"
//				+ anahtar3.uzunluk + "\n");
		System.out.println("ad: " + anahtar3.ad + "\nrenk: " + anahtar3.renk + "\nno: " + anahtar3.no + " uzunluk :"
				+ Anahtar.uzunluk + "\n");
// 		statik bir metdou böyle kullanıyoruz:
		Anahtar.uzunluguEkranaYaz();

		// nonstatik olunca nesne adı.metod yazılır.
		anahtar1.bilgilerEkranaYaz();
		anahtar2.bilgilerEkranaYaz();
		anahtar3.bilgilerEkranaYaz();

		// peki böyle yazılır mı ?
		// Hayır
		// Anahtar.bilgilerEkranaYaz(); // classa ait değil öyle olsa statik denirdi
		// zaten
		// Nesneye ait bir method. çünkü üye özellikler var...
		// kalıp anahtar analojisi ile kalıbın rengi yok...

		// Nesnelerden oluşan diziler tamsayılardan ya da stringlerden oluşan dizilerden
		// farksız çalışıyor...

		int[] sayilarDizisi = { 2, 3, 4, 5 };
		System.out.println(sayilarDizisi[0]);
		for (int i = 0; i < sayilarDizisi.length; i++) {
			System.out.println(sayilarDizisi[i]);
		}

		Anahtar[] anahtarDizisi = { anahtar1, anahtar2, anahtar3 };
		for (int i = 0; i < anahtarDizisi.length; i++) {
			System.out.println(anahtarDizisi[i].ad + " " + anahtarDizisi[i].no + " " + anahtarDizisi[i].renk);
		}
		// yukardaki satırı method kullanarak daha kolay yazabiliriz.
		System.out.println();

		for (int i = 0; i < anahtarDizisi.length; i++) {
			anahtarDizisi[i].bilgilerEkranaYaz();
		}
		System.out.println();

		// aynısını for each ile yazdır:
		for (Anahtar anahtarlaaaar : anahtarDizisi) { // anahtarlaaaar bir iterate edecek şey ismi anahtar nesnesi
														// değil...
			anahtarlaaaar.bilgilerEkranaYaz();
		}

		Anahtar anahtar4 = new Anahtar();
		Scanner scanner = new Scanner(System.in);
		int z = scanner.nextInt(); // Scanner classindan scanner nesnesinin bir methodu nextInt()
		Random random = new Random();
		int x = random.nextInt(100);

	}

}
