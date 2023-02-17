package com.dorukbiyikli;

public class Otomobil {

	public static String ARAC_TIPI = "Kara Aracı";
	
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesnete ait özellikler
	//üye özellikler :
	public String marka; // String nesneleri null olarak initialize edilir.
	public String model; // String nesneleri null olarak initialize edilir.
	public int yil; 	 // Sayisal veri tipleri 0 olarak initialize edilir.
	public int aracinKm; // Sayisal veri tipleri 0 olarak initialize edilir.
	
	public Motor motor; // Otomobil sınıfının içinde farklı bir sınıfın nesnesini (Motor sınıfının nesnesini) üye değişken olarak tutuyoruz
	
	
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka:"+ this.marka + " Model:" + this.model + " Yıl:"+ this.yil+ " Aracın kmsi :"+ this.aracinKm+ " "+ Otomobil.ARAC_TIPI);
	// buraya this eklemek zorunda değildik... alttaki örnekte ambiguity yaratıyor. burada böyle de kullanılabilir diye gösterdik...
		this.motor.motorBilgileriniYazdir();
	}

	public void araciSur(int km) {
		System.out.println("Araç "+ km+ " km yol yapıyor...");
		aracinKm += km; //this.aracinKm += km ;
	}
	
	public void aracYilBilgisiDegistir(int yil) {
		//yil = yil; // ambiguity var çünkü parametre ismi de yil 
		this.yil = yil ; // bu kullanım parametreyi de ayni isimle kullanmak için
		//this yazılan şeyler üye değişkenler
	}
}
