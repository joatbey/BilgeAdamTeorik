package com.dorukbiyikli;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("Ali", "Töz", 451, 0);
		Ogrenci ogrenci3 = new Ogrenci("Veli", "Köz", 452, 0);
		Ogrenci ogrenci4 = new Ogrenci("Mehmet", "Öz", 453, 0);

		Sinif sinif1 = new Sinif("1A","Zemin Kat 101 nolu oda ", new ArrayList<Ogrenci>() );
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
		//sinif1.sinifaOgrenciEkle(ogrenci4);
		sinif1.getOgrencilerArrayList().add(ogrenci4);
		sinif1.siniftakiOgrenciListesiniYazdir();
		
		//
		Sinif sinif2 = new Sinif("1B", "C Blok - 101");
		Ogrenci ogrenci5 = new Ogrenci("Kaan", "Emre", 500, 0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
		sinif2.siniftakiOgrenciListesiniYazdir();
		
		//
		Sinif sinif3 = new Sinif("1C", "Ana bina 102 nolu oda");
		Ogrenci ogrenci6 = new Ogrenci ("Bartu", "Emre", 800,0);
		Ogrenci ogrenci7 = new Ogrenci ("Nihal", "Kaya", 801,0);
		Ogrenci ogrenci8 = new Ogrenci ("Özgür", "Emre", 802,0);
		Ogrenci ogrenci9 = new Ogrenci ("Bartı", "Emre", 803,0);
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.siniftakiOgrenciListesiniYazdir();
		sinif3.siniftanOgrenciCikar(ogrenci7);
		sinif3.siniftakiOgrenciListesiniYazdir();
		sinif3.sinifaOgrenciEkle(new Ogrenci ("Şafak","Taş",803,0)); // böyle de eklerim. ama bu şekilde ekleyince bir referansı olmayacak.
		// indeksini bulup şafağın öyle çıkarabiliriz...
		//isme göre bi search yapan bir loop method yazacağız indeks return edecek mesela bize...
		//
		sinif3.siniftakiOgrenciListesiniYazdir();

		sinif3.siniftanOgrenciCikar(803); // okul numarası ile silelim: method overloading ile int parametre alan bi method yazalım sinifa 
		// create method yoluyla yapalım kolay olsun
		// bu onemli ama
		
		sinif3.siniftakiOgrenciListesiniYazdir();

		sinif3.siniftanOgrenciCikar(12312);//12312 numaralı ogrenci bu sınıfta bulunamadı!
		
		
		
	}

}
   