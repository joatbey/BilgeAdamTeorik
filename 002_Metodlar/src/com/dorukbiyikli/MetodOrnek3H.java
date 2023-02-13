package com.dorukbiyikli;

import java.util.Scanner;

public class MetodOrnek3H {
	public static void menuyuGoster() {

		System.out.println("********************");
		System.out.println("*                  *");
		System.out.println("*  Hesap Makinesi  *");
		System.out.println("*                  *");
		System.out.println("********************");
		System.out.println("1. Toplama");
		System.out.println("2. Çıkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. Çıkış");

	}

	public static void main(String[] args) {
		
		// do while seçmeli çünkü bi kere yapacağız, çok kere de olabilir.
		
		int secim=0 ;// secimi do while loopunun dışında kullanırsam whileın conditionu olarak kullanabilrim
		do {//bunun içinde tanımlarsam, do'nun kapatan süslü parantezi dışında kalıyor.
			menuyuGoster();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Lütfen seçiminizi giriniz (1-5) : ");
			secim = scanner.nextInt();// yukarda 0 demiştim seçime onun önemi yok çünkü burada alıyoruz
			int x2;
			switch (secim) {
			case 1:
				System.out.println("Toplama işlemi: ");
				System.out.println("Lütfen 1. sayıyı giriniz: ");
				int sayi1 = scanner.nextInt();
				System.out.println("Lütfen 2. sayıyı giriniz: ");
				int sayi2 = scanner.nextInt();
				System.out.println("Sonuç = " + (sayi1 + sayi2));
				break;

			case 2:
				System.out.println("Çıkarma işlemi: ");
				System.out.println("Lütfen 1. sayıyı giriniz: ");
				int sayi3 = scanner.nextInt();
				System.out.println("Lütfen 2. sayıyı giriniz: ");
				int sayi4 = scanner.nextInt();
				System.out.println("Sonuç = " + (sayi3 - sayi4));
				break;

			case 3:
				System.out.println("Çarpma işlemi: ");
				System.out.println("Lütfen 1. sayıyı giriniz: ");
				int sayi5 = scanner.nextInt();
				System.out.println("Lütfen 2. sayıyı giriniz: ");
				int sayi6 = scanner.nextInt();
				System.out.println("Sonuç = " + (sayi5 * sayi6));

				break;

			case 4:
				System.out.println("Bölme işlemi: ");
				System.out.println("Lütfen 1. sayıyı giriniz: ");
				float sayi7 = scanner.nextInt();
				System.out.println("Lütfen 2. sayıyı giriniz: ");
				float sayi8 = scanner.nextInt();
				if (sayi8 == 0) {
					System.out.println("0'a bölemezsiniz.");
				} else {
					System.out.println("Sonuç = " + (sayi7 / sayi8));
				}
				break;

			case 5:
				System.out.println("Hoşçakalın ");
				
				break;

			default:
				System.out.println(" 1-5 arasında bir değer giriniz");
				break;
			}
			
		} while (secim != 5); // secim eğer do nun içinde tanımlanırsa, secim değişkenini while in conditionu olarak kullanamam
		
	}

}
