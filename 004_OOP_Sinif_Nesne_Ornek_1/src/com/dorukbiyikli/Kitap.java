package com.dorukbiyikli;


public class Kitap {
	//static değişken
	public static final String tur = "Kitap";
	//sinif uye degiskenkleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;	
	public int stokMiktarı;
	
	public String kitapBilgileriniGetir() {
		String kitapBilgileri =  "Ad: "+ ad + " Yazar: "+ yazarAdi+ " Sayfa sayisi: "+ sayfaSayisi + " Stok miktarı: "+ stokMiktarı ;
		return kitapBilgileri;
	}
	

}
