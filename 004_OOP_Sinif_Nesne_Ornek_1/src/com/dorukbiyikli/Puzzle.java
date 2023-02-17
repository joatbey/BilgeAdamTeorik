package com.dorukbiyikli;

public class Puzzle {


	// static değişken 
	public static final String tur = 	"Oyuncak" ; 
	
	// üye değişkenler 
	public String adi ; 
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;
	
	public String puzzleBilgileriniGetir() {
		String metin = "Ad: "+ adi + " Marka: "+ marka+ " Parca sayisi: "+ parcaSayisi+ " stok miktarı : " + stokMiktari;
		return metin;
	}
}
