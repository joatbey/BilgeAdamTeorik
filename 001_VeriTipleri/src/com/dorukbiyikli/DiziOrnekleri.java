package com.dorukbiyikli;

public class DiziOrnekleri {

	public static void main(String[] args) {
		// Soru: dizinin ortalamasını int cinsinden bulun
		
		int[] dizi = {-4,7,12,78,-32,122,0,9};
		int toplam = 0;
		
		for (int i=0; i< dizi.length ; i++) {
			toplam = toplam+dizi[i]; // toplam += dizi[i] diye de olur
			}
		System.out.println("ortalama : " + (toplam / dizi.length));
		System.out.println("*************************************************");
		
		//int eşitlerken yuvarlama yapması: 
		int x = 20;
		int g = x/3;
		System.out.println(g); // 6 küsür ama 6 yazıyor.
		int y=3;
		double v = x/y ;
		System.out.println(v); // yine küsüratı kaybetti 6.0 yazdı.
		double v2 = x/(y*1.0) ; 
		System.out.println(v2);  //6.666666666666667 yazdırdı
		
		
		System.out.println(Math.round(v2)); // böyle bi method var yakına yuvarlıyor 7 veriyor. Math kütüphanesnde
		System.out.println(Math.round(1.4));
		System.out.println("*************************************************");

		//Soru:  dizi içindeki en büyük sayıyı bulun
		// ilk sayıyı en büyük kabul edip sonraki sayı ile kıyaslayalım
		// yeni sayı büyükse değiştir değilse elleme
		//		int[] dizi = {-4,7,12,78,-32,122,0,9};
		// bu da güzel soru sorulur
		
		int enBuyukSayi = dizi[0];
		for(int i = 0; i< dizi.length; i++) {
			if(enBuyukSayi< dizi[i]) {
				enBuyukSayi = dizi[i];
			}
		}
		System.out.println("en büyük sayı: "+ enBuyukSayi);
		
		//Soru:  dizi içindeki en küçük sayıyı bulun
		//Soru:  dizi içindeki en küçük sayıyı bulun ve indeksini bulun

		int enKucukSayi = dizi[0];
		int index=0;
		for(int i = 0; i< dizi.length; i++) {
			if(enKucukSayi >  dizi[i]) {
				enKucukSayi = dizi[i];
				 index = i ;
			}
		}
		System.out.println("en küçük sayı: "+ enKucukSayi+ " en kucuk sayının indeksi : " +index);
		System.out.println("*************************************************");


		
	}

}
