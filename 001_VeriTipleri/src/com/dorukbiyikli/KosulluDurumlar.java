package com.dorukbiyikli;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayı giriniz ");
		int x = input.nextInt();
		
//		// Kullanıcının girdiği sayının pozitif sıfır ya da negatif olduğnu bulalım
//		if(x>0) { 														// koşul (parantezin içi) true ise curly parantezin içindeki kod blokunu çalıştır.
//			System.out.println("Girilen sayı pozitiftir.");
//		}
//		else if(x < 0) {
//			System.out.println("Girilen sayı negatiftir.");
//		}
//		else if (x==0) {
//			System.out.println("Girilen sayı sıfırdır.");
//		}
//		// buraya da if (x<5) { system.out.println("bunu da yaz")} koyarsam bunu da yazar...
//		// if , else if durumlarında biri doğru olursa diğerlerini kontrol etmez. tekrar if yazarsak eder ama.
//		// else if (x<5) { system.out.println("bunu da yaz")} koyarsam bunu yazmaz if else if farkı burada
//		
//		System.out.println("Hoşçakalın");
		
		// girilen sayı 10'a tam bölünür mü bulunuz 
//		if (x % 10 == 0 ) {
//			System.out.println("Girdiğinz sayı 10'a kalansız bölünür. ");
//		}
//		else if (x % 10 != 0){
//		//else kullanırsak ikinci bi koşula bakmadan ilk ifin yanlış olduğu durumda else bloğunun içine her türlü girer.
//			System.out.println("Girdiğiniz sayı 10'a kalansız bölünmez. ");
//		}
//			
		
		
		// örnek soru	
		// Otomobil yaşına göre vergi dilimi hesaplama
		// [0-5] yaş en yüksek dilim , (5-10] orta , 10 + düşük )
//		
//		if (x>=0 && x <= 5) {
//			System.out.println("En yüksek vergi dilimindesiniz. ");
//		}
//		else if (x>5 && x<=10) {
//			System.out.println("Orta vergi dilimindesiniz. ");
//		} 
//		
//		else {
//			System.out.println("Düşük vergi dilimindesiniz. ");
//		}
//			
		
		// x kullanıcının girdiği işlem olsun  1: toplama 2 : çıkarma 3: çarpma 4 bölme başka şeyler yanlış seçim
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Giriş yapınız");
//		int x = input.nextInt() ;
		
//		if (x==1) {
//			System.out.println("toplama");
//		}
//		else if (x==2) {
//			System.out.println("çıkarma");
//		}
//		else if (x==3) {
//			System.out.println("çarpma");
//		}
//		else if (x==4) {
//			System.out.println("bölme");
//		}
//		else {
//			System.out.println("yanlış seçim");
//		}
		
		// bir başka yöntem switch case var switch yazıp ctrl + space yap gelsin elli tane case varsa bu daha iyi elli if yapmaktan3
	
//		
//		switch (x) {
//		case 1 :
//			System.out.println("Toplama");
//			break;
//		case 2 :
//			System.out.println("Çıkarma");
//			break;	
//		case 3 : 
//			System.out.println("Çarpma");
//			break;
//		case 4 : 
//			System.out.println("Bölme");
//			break;
//		default: // else gibi yani 
//			System.out.println("Yanlış seçim");
//			break;
//		}
		
		// kullanıcının girdiği sayıya göre ilgili mevsimi ekrana yazdır
		
		switch (x) {
		case 12,1,2 : // bu multiple case kullanımıjavanın eski versiyonunda yok. java14ten sonra gelmiş ...hangi java versiyonu olduğu 
			System.out.println("Kış");
			break;
		case 3,4,5:
			System.out.println("İlkbahar");
		case 6,7,8:
			System.out.println("Yaz");
		case 9,10,11:
			System.out.println("Sonbahar");
		default:
			System.err.println("Girdiğiniz değer 1-12 arasında olmalı");
			break;
		}
		
		
		
		
	}

}
