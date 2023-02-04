package com.dorukbiyikli;

import java.awt.SystemColor;
import java.util.Scanner;

public class DongulerFor {

	public static void main(String[] args) {

		// bir şeyi n kere yazdıracaksam yapacaksam , kaç kez yaptığımı saymam lazım.
		// bunu kontrol eden bi değişken lazım.
		// for döngüsünde i ile j ile tutulur bu genelde isim ama yani başka bişi de
		// olabilir.

		// for loop
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}

//		// *****************************************
//		for (int sayac = 0; sayac < 3; sayac++) { // for(sayac initializing ; sayac condition ; increment){ bu
//													// conditionlar doğru olduğu kez döngü olarak execute edilecek kod}
//			System.out.println("Hello Java"); // mesela for() ; yaparsan yanlışlıkla, hata vermeden patlar
//												// o zaman hiçbir işe yaramayan bir satıra dönüşür
//		}
//
//		// *****************************************
//		for (int i = 0; i < 3; i++) // döngüden sonra yazacağınız tek satırda curly parantez kullanmayabilirsin.ama kullan yani. kullanılmadığında da alttaki tek satırı yapacağını bil. o zaman anlayacağı 3 kez merhaba 1 kez dünya yazmak olacak
//									// bu güzel bi sınav sorusu olur syntax bilgisi ölçer.
//			System.out.println("Merhaba");
//		System.out.println("Dünya");
//
//		
//		// forların içinde i kullanıyorsun bunun scope'u döngü içinde limitli.
//		// ama global variable olarak i tanımladıysan bir yerde o zaman işler karışır.    ambiguity olur. y
//		
//		System.out.println("*********");
//		
//		int x=0; 
//		if(x>1)
//			System.out.println("1");
//		System.out.println("0");
//		// üstteki kodda sadece 0  yazar iflerde de aynı mantık var yani süslü parantez olayı.
//		
//		//
//		for( ; ; ) {
//			System.out.println("sonsuz kere yazdırır infinite loop");
//		}
//		//*****************
//		
		// 1den 10a sayıların toplamını bul
		int toplam = 0; // global var toplam initialize
		for (int i = 1; i <= 10; i++) {
			toplam = toplam + i;
			System.out.println(i + " 'ye kadar sayıların toplamı : " + toplam);
		}
		System.out.println("başta index limiti 10 demiştik sonunda toplam: " + toplam);
//		//*****************

// 		* * * * 
//		* * * * 
//		* * * *  ekrana nu şekli yazdır

		for (int i = 1; i <= 12; i++) {
			System.out.print("* ");// print println değil!!!!
			if (i % 4 == 0) {
				System.out.println();// alt satıra
			}
		}

//		//*****************
//		for döngüsü içinde index değiştirmek önerilmez for(int i = ......) gibi ttanımla sınırla arttır ama loopun içinde elleme

		// eğer kod bloğu içinde index(sayaci) değiştirmek gereken durumlar varsa
		// "while" ya da "do while" döngüleri kullanın...
		for (int i = 0; i < 11; i++) {
			i = 10;
			System.out.println("test"); // 1 kere yazar eğer i <= 11 olsa sonsuz kere yazardı.
		}

//		//*****************

		// Soru: kullanıcıdan 2 sayı alın
		// başlangıç ve bitiş sayıları arasında 7ye bölünebilen satıları yazın

		Scanner input = new Scanner(System.in);
		System.out.println("1. sayı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.println("2. sayı giriniz: ");
		int sayi2 = input.nextInt();

		if (sayi1 <= 0 || sayi2 <= 0) {
			System.out.println(" sayilar '0' olamaz");
		} else {
			for (int i = sayi1; i < sayi2; i++) {
				if (i % 7 == 0) {
					System.out.println(i);

				}
			}
		}

	}

}
