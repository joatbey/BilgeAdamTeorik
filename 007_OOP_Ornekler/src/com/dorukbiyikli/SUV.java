package com.dorukbiyikli;

public class SUV {

	public String marka; // String nesneleri null olarak initialize edilir.
	public String model; // String nesneleri null olarak initialize edilir.
	public int yil; 	 // Sayisal veri tipleri 0 olarak initialize edilir.
	public int aracinKm; // Sayisal veri tipleri 0 olarak initialize edilir.
	public Motor motor; // Otomobil sınıfının içinde farklı bir sınıfın nesnesini (Motor sınıfının nesnesini) üye değişken olarak tutuyoruz
	
	public String cekisSistemi; 
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka:"+ this.marka + " Model:" + this.model + " Yıl:"+ this.yil+ " Aracın kmsi :"+ this.aracinKm+ " "+ Otomobil.ARAC_TIPI+ " çekiş sistemi:"+this.cekisSistemi);
		this.motor.motorBilgileriniYazdir();
		System.out.println();
	}
	
	
}
