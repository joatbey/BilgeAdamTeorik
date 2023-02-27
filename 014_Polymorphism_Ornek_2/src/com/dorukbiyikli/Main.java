package com.dorukbiyikli;

public class Main {

	public static void hayvani3kezKonustur(Hayvan h) {
		System.out.println("\n ---- Hayvan 3 kez konusuyor... ----\n");
		for (int i = 0 ; i <3 ; i++) {
			h.sesCikar();
		}
		
	}
	
	
	public static void main(String[] args) {

		Kedi tekir = new Kedi("Tekir", 3 ,32) ; // Kedi() ile hata verir (String,int,int) olmalı çünkü tek constructor o ... 
		
//		System.out.println(tekir.getAd() +" "+ tekir.getKilosu() +" " + tekir.getUzunluk());
//		System.out.println(tekir);// com.dorukbiyikli.Kedi@5ca881b5 constructoru yazmadan böyle.
//		//extend edilende var kendi sınıfında yoksa böyle : 
//		System.out.println(tekir);//Hayvan [ad=Tekir, kilosu=3, uzunluk=32] üst sınıfın toStingine gitti
//		// kendi sınıfına da ekleyince toString:
//		System.out.println(tekir);//Kedi [getAd()=Tekir, getKilosu()=3, getUzunluk()=32]
		tekir.sesCikar();
		
		Kopek karabas = new Kopek("Karabas ", 7 ,75);
		karabas.sesCikar();
		
		Kus tweety = new Kus(" Tweety" , 1 , 4);
		tweety.sesCikar();

		
		System.out.println("************");

		
		// Polymorphism buraya kadar yok. buraya kadar yalnızca inheritance var.
		//Polymorphismin çok güzel örneği
		// mülakatlarda polymorhismi anlatmak için çok iyi.
		Hayvan hayvan;
		hayvan = new Kedi("Sylvester" ,4,50);
		hayvan.sesCikar();//Miyav Miyav!

		hayvan = new Kopek("Lassie",5,70);
		hayvan.sesCikar();//Hav Hav!

		hayvan = tweety;
		hayvan.sesCikar();//Cik Cik!


		Main.hayvani3kezKonustur(tekir);
		Main.hayvani3kezKonustur(karabas);
		Main.hayvani3kezKonustur(hayvan); // burada tweety  geliyor çüknü yukarıda hayvan = tweety dedik.
		hayvan = tekir ; 
		Main.hayvani3kezKonustur(hayvan); // şimdi tekir gelip miyavlıyor.
		
	}

} 
