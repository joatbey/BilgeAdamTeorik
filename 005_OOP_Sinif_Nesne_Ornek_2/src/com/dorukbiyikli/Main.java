package com.dorukbiyikli;

import com.alikaya.Paralelkenar;

public class Main {

	public static void main(String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.uzunKenar = 10;
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 9;
		dikdortgen2.uzunKenar = 15;
		
		System.out.println("dikdörtgen1'in alanı : "+ dikdortgen1.alanHesapla());
		System.out.println("dikdörtgen2'nin alanı : "+ dikdortgen2.alanHesapla());
		

		Kare kare1 = new Kare();
		kare1.kenar = 10 ;
		System.out.println("kare1 alan : " + kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar = 20 ;
		System.out.println("kare2 alan : " + kare2.alanHesapla());
	
		
		// alinin paralelkenar classını kullanmak istiyoruz yani başka bir package içindeki class.
		Paralelkenar paralelkenar1 = new Paralelkenar();
	//	paralelkenar1.kenarUzun = 10;  // ali burada değişkenlerini public int tanımlamazsa kullanamayız başka package içinden...
		
		
		
		
	}
	
}
