package com.dorukbiyikli;


import java.util.Scanner;

public class MetodOrnek4 {

	private static void menuyuGoster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*   Hesap Makinesi  *");
		System.out.println("*                   *");
		System.out.println("*********************");
		System.out.println("1. Toplama");
		System.out.println("2. Çıkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. Çıkış");
	}

	public static void main(String[] args) {

		int secim = 0;

		do {

			try {
				menuyuGoster();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Lütfne seçiminizi giriniz (1-5) : ");
				secim = scanner.nextInt();

				switch (secim) {
				case 1:
					System.out.println("Toplama işlemi:");
					System.out.println("Lütfen 1. sayıyı giriniz: ");
					int sayi1 = scanner.nextInt();
					System.out.println("Lütfen 2.sayıyı giriniz: ");
					int sayi2 = scanner.nextInt();
					System.out.println("Sonuç= " + (sayi1 + sayi2));
					break;
				case 2:
					System.out.println("Çıkarma işlemi:");
					System.out.println("Lütfen 1. sayıyı giriniz: ");
					int sayi3 = scanner.nextInt();
					System.out.println("Lütfen 2.sayıyı giriniz: ");
					int sayi4 = scanner.nextInt();
					System.out.println("Sonuç= " + (sayi3 - sayi4));
					break;
				case 4:
					System.out.println("Bölme işlemi:");
					System.out.println("Lütfen 1. sayıyı giriniz: ");
					int sayi5 = scanner.nextInt();
					System.out.println("Lütfen 2.sayıyı giriniz: ");
					int sayi6 = scanner.nextInt();
					System.out.println("Sonuç= " + (sayi5 / sayi6));
				case 3:
					System.out.println("Çarpma işlemi:");
					System.out.println("Lütfen 1. sayıyı giriniz: ");
					int sayi7 = scanner.nextInt();
					System.out.println("Lütfen 2.sayıyı giriniz: ");
					int sayi8 = scanner.nextInt();
					if (sayi7 > 10000 && sayi8 > 10000) {
						throw new CarpmaLimitException();
					}
					System.out.println("Sonuç= " + (sayi7 * sayi8));
				case 5:
					System.out.println("Hoşçakalın");
					break;
				default:
					System.out.println("Hatalı seçim yaptıonız, girdiğiniz değer 1-5 aralığında olmalı!");
					break;
				}

			} catch (ArithmeticException e) {
				System.out.println("Bölme hatası: Bir sayı sıfıra bölünemez!");
			} catch (CarpmaLimitException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (secim != 5);

	}

}
