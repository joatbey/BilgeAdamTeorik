package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {
		// 1. OtoGaleri nesnemiz:
		OtoGaleri kardeslerOtoGaleri = new OtoGaleri("Kardeşler Oto Galeri", 5);
		Otomobil otomobil1 = new Otomobil("Opel", "Corsa", 2018, 124000, new Motor(1000, "ADQWDQ", 7), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);
		Otomobil otomobil2 = new Otomobil("Opel", "Astra", 2019, 153000, new Motor(1000, "ASFASQ", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);
		Otomobil otomobil3 = new Otomobil("Audi", "A2", 2019, 153000, new Motor(1000, "ASFASQ", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil3);
		Otomobil otomobil4 = new Otomobil("Audi", "Q3", 2018, 153000, new Motor(1000, "ASFASQ", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil4);
		Otomobil otomobil5 = new Otomobil("BMW", "3.20", 2019, 153000, new Motor(1000, "ASFASQ", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil5);
//		Otomobil otomobil6 = new Otomobil("BMW", "5.20", 2019, 153000, new Motor(1000, "ASFASQ", 9), 50);
//		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);
//		
		//kardeslerOtoGaleri.galeridekiOtomobilleriListele(); // galeri kapasitesi full , arac eklenemedi çünkü 5lik bir obje yarattık

		kardeslerOtoGaleri.galeridekiOtomobilleriListele();
		System.out.println("galerideki anlık otomobil sayısı: " + kardeslerOtoGaleri.getGaleridekiOtomobilSayisi());
		
		
		// 2. OtoGaleri nesnemiz:
		OtoGaleri galeriSupercar = new OtoGaleri("Galeri Supercar", 100);
		Otomobil otomobil7 = new Otomobil("Fiat", "Egea", 2017, 199000, new Motor(1400, "AsadadWDQ", 4), 50);
		Otomobil otomobil8 = new Otomobil("Renault", "Clio", 2013, 299000, new Motor(1400, "qeqwdWDQ", 3), 50);
		
		galeriSupercar.galeriyeOtomobilEkle(otomobil7);
		galeriSupercar.galeridekiOtomobilleriListele();
		galeriSupercar.galeriyeOtomobilEkle(otomobil8);
		galeriSupercar.galeridekiOtomobilleriListele();
		
		
		// find count :
		System.out.println();
		System.out.println(kardeslerOtoGaleri.getGaleriAdi() + " galerisindeki Audi otomobil sayısı: "+ kardeslerOtoGaleri.findCount("audi"));
		System.out.println(kardeslerOtoGaleri.getGaleriAdi() + " galerisindeki BMW otomobil sayısı: "+ kardeslerOtoGaleri.findCount("bmw"));
		System.out.println(galeriSupercar.getGaleriAdi() + " galerisindeki Renault otomobil sayısı: "+ galeriSupercar.findCount("renault"));

		Otomobil otomobil9 = new Otomobil("Renault", "Fluence", 2017, 229000, new Motor(1500, "AdqeqwdWDQ", 3), 50);
		galeriSupercar.galeriyeOtomobilEkle(otomobil9);
		System.out.println(galeriSupercar.getGaleriAdi() + " galerisindeki Renault otomobil sayısı: "+ galeriSupercar.findCount("renault"));

		
		//search :
		System.out.println("\n*******search sonuclari********\n");
		Otomobil[] sonuclarDizisi =galeriSupercar.search("renault"); // print edersek: [Lcom.dorukbiyikli.Otomobil;@24d46ca6 
		for(Otomobil oto : sonuclarDizisi) {
			System.out.println(oto);
		}
		

		System.out.println("\n\n **** silme işlemi *** \n\n ");
		
//		galeriSupercar.galeridekiOtomobilleriListele();
//		galeriSupercar.galeridenOtomobilSil(0);
//		galeriSupercar.galeridekiOtomobilleriListele();
		
		galeriSupercar.galeridekiOtomobilleriListele();
		galeriSupercar.galeridenOtomobilSil2(0); // burada galeridenOtomobilSil2 ile kullanınca diziyi kısaltmadım sonuna null yazdırdı...
		galeriSupercar.galeridekiOtomobilleriListele();
		
	}

}
